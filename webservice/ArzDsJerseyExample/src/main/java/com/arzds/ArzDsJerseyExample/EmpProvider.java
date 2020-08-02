package com.arzds.ArzDsJerseyExample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("emp")
public class EmpProvider {
	@Path("/msg")
	@GET
	public String getMsg() {
		return "Welcome to  ArzDs ";
	}
}
