package com.arzds.controller;

import java.lang.reflect.Array;
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
public class JsonController {
	@GetMapping("/showA")
	public String showA() {
		return "ShowA - ArzDs";
	}

	@GetMapping("/showB")
	public Employee showB() {
		return new Employee(1, "ArzDs", 50000000);
	}

	@GetMapping("/showC")
	public List<Employee> showC() {
		return Arrays.asList(new Employee(1, "ArzDs", 500400), new Employee(1, "DsArz", 500400),
				new Employee(3, "AD", 500400));
	}

	@GetMapping("/showD")
	public Map<String, Employee> showD() {
		Map<String, Employee> map = new HashMap<>();
		map.put("ArzDs", new Employee(1, "ArzDs", 500400));
		map.put("DsArz", new Employee(2, "DsArz", 500400));
		map.put("AD", new Employee(3, "AD", 500400));
		return map;
	}

	@GetMapping("/showE")

	public ResponseEntity<String> showE() {
		ResponseEntity<String> responseEntity = new ResponseEntity<>(new Employee(1, "ArzDs", 500400).toString(),
				HttpStatus.ACCEPTED);
		return responseEntity;
	}
}
