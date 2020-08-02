package com.arzds.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderProvider")
public class OrderProvider {
	@Value("${server.port}")
	public String port;
	@Value("${eureka.instance.instance-id}")
	public String instanceId;

	@GetMapping("/status")
	public String getOrderStatus() {
		return "ArzDs -->> Order Provider " + port + " \nInstance Id" + instanceId;
	}
}
