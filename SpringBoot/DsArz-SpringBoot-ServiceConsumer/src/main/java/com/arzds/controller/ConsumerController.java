package com.arzds.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Controller
public class ConsumerController implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<String> rs = restTemplate.getForEntity("http://localhost:8080/provider/show", String.class);
		System.out.println(rs.getBody());
	}

}
