package com.arzds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController1 {
	@RequestMapping("view")
	public String display() {
		return "view";
	}
}
