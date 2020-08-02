package com.arzds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentFeignConsumer {
	@Autowired
	private StudentFeignClient client;

	@GetMapping("/consume")
	public String showMsg() {
		return client.getMsg();

	}
}
