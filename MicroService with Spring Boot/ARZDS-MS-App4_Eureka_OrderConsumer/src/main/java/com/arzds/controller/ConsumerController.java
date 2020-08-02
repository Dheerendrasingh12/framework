package com.arzds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arzds.service.OrderConsumer;

@RestController
@RequestMapping("/invoiceConsumer")
public class ConsumerController {
	@Autowired
	private OrderConsumer consumer;

	@GetMapping("/info")
	public String getOrderStatus() {
		return consumer.getStatus();
	}
}
