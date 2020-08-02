package com.arzds;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReciver {
@JmsListener(destination = "arzds")
public void receiveMsg(Message msg) {
	System.out.println("Recevied Message"+msg);
}
}
