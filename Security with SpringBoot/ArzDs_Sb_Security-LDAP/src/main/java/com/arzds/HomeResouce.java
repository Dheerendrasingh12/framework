package com.arzds;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResouce {
	@GetMapping("/home")
	public String getMst() {
		return "Welcome to ArzDs";
	}
}
