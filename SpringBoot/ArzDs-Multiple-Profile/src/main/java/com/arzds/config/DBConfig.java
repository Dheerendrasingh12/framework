package com.arzds.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DBConfig {
	private String driverClass;
	private String url;
	private String username;
	private String password;

	@Profile("dev")
	@Bean
	public String devDbConnection() {
		System.out.println("Db Connection for Dev Environment");
		System.out.println(driverClass);
		System.out.println(url);
		System.out.println(username);
		return "DB connection for Dev";
	}

	@Profile("prod")
	@Bean
	public String prodDbConnection() {
		System.out.println("Db Connection for Prod Environment");
		System.out.println(driverClass);
		System.out.println(url);
		System.out.println(username);
		return "DB connection for Prod";
	}

	@Profile("uat")
	@Bean
	public String uatDbConnection() {
		System.out.println("Db Connection for Uat Environment");
		System.out.println(driverClass);
		System.out.println(url);
		System.out.println(username);
		return "DB connection for Uat";
	}

	public String getDriverClass() {
		return driverClass;
	}

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
