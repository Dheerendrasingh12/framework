package com.arzds.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.arzds.modle.Employee;
import com.arzds.service.EmployeeService;

@Controller
public class EmpController {
	@Autowired
	private EmployeeService empService;

	@RequestMapping("/reg")
	public String showReg(Model map) {
		map.addAttribute("emp", new Employee());
		return "Register";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveData(Model map, @ModelAttribute Employee employee) {
		Integer id = empService.saveEmployee(employee);
		map.addAttribute("msg", "Employee " + id + " Created");
		map.addAttribute("employee", new Employee());
		return "Register";
	}

	@RequestMapping("/view")
	public String getAll(Model map) {
		map.addAttribute("list", empService.getAllEmp());
		return "Data";
	}

	@RequestMapping("/view/{id}")
	public String viewEmpById(@PathVariable Integer id, Model model) {
		model.addAttribute("view", empService.getById(id));
		return "View";
	}

	@RequestMapping("/delete/{id}")
	public String deleteEmp(@PathVariable Integer id, Model model) {
		empService.deleteEmp(id);
		model.addAttribute("list", empService.getAllEmp());
		model.addAttribute("msg", "Employee " + id + " deleted");
		return "Data";
	}

	@RequestMapping("/update")
	public String updateEmp(@ModelAttribute Employee employee, Model model) {
		empService.updateEmp(employee);
		return "redirect:all";  
	}
}
