package com.arzds;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
@Path("/")
public class MatrixController {
	@GET
	@Path("/show")
	public String getMsg(@MatrixParam("name") String name, @MatrixParam("id") int id) {
		return "Hello " + name + " " + id;
	}

	@Path("/msg")
	@GET
	public String getResponse() {
		return "ArzDs";

	}
}
