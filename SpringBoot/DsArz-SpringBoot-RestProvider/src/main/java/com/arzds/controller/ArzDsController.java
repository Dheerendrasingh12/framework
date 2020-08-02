package com.arzds.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/home")
public class ArzDsController {
	@GetMapping("/show")
	public String getMsg() {
		return "Get Method -Hello ArzDs";
	}

	@PostMapping("/show")
	public String insertMsg() {
		return " Post Method - Hello ArzDs";
	}

	@PutMapping("/show")
	public String putMsg() {
		return " PUT Method - Hello ArzDs";
	}

	@DeleteMapping("/show")
	public String deleteMsg() {
		return " Delete Method - Hello ArzDs";
	}

	@PatchMapping("/show")
	public String patchMsg() {
		return " Patch Method - Hello ArzDs";
	}

}
