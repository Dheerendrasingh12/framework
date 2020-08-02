package com.arzds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableCaching
@EnableHystrix
public class ArzdsMsSbAppCouponAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArzdsMsSbAppCouponAppApplication.class, args);
		System.out.println("Coupon Service Executed");
	}

}
