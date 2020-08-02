package com.arzds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableCaching
@EnableHystrix
@EnableFeignClients
public class ArzdsMsSbProductCouponServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArzdsMsSbProductCouponServiceApplication.class, args);
	System.out.println("Product Service Executed !!!!");
	}

}
