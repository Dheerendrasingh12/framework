package com.arzds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {
@RequestMapping("/home")
public ModelAndView getMsg() {
	return new ModelAndView("home","msg","Welcome to ArzDS");
}
}
