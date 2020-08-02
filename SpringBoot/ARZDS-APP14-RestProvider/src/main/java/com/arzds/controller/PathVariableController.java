package com.arzds.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class PathVariableController {
	@GetMapping("/path/{id}/{name}/{fee}")
	public String getData(@PathVariable int id, @PathVariable String name, @PathVariable double fee) {
		return "Arzds " + id + " " + name + " " + fee;
	}
}
