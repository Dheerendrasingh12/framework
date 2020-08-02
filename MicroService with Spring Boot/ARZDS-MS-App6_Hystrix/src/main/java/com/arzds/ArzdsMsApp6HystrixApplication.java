package com.arzds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker
@SpringBootApplication
public class ArzdsMsApp6HystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArzdsMsApp6HystrixApplication.class, args);
	}

}
