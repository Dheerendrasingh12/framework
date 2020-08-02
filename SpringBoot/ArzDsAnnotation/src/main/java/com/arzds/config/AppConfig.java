package com.arzds.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.arzds.model.Admin;

@Configuration
public class AppConfig {
	@Bean
	public Admin getAdmin() {
		Admin admin = new Admin();
		admin.setAid(12);
		admin.setaName("ArzDS");
		return admin;
	}
}
