package com.arzds.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StudentConsumer {
	@Autowired
	private DiscoveryClient client;

	@GetMapping("/consumer")
	public String getConsumeData() {
		RestTemplate restTemplate = new RestTemplate();
		List<ServiceInstance> instances = client.getInstances("ArzDs Student Provider");
		ResponseEntity<String> resp = restTemplate.getForEntity(instances.get(0).getUri() + "/provider/show", String.class);
		return resp.getBody() + resp.getHeaders();
	}
}
