package com.arzds.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {
	@Value("${my.app.topicname}")
	private String topic;
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendMsg(String msg) {
		kafkaTemplate.send(topic, msg);
	}
}
