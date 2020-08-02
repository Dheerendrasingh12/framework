package com.arzds.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
@GetMapping("/home")
public String getMSg() {
	return "<h1>Welcome to ArzDs</h1>";
}
}
