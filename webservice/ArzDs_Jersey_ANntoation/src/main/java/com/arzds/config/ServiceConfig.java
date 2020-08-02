package com.arzds.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/rest")
public class ServiceConfig extends ResourceConfig {

	public ServiceConfig() {
		packages("com.arzds");
	}

}
