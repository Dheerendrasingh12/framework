package com.arzds.resource;

import javax.annotation.security.PermitAll;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.arzds.model.Product;

@Path("/product")
public class ProductResource {
	@GET
	@Path("/get/{prodId}/{name}/{mrp}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProdut(@BeanParam Product p) {
		return p;
	}
	@GET
	@Path("/all")
	@PermitAll
	public String showAll() {
		return "ArzDs " + " Permit All";
	}



}
