package com.arzds.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class ArzDsController {
	@GetMapping("/show")
	public String showMsg(@RequestParam(value = "sname", required = false, defaultValue = "ArzDs") String sid) {
		return sid;
	}
	@GetMapping("/show")
	public String showMsg1(@RequestParam(value = "sname", required = true) String sname) {
		return sname;
	}
	
}
