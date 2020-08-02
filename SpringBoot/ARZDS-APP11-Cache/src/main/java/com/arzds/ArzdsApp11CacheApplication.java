package com.arzds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class ArzdsApp11CacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArzdsApp11CacheApplication.class, args);
	}

}
