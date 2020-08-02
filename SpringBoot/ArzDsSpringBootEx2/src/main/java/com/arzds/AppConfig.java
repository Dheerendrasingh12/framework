package com.arzds;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public CommandLineRunner object() {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				System.out.println("Object 1");
				System.out.println(Arrays.asList(args));
			}
		};
	}

	@Bean
	public CommandLineRunner obj1() {
		return args -> {
			System.out.println("obj1" + Arrays.asList(args));
		};
	}
}
