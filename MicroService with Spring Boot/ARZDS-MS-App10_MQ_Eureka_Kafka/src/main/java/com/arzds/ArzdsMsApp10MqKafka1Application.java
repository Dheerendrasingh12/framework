package com.arzds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class ArzdsMsApp10MqKafka1Application {

	public static void main(String[] args) {
		SpringApplication.run(ArzdsMsApp10MqKafka1Application.class, args);
		System.out.println("Kaffka Eureka Executed");
	}

}
