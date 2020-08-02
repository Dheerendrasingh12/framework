/*
 * package com.arzds.configuration;
 * 
 * import org.springframework.batch.core.Job; import
 * org.springframework.batch.core.JobExecutionListener; import
 * org.springframework.batch.core.Step; import
 * org.springframework.batch.core.configuration.annotation.
 * EnableBatchProcessing; import
 * org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
 * import
 * org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
 * import org.springframework.batch.core.launch.support.RunIdIncrementer; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration;
 * 
 * import com.arzds.listener.JobListener; import
 * com.arzds.processor.DataProcessor; import com.arzds.reader.DataReader; import
 * com.arzds.writer.DataWriter;
 * 
 * @Configuration
 * 
 * @EnableBatchProcessing public class BatchConfiguration {
 * 
 * @Autowired private JobBuilderFactory builderFactory;
 * 
 * @Autowired private StepBuilderFactory stepFactory;
 * 
 * @Bean public Step stepA() { return stepFactory.get("stepA").<String,
 * String>chunk(2).reader(new DataReader()).processor(new DataProcessor())
 * .writer(new DataWriter()).build(); }
 * 
 * @Bean public Job jobA() { return builderFactory.get("jobA").incrementer(new
 * RunIdIncrementer()).listener(listener()).start(stepA()) .build(); }
 * 
 * @Bean public JobExecutionListener listener() { return new JobListener(); } }
 */