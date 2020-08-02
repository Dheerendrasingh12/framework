package com.arzds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class ArzdsMsApp2EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArzdsMsApp2EurekaServerApplication.class, args);
	
	System.out.println("Eureka Server Executed");}

}
