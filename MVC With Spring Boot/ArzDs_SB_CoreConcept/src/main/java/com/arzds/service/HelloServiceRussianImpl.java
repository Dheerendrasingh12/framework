package com.arzds.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceRussianImpl implements HelloService {

	@Override
	public void getMsg() {
		System.out.println("privet arzds");
	}

}
