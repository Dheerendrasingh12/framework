package com.arzds.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class DevService implements GenericService {
	@Value("${my.arzds.code}")
	private String code;

	@Override
	public void executeTast() {
		// TODO Auto-generated method stub
		System.out.println("from defalut Profile");
		System.out.println("\nCode-" + code);
	}

}
