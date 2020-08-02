package com.arzds.consumer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AdminServiceConsumer implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String url = "http://localhost:9632/provider/show";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> resp = null;
		resp = restTemplate.getForEntity(url, String.class);
		System.out.println(resp.getBody() + "\n" + resp.getHeaders());

	}

}
