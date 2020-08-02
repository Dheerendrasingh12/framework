package com.arzds.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.sun.jersey.core.spi.factory.ResponseBuilderImpl;

@Path("/home")
public class QueryCtrl {
	@Path("/show")
	@GET
	public String getResponse(@QueryParam("name") String name, @QueryParam("id") int id) {
		return name + " " + id;

	}
	@Path("/msg")
	public String getResponse() {
		return "ArzDs";

	}
}
