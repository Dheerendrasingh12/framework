package com.arzds;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/home")
public class ProductResource {
	@GET
	@Path("/msg/{prodId}/{prodName}/{mrp}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProd(@BeanParam Product product) {
		return product;
	}
}
