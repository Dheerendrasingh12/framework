package com.arzds.ArzDsContextData;

import javax.ws.rs.Path;

import org.glassfish.jersey.server.ResourceConfig;

@Path("/rest")
public class AppConfig extends ResourceConfig{

	public AppConfig() {
		packages("com.arzds.resource");
	}

}
