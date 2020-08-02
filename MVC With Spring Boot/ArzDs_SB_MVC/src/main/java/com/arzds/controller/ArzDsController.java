package com.arzds.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller

public class ArzDsController {
	@RequestMapping("/")
	public String getPage() {
		return "index";
	}
}
