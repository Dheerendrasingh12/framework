package com.arzds.choice;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoutingChoice extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("file:E:\\Camel_Source").choice().when(body().startsWith("ArzDs"))
				.to("file:E:\\Camel_Destination??fileName=a.txt").when(header(Exchange.FILE_NAME).contains("My"))
				.to("file:E:\\Camel_Destination??fileName=b.txt").otherwise()
				.to("file:E:\\Camel_Destination??fileName=o.txt");
	}

}
