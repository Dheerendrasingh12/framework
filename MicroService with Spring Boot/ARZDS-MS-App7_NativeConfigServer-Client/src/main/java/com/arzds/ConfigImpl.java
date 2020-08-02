package com.arzds;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
public class ConfigImpl {
	@Value("${message: Default Hello }")
	public String msg;

	@GetMapping("/home")
	public String getMsg() {
		return msg;
	}
}
