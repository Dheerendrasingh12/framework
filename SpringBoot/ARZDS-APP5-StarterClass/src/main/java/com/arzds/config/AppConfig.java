package com.arzds.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.arzds.model.Admin;

@Configuration
public class AppConfig {
	@Bean
	public Admin obj() {
		Admin admin = new Admin();
		admin.setAdminId(12);
		admin.setAdminName("ArzDs");
		return admin;

	}
}
