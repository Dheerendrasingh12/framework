package com.arzds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arzds.consumer.ArzDsConsmer;

@RestController

public class ArzDsConsumerLBSController {
	@Autowired
	private ArzDsConsmer arzDsConsmer;

	@GetMapping("/info")
	public String getInfo() {
		return "ArzDs" + arzDsConsmer.getStatus();
	}
}
