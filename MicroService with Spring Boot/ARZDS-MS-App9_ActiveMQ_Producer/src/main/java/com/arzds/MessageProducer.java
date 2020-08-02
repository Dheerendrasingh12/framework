package com.arzds;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer implements CommandLineRunner {
	@Autowired
	private JmsTemplate jmsTemplate;
	@Autowired
	private Queue queue;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Message Producer");
		jmsTemplate.convertAndSend(this.queue, "Hello ArzDs");
	}
}
