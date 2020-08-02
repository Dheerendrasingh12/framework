package com.arzds.authorization;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.sun.jersey.api.client.ClientResponse.Status;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.core.spi.factory.ResponseBuilderImpl;

@Path("/emp")
public class EmpProvider {
	@GET
	public Response getShow() {
		ResponseBuilder builder = new ResponseBuilderImpl();
		builder.entity("Hello ArzDs");
		builder.status(Status.OK);
		Response rb = builder.build();
		return new ResponseBuilderImpl().htpt;
	}
}
