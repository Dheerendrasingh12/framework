package com.arzds;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "ArzDs")
public interface ArzDsFeignClients {
	@GetMapping("/home/show")
	public String getMsg();
}
