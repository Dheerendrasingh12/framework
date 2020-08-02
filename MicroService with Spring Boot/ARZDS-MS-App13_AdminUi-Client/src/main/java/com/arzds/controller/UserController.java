package com.arzds.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
	@GetMapping("/show")
	public String getMsg() {
		return "Arzds Admin Provider";
	}
}
