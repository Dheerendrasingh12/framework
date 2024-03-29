package com.arzds.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
	@Value("${app.msg}")
	private String mesg;

	@GetMapping("/welcome")
	public String getMsg() {
		return mesg;
	}
}
