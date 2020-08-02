package com.arzds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arzds.producer.MessageProducer;
import com.arzds.storage.MsgStorage;

@RestController
public class MessageController {
	@Autowired
	private MessageProducer messageProducer;
	@Autowired
	private MsgStorage msgStorage;

	@RequestMapping("/send")
	public String readInMsg(@RequestParam String msg) {
		messageProducer.sendMsg(msg);
		return "Message Sent";
	}

	@RequestMapping("/view")
	public String viewMsg() {
		return msgStorage.getAllMsg();
	}
}
