package com.arzds.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceitalianImpl implements HelloService {

	@Override
	public void getMsg() {
		System.out.println("ciao  ArzDs");
	}

}
