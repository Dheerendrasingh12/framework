package com.arzds.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arzds.Service.EmpService;
import com.arzds.model.Employee;

@Controller
public class HomeController {
	@Autowired
	private EmpService service;

	@RequestMapping("/data.htm")
	public String getAllEmp(Model m) {
		List<Employee> data = service.getAllEmp();
		m.addAttribute("empList", data);
		return "listEmp";
	}

	@RequestMapping("/home.htm")
	public String home() {
		return "home";
	}

}
