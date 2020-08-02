package com.arzds.serviceImpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.arzds.service.GenericService;

@Component
@Profile("prod")
public class ProdService implements GenericService {
	@Value("my.Profile.code")
	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public ProdService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executeTast() {
		System.out.println("From Prod Profile");
		System.out.println("codes" + code);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("From Prod Profile");
		System.out.println("codes" + code);
		// TODO Auto-generated method stub
		
	}

}
