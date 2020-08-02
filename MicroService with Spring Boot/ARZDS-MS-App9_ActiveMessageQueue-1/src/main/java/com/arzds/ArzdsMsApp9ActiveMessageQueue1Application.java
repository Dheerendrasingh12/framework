package com.arzds;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
@EnableJms
@SpringBootApplication
public class ArzdsMsApp9ActiveMessageQueue1Application {

	public static void main(String[] args) {
		SpringApplication.run(ArzdsMsApp9ActiveMessageQueue1Application.class, args);
	}

	@Bean
	public Queue queue() {
		return new ActiveMQQueue("arzds");
	}
}
