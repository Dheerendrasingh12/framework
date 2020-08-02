package com.arzds;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping("/home.htm")
	public String showHome() {
		return "welcome";
	}

	@RequestMapping(value = "/direct.htm")
	public String helloHome() {
		return "Welcome to Jsp";
	}
}
