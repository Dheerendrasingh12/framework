package com.arzds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.arzds.model.Customer;
import com.arzds.repository.CustomerRepo;

@Controller
public class FormCtrl {
	@Autowired
	CustomerRepo repo;

	@RequestMapping("/")
	public String myHome() {
		return "custForm";
	}

	@RequestMapping("/details")
	public String myHome(Customer customer) {
		repo.save(customer);
		return "custForm";
	}

	@RequestMapping("/getdetails")
	public String getDetails() {
		return "viewCustomer";
	}



	@PostMapping("/getdetails")
	public ModelAndView viewDetails(@RequestParam int custId) {
		ModelAndView view = new ModelAndView("Retrive");
		Customer customer = repo.findById(custId).orElse(null);
		view.addObject(customer);
		return view;
	}
}
