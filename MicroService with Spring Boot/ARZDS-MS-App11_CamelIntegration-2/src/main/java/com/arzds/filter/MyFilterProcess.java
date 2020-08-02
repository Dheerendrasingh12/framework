package com.arzds.filter;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyFilterProcess extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("file:E:\\Camel_Source").filter(body().startsWith("ArzDs")).to("file:E:\\Camel_Destination");
	}

	/*
	 * @Override public void configure() throws Exception { // TODO
	 * Auto-generatedmethod stub
	 * from("file:E:\\Camel_Source").filter(header(Exchange.FILE_NAME).contains("my"
	 * )) .to("file:E:\\Camel_Destination");
	 * 
	 * }
	 */
}
