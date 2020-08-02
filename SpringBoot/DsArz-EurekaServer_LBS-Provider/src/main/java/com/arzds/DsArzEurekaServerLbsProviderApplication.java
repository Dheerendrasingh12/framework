package com.arzds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.example.ribbonclient.RibbonConfiguration;
@EnableEurekaClient
@SpringBootApplication
@RibbonClient(name = "server", configuration = RibbonConfiguration.class)
public class DsArzEurekaServerLbsProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsArzEurekaServerLbsProviderApplication.class, args);
	}

}
