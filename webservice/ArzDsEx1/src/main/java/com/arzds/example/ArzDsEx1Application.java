package com.arzds.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication(scanBasePackages = "com")
public class ArzDsEx1Application {

	public static void main(String[] args) {
		SpringApplication.run(ArzDsEx1Application.class, args);
	}

	@RequestMapping("/value")
	public ResponseEntity<Object> getResponse() {
		return new ResponseEntity<Object>("Hi DsArz", HttpStatus.OK);
	}
}
