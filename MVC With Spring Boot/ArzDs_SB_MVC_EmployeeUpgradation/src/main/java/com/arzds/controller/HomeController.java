package com.arzds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.arzds.model.Employee;
import com.arzds.service.EmployeeService;

@Controller
public class HomeController {
	@Autowired
	EmployeeService empService;// will inject dao from XML file

	@RequestMapping("/empform")
	public String showform(Model m) {
		m.addAttribute("command", new Employee());
		return "empForm";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("emp") Employee emp) {
		empService.save(emp);
		return "redirect:/viewemp";// will redirect to viewemp request mapping
	}

	@RequestMapping("/viewemp")
	public String viewemp(Model m) {
		List<Employee> list = empService.getEmployeeloyees();
		m.addAttribute("list", list);
		return "viewemp";
	}

	/*
	 * It displays object data into form for the given id. The @PathVariable puts
	 * URL data into variable.
	 */
	@RequestMapping(value = "/editemp/{id}")
	public String edit(@PathVariable int id, Model m) {
		Employee emp = empService.getEmployeeById(id);
		m.addAttribute("command", emp);
		return "empeditform";
	}

	/* It updates model object. */
	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
	public String editsave(@ModelAttribute("emp") Employee emp) {
		empService.update(emp);
		return "redirect:/viewemp";
	}

	/* It deletes record for the given id in URL and redirects to /viewemp */
	@RequestMapping(value = "/deleteemp/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable int id) {
		empService.delete(id);
		return "redirect:/viewemp";
	}
}
