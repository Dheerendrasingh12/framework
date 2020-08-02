package com.arzds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan("com")
public class MultipleEnvironmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultipleEnvironmentApplication.class, args);
	}

}
