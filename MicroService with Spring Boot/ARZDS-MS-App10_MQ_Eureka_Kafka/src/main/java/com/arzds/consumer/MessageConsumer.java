package com.arzds.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.arzds.storage.MsgStorage;

@Component
public class MessageConsumer {
	@Autowired
	private MsgStorage msgStorage;

	@KafkaListener(topics = "${my.app.topicname}", groupId = "groupId")
	public void consume(String msg) {
		msgStorage.put(msg);
	}
}
