package com.arzds.jmsrouter;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MQRouter extends RouteBuilder {

	// @Override
//	public void configure() throws Exception {
	// TODO Auto-generated method stub
	// from("jms:queue:indata").to("file:E:\\Camel_Destination?fileName=data.txt");
	// }
	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("file:E:\\Camel_Source").to("jms:queue:outdata");
	}
}
