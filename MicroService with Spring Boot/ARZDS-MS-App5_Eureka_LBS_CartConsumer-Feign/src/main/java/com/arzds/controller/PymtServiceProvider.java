package com.arzds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arzds.consumer.Cart;
import com.arzds.consumer.CartServiceConsumer;

@RestController
@RequestMapping("/homePayment")
public class PymtServiceProvider {
	@Autowired
	private CartServiceConsumer cartServiceConsumer;
	@Value("${spring.msg}")
	private String msg;

	@GetMapping("/msg")
	public String getMsg() {
		return cartServiceConsumer.getMsg();

	}

	@GetMapping("/obj")
	public Cart getCart() {
		System.out.println(msg);
		return cartServiceConsumer.getObj();
	}

	@GetMapping("/all")
	public List<Cart> getAll() {
		return cartServiceConsumer.getBulk();
	}
}
