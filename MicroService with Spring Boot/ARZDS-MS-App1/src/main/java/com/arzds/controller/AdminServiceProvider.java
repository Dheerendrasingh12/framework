package com.arzds.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class AdminServiceProvider {
	@GetMapping("/show")
	public String showMsg() {
		return "ArzDs Provider";
	}
}
