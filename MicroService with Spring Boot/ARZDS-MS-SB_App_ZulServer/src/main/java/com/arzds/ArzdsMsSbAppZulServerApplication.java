package com.arzds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ArzdsMsSbAppZulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArzdsMsSbAppZulServerApplication.class, args);
		System.out.println("Zuul Server Executed");
	}

}
