package com.arzds.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;

@RestController
public class ArzDsConsumer {
@Autowired
private DiscoveryClient disCoveryClient;

@GetMapping("/consumer")
public ResponseEntity getProvderData() {
	RestTemplate restTemplate=new RestTemplate();
	List<ServiceInstance> instances=disCoveryClient.getInstances("ArzDs");
	ResponseEntity responseEntity=restTemplate.getForEntity(instances.get(0).getUri()+"/home/show", String.class);
	return responseEntity;
}
}
