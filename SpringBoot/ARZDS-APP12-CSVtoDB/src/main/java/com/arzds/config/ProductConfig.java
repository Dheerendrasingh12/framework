package com.arzds.config;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.transform.BeanWrapperFieldExtractor;
import org.springframework.batch.item.file.transform.DelimitedLineAggregator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.arzds.listener.ProductListener;
import com.arzds.model.Product;
import com.arzds.processor.ProductProcessor;

@Configuration
@EnableBatchProcessing
public class ProductConfig {
	@Autowired
	private JobBuilderFactory jobFactory;
	@Autowired
	private StepBuilderFactory stepFactory;

	@Bean
	public Step stepC() {
		return stepFactory.get("stepC").<Product, Product>chunk(2).reader(getReader()).processor(new ProductProcessor())
				.writer(getWriter()).build();
	}

	@Bean
	public Job jobC() {
		return jobFactory.get("jobC").incrementer(new RunIdIncrementer()).start(stepC()).build();
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
	public JdbcCursorItemReader<Product> getReader() {
		JdbcCursorItemReader<Product> cursorItemReader = new JdbcCursorItemReader<>();
		cursorItemReader.setDataSource(dataSource());
		cursorItemReader.setSql("SELECT PID, PNAME, PCOST, PGST, PDISC FROM PRODUCT");
		cursorItemReader.setRowMapper(new ProductRowMapper());
		return cursorItemReader;
	}

	private class ProductRowMapper implements RowMapper<Product> {

		@Override
		public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Product product = new Product();
			product.setProdId(rs.getInt("pid"));
			product.setProdName(rs.getString("pname"));
			product.setProdCost(rs.getDouble("pcost"));
			product.setProdGst(rs.getDouble("pgst"));
			product.setProdDisc(rs.getDouble("pdisc"));
			return product;
		}

	}

	
	@Bean
	public FlatFileItemWriter<Product> getWriter() {
		FlatFileItemWriter<Product> writer = new FlatFileItemWriter<>();
		writer.setResource(new ClassPathResource("product.csv"));
		writer.setLineAggregator(new DelimitedLineAggregator<Product>() {
			{
				setDelimiter(",");
				setFieldExtractor(new BeanWrapperFieldExtractor<Product>() {
					{
						setNames(new String[] { "prodId", "prodName", "prodCost", "prodGst", "prodDisc" });
					}
				});
			}
		});
		return writer;
	}
}
