package com.arzds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderConsumer {
	@Autowired
	private LoadBalancerClient balancerClient;

	public String getStatus() {
		String path = "/orderProvider/status";
		ServiceInstance instance = balancerClient.choose("ArzDs-Order-Provider");
		String uri = instance.getUri().toString();
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> entity = restTemplate.getForEntity(uri + path, String.class);
		return "ArzDs Consumer " + entity.getBody();
	}
}
