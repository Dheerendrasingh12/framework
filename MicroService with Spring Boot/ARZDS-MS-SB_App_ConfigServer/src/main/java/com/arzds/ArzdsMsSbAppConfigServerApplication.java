package com.arzds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ArzdsMsSbAppConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArzdsMsSbAppConfigServerApplication.class, args);
		System.out.println("Config Server Started");
	}

}
