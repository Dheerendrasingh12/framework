package com.arzds;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/rest")
public class AppResource extends ResourceConfig {

	public AppResource() {
		packages("com.arzds");
	}

}
