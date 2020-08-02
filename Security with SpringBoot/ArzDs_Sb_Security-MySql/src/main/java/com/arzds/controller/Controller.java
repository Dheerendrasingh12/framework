package com.arzds.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {

	@GetMapping("/home")
	public String getMSg() {
		return "<h1>Welcome to ArzDs</h1>";
	}

	@GetMapping("/user")
	public String getUser() {
		return "<h1>Welcome to User ArzDs</h1>";
	}

	@GetMapping("/admin")
	public String getAdmin() {
		return "<h1>Welcome to Admin ArzDs</h1>";
	}


}
