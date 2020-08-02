package com.arzds;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.core.JmsTemplate;
@SpringBootApplication
public class ArzDSMsgg {
	public static void main(String[] args) {
		// Launch the application
		ConfigurableApplicationContext context = SpringApplication.run(JMSApp.class, args);

		// Get JMS template bean reference
		JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);

		// Send a message
		System.out.println("Sending a message.");
		jmsTemplate.convertAndSend("arzds", new Message(1001L, "Hi ArzDs", new Date()));
	}

}
