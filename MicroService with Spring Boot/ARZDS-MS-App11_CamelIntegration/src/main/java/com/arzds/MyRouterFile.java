package com.arzds;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRouterFile extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("file:F:\\Desti").to("file:E:\\resumes\\resumes\\version1");
	}

}
