package com.arzds;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/home")
public class EmpProvider {
	@Path("/msg")
	@GET
	public String getEMp(@BeanParam Employee e) {
		return "Hello " + e;
	}
}
