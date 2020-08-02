package com.arzds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ArzdsMsApp13AdminUiClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArzdsMsApp13AdminUiClientApplication.class, args);
	}

}
