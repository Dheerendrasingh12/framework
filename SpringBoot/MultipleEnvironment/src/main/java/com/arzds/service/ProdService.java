package com.arzds.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("UAT")
public class ProdService implements CommandLineRunner {
	@Value("${my.arzds.code}")
	private String code;

	/*
	 * @Override public void executeTast() { // TODO Auto-generated method stub
	 * System.out.println("from Prod Profile"); System.out.println("Code" + code);
	 * 
	 * }
	 */

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("from Prod Profile");
		System.out.println("Code" + code);
	}

}
