package com.arzds.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ArzDsProvider {
	@Value("${server.port}")
	private String port;

	@GetMapping("/status")
	public ResponseEntity getStatus() {
		ResponseEntity entity = new ResponseEntity("ArzDs Provider Port No: " + port, HttpStatus.OK);

		return entity;
	}
}
