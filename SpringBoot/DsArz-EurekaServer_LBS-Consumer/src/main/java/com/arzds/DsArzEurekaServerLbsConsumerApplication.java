package com.arzds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class DsArzEurekaServerLbsConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsArzEurekaServerLbsConsumerApplication.class, args);
	}

}
