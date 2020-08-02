package com.arzds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
@EnableJms
@SpringBootApplication
public class ArzdsMsApp9ActiveMqConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArzdsMsApp9ActiveMqConsumerApplication.class, args);
		System.out.println("Consumer");
	}




}
