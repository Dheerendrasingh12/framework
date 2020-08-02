package com.arzds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.arzds.config.UserRepo;

@EnableJpaRepositories(basePackageClasses = UserRepo.class)
@SpringBootApplication
public class ArzDsSbSecurityMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArzDsSbSecurityMySqlApplication.class, args);
	}

}
