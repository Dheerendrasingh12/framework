package com.arzds.configuration;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.arzds.listener.JobListener;
import com.arzds.model.Product;
import com.arzds.processor.DataProcessor;
import com.arzds.reader.DataReader;
import com.arzds.writer.DataWriter;

@Configuration
@EnableBatchProcessing
public class ProductConfig {
	@Autowired
	public JobBuilderFactory builderFactory;
	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	@Bean
	public Step stepA() {
		return stepBuilderFactory.get("stepA").<String, String>chunk(2).reader(new DataReader())
				.processor(new DataProcessor()).writer(new DataWriter()).build();
	}

	@Bean
	public Job jobA() {
		return builderFactory.get("jobA").incrementer(new RunIdIncrementer()).listener(listener()).start(stepA())
				.next(stepB()).build();
	}

	@Bean
	public JobExecutionListener listener() {
		return new JobListener();
	}

	@Bean
	public Step stepB() {
		return stepBuilderFactory.get("stepB").<Product, Product>chunk(2).reader(getReader()).processor(getProcessor())
				.writer(writer()).build();
	}

	/*
	 * @Bean public Job jobB() { return builderFactory.get("jobB").incrementer(new
	 * RunIdIncrementer()).start(stepB()).build(); }
	 */

	@Bean
	public ItemReader<Product> getReader() {
		FlatFileItemReader<Product> reader = new FlatFileItemReader<>();
		reader.setResource(new ClassPathResource("inputData.csv"));
		reader.setLineMapper(new DefaultLineMapper<Product>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("prodId", "prodName", "prodCost");
					}
				});
				setFieldSetMapper(new BeanWrapperFieldSetMapper<Product>() {
					{
						setTargetType(Product.class);
					}
				});
			}
		});
		return reader;
	}

	@Bean
	public ItemProcessor<Product, Product> getProcessor() {
		return (p) -> {
			p.setProdGst(p.getProdCost() * 0.18);

			p.setProdDisc(p.getProdCost() * 0.03);
			return p;
		};
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/arzds");
		dataSource.setUsername("root");
		dataSource.setPassword("root");

		return dataSource;
	}

	@Bean
	public ItemWriter<Product> writer() {
		JdbcBatchItemWriter<Product> batchItemWriter = new JdbcBatchItemWriter<>();
		batchItemWriter.setDataSource(dataSource());
		batchItemWriter.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<Product>());
		batchItemWriter.setSql(
				"INSERT INTO PRODUCT (PID,PNAME,PCOST,PGST,PDISC) VALUES (:prodId, :prodName, :prodCost, :prodGst, :prodDisc)");
		return batchItemWriter;
	}
}
