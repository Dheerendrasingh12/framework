package com.arzds.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class ProviderController {
	@GetMapping("/show")
	public String getData() {
		return " Arzds --->>Get Method";
	}

	@PostMapping("/show")
	public String postData() {
		return " Arzds --->>Post Method";
	}

	@PutMapping("/show")
	public String putData() {
		return " Arzds --->>PUT Method";
	}

	@DeleteMapping("/show")
	public String deleteData() {
		return " Arzds --->>Delete Method";
	}

	@PatchMapping("/show")
	public String patchData() {
		return " Arzds --->>Patch Method";
	}
}
