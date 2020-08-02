package com.arzds.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.arzds.model.Reservation;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String display(HttpServletRequest httpServletRequest, Model m) {
		String usn = httpServletRequest.getParameter("name");
		String pwd = httpServletRequest.getParameter("pwd");
		if (pwd.equals("ArzDs")) {
			String msg = "Welcome " + usn;
			m.addAttribute("msg", msg);
			return "viewPage";
		} else {
			String msg = "Sorry " + usn + " Password is incorrect";
			m.addAttribute("msg", msg);
			return "errorPage";
		}
	}

	@RequestMapping("/reqParam")
	public String getMsg(@RequestParam("name") String usn, @RequestParam("pwd") String pwd, Model m) {

		if (pwd.equals("ArzDs")) {
			String msg = "Welcome " + usn;
			m.addAttribute("msg", msg);
			return "viewPage";
		} else {
			String msg = "Sorry " + usn + " Password is incorrect";
			m.addAttribute("msg", msg);
			return "errorPage";
		}
	}

	@RequestMapping("/booking")
	public String bookingForm(Model m) {
		Reservation reservation = new Reservation();
		m.addAttribute("reservation", reservation);

		return "resPage";
	}

	@RequestMapping("/submit")
	public String submitForm(@ModelAttribute("reservation") Reservation reservation) {
		return "confirm";
	}
}
