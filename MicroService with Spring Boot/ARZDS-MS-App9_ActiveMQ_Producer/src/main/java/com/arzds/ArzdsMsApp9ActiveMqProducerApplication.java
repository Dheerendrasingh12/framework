package com.arzds;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ArzdsMsApp9ActiveMqProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArzdsMsApp9ActiveMqProducerApplication.class, args);
	}

	@Bean
	public Queue queue() {
		return new ActiveMQQueue("ArzDs ");
	}

}
