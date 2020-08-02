package com.arzds.config;

import java.sql.DriverManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DBConfig {
	@Bean
	public DriverManagerDataSource getDataSoruce() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/arzds");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
}
