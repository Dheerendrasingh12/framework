package com.arzds.controller;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/home")
public class ArzDsController {
	@RequestMapping("/show")
	public String getMsg(Model model) {
		model.addAttribute("msg", "WELCOME to ArzDS World : " + new Date());
		return "HOME";
	}
}
