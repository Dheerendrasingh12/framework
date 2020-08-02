package com.arzds.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.arzds.model.Coupon;

@FeignClient("Coupon-App")
public interface CouponRestCLient {

	@GetMapping("/home/coupon/getByCode/{code}")
	public Coupon getById(@PathVariable String code);

	@GetMapping("/home/coupon/check/{code}")
	public String checkExpired(@PathVariable String code);

}
