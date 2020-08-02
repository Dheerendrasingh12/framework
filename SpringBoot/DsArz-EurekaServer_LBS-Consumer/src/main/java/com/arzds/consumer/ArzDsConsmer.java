package com.arzds.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ArzDsConsmer {
	@Autowired
	private LoadBalancerClient balancerClient;

	public String getStatus() {
		String path = "/provider/status";
		ServiceInstance instance = balancerClient.choose("ArzDs LBS Provider");
		String uri = instance.getUri().toString();
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> entity = restTemplate.getForEntity(uri + path, String.class);
		return "ArzDs Consumer "+entity.getBody();
	}
}
