package com.arzds.dbroute;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class DBRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("timer:timer1?repeatCount=1&period=10s").setBody(constant("select * from product")).to("jdbc:dataSource")
				.process(ex -> {
					Object object = ex.getIn();
					System.out.println(object.toString());
					ex.getOut().setBody(object.toString());
				}).to("jms:queue:two");
	}

	/*
	 * @Override public void configure() throws Exception { // TODO Auto-generated
	 * method stub from("timer:timer1?repeatCount=1&period=10s").routeId(
	 * "DATABASE_QUERY_TIMER_ROUTE")
	 * .to("sql:SELECT * FROM employee?dataSource=#dataSource").process(ex -> {
	 * Object object = ex.getIn(); System.out.println(object.toString());
	 * ex.getOut().setBody(object.toString()); }).to("jms:queue:two"); }
	 */
}
