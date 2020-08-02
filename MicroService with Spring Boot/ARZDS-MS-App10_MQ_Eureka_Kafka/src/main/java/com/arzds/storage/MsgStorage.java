package com.arzds.storage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MsgStorage {
	private List<String> msglist = new ArrayList<>();

	public void put(String msg) {
		msglist.add(msg);
	}

	public String getAllMsg() {
		return msglist.toString();
	}
}
