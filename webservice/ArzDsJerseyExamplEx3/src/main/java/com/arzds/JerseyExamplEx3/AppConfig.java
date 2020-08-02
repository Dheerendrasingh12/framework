package com.arzds.JerseyExamplEx3;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import com.arzds.filter.SecurityFilter;

@ApplicationPath("/rest")
public class AppConfig extends ResourceConfig {

	public AppConfig() {
		packages("com.arzds.resource");
		register(new SecurityFilter());
	}

}
