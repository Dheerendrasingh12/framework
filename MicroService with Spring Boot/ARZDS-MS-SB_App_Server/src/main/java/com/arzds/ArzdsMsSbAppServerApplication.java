package com.arzds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ArzdsMsSbAppServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArzdsMsSbAppServerApplication.class, args);
		System.out.println("Eureka Server Started");
	}

}
