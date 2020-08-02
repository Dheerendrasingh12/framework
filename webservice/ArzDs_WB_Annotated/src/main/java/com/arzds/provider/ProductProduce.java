package com.arzds.provider;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.arzds.model.Product;

@Path("/product")
public class ProductProduce {
	@GET
	@Path("/get/{prodId}/{prodName}/{prodCost}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProduct(@BeanParam Product product) {
		return product;
	}
}
