package com.arzds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class ArzDsSpringBootEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArzDsSpringBootEurekaServerApplication.class, args);
	}

}
