package com.arzds.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arzds.model.Cart;
@RefreshScope
@RestController
@RequestMapping("/cart")
public class CartService {
	@Value("${server.port}")
	public String port;
	@Value("${spring.msg: Default Arz}")
	public String msg;

	@Value("${eureka.instance.instance-id}")
	public String instanceId;

	@GetMapping("/info")
	public String getMsg() {
		return msg+" Consumer :" + port;

	}

	@GetMapping("/data")
	public Cart getObj() {
		return new Cart(101, "ABC " + port, 5421.0545);
	}

	@GetMapping("/list")
	public List<Cart> getOrderStatus() {
		return Arrays.asList(new Cart(102, "ABC " + port, 5421.0545), new Cart(105, "DEF " + port, 5421.0545),
				new Cart(103, "GHI " + port, 5421.0545));
	}
}
