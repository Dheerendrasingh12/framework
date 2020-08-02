package com.arzds.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arzds.model.Employee;

@RestController
@RequestMapping("/home")
public class EmpRestController {
	@GetMapping("/stringObj")
	public String getString() {
		return "ArzDs -->> Arz+ DS";
	}

	@GetMapping("/EmpObj")
	public Employee getEmp() {
		return new Employee("ArzDs", 12, 5420011.4);
	}

	@GetMapping("/listObj")
	public List<Employee> getList() {
		return Arrays.asList(new Employee("Arz", 1, 545102.0), new Employee("Ds", 2, 9631545354.045));

	}

	@GetMapping("/mapObj")
	public Map<String, Employee> getMap() {
		Map<String, Employee> map = new HashMap<>();
		map.put("A", new Employee("Arz", 1, 545102.0));
		return map;
	}

	@GetMapping("/resObj")
	public ResponseEntity<String> getResponse() {
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("ArzDs -->>Arz+Ds", HttpStatus.OK);
		return responseEntity;
	}
}
