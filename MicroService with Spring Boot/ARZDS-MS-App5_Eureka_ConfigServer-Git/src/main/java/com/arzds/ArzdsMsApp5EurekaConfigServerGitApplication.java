package com.arzds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ArzdsMsApp5EurekaConfigServerGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArzdsMsApp5EurekaConfigServerGitApplication.class, args);
		System.out.println("Git Config Executed");
	}

}
