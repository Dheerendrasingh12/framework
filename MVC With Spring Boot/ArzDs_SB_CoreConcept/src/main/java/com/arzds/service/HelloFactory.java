package com.arzds.service;

import org.springframework.stereotype.Component;

public class HelloFactory {
	public HelloService helloService = null;

	public HelloService showMsg(String language) {

		switch (language) {
		case "en":
			helloService = new HelloServiceEnglishImpl();
			break;
		case "am":
			helloService = new HelloServiceAmericanImpl();
			break;
		case "it":
			helloService = new HelloServiceitalianImpl();
			break;
		case "rus":
			helloService = new HelloServiceRussianImpl();
			break;
		}
		return helloService;
	}

}
