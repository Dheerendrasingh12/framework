
package com.arzds;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "ArzDs-Order-Provider")
public interface StudentFeignClient {
	@GetMapping("/orderProvider/status")
	public String getMsg();
}
