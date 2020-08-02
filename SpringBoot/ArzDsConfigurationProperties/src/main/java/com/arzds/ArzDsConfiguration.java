package com.arzds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class ArzDsConfiguration {
	public static void main(String[] args) {
		SpringApplication.run(ArzDsConfiguration.class, args);
	}
}
