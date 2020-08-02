package com.arzds.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileProcess extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("file:E:\\Camel_Source").process(ex -> {
			String body = ex.getIn().getBody(String.class);
			body = "hello Arzds  ::" + body;
			ex.getOut().setBody(body);
		}).to("file:E:\\Camel_Destination?fileName=myFile.txt");
	}

}
