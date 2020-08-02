package com.arzds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class DsArzSpringBootEurekaServerDependencyConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsArzSpringBootEurekaServerDependencyConsumerApplication.class, args);
	}

}
