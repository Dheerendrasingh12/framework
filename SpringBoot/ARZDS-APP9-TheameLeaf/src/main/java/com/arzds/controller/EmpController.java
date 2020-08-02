package com.arzds.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.arzds.model.Employee;

@Controller
public class EmpController {
	@RequestMapping("reg")
	public String regPage(ModelMap map) {
		Employee employee = new Employee();
		map.addAttribute("employee", employee);
		return "Register";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveData(@ModelAttribute Employee empl, ModelMap map) {
		map.addAttribute("emp", empl);
		return "info";
	}

	@RequestMapping("/all")
	public String showData(ModelMap map) {
		map.addAttribute("msg", "Welcome to ArzDs World --->>");
		List<Employee> employees = Arrays.asList(new Employee(12, "ArzDs", 5000000), new Employee(1, "DsArz", 15000000),
				new Employee(2, "Arz", 5000000));
		map.addAttribute("list", employees);
		return "Data";
	}
}
