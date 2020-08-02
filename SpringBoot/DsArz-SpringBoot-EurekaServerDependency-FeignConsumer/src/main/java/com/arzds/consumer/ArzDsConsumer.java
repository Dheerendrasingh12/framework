package com.arzds.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arzds.ArzDsFeignClients;

@RestController
public class ArzDsConsumer {
	@Autowired
	private ArzDsFeignClients arzDsFeignClients;

	@GetMapping("/feignConsumer")
	public String getMsg() {
		System.out.println(arzDsFeignClients.getClass().getName());
		return "ArzDs " + arzDsFeignClients.getMsg();
	}
}
