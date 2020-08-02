package com.arzds.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceEnglishImpl implements HelloService {

	@Override
	public void getMsg() {
		System.out.println("Hello ArzDs");
	}

}
