package com.arzds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
@EnableAdminServer
@SpringBootApplication
public class ArzdsMsApp13AdminUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArzdsMsApp13AdminUiApplication.class, args);
	}

}
