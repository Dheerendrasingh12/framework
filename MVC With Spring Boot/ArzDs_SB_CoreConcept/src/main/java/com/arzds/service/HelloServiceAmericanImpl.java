package com.arzds.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceAmericanImpl implements HelloService {

	@Override
	public void getMsg() {
		System.out.println("barev Arzds");
	}

}
