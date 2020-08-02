package com.arzds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient

@SpringBootApplication
public class ArzdsMsApp3EurekaServerConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArzdsMsApp3EurekaServerConsumerApplication.class, args);
	}

}
