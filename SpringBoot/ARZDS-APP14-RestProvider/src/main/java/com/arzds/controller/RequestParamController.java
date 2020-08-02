package com.arzds.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/home")
public class RequestParamController {
	@GetMapping("/requestParam")
	public String getRequestParam(@RequestParam(value = "sname", required = false) String sname,
			@RequestParam(defaultValue = "ArzDs") String sid) {
		return "hello " + sname + " " + sid;
	}
}
