package com.arzds.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorController {
	@GetMapping("/show")
	public String getMsg() {
		return "Hello --->>>>ArzDs ";
	}
}
