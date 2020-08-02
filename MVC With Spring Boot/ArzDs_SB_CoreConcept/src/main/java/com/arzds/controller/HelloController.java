package com.arzds.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.arzds.service.HelloService;

public class HelloController {

	private HelloService helloService;

	public void show() {
		helloService.getMsg();
	}

	@Autowired
	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}

}
