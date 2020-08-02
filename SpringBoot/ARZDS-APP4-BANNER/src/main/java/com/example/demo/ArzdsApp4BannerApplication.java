package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ArzdsApp4BannerApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(ArzdsApp4BannerApplication.class);
		application.setBannerMode(Banner.Mode.LOG);
		ConfigurableApplicationContext applicationContext = application.run(args);
		System.out.println(applicationContext.getClass().getName().toString());
	}

}
