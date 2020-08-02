package com.arzds.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class HystrixController {
	@GetMapping("/show")
	@HystrixCommand(fallbackMethod = "showFallBackMtd")
	public String showMsg() {
		System.out.println("From Service");
		if (new Random().nextInt(10) <= 10) {
			throw new RuntimeException("Dummy");
		}
		return "Hystrix Hi";
	}

	public String showFallBackMtd() {
		System.out.println("FallBackMethod");
		return "fallback Method -->>Hystrix";
	}
}
