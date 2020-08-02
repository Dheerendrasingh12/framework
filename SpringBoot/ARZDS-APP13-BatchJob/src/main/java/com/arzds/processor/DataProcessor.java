package com.arzds.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class DataProcessor implements ItemProcessor<String, String> {

	@Override
	public String process(String item) throws Exception {
		// TODO Auto-generated method stub
		return item.toUpperCase();
	}

}
