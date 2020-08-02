package com.arzds.consumer;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "ArzDs-Cart-Provider")
@RibbonClient(name = "ArzDs-Cart-Provider")
public interface CartServiceConsumer {
	@GetMapping("/cart/info")
	public String getMsg();

	@GetMapping("/cart/data")
	public Cart getObj();

	@GetMapping("/cart/list")
	public List<Cart> getBulk();
}
