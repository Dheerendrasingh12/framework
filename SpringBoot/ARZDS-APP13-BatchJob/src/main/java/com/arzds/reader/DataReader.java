package com.arzds.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Component;

@Component
public class DataReader implements ItemReader<String> {
	String msg[] = { "arz", "arzds", "ds" };
	int msgLength = 0;

	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		// TODO Auto-generated method stub
		if (msgLength < msg.length) {
			return msg[msgLength++];
		} else
			msgLength = 0;
		return null;
	}

}
