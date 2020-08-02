package com.arzds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class ArzdsMsApp4EurekaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArzdsMsApp4EurekaConfigServerApplication.class, args);
	System.out.println("Config-Server Executed.");
	}

}
