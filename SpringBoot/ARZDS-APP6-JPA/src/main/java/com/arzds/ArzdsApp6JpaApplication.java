package com.arzds;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ArzdsApp6JpaApplication {

	public static void main(String[] args) {
		SpringApplication application=new SpringApplication(ArzdsApp6JpaApplication.class);
		application.setBannerMode(Banner.Mode.LOG);
		ConfigurableApplicationContext applicationContext=application.run(args);
		
	}

}
