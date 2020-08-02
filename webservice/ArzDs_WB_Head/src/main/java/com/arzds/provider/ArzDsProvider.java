package com.arzds.provider;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/")
public class ArzDsProvider {
	@Path("/msg")
	@GET
	public String getMsg() {
		return "Hello ArzDs";
	}

	@Path("/show")
	@POST
	public String showHead(@HeaderParam("usn") String usn, @HeaderParam("pwd") String pwd,
			@FormParam("name") String name) {
		return usn + " " + pwd + " " + name;
	}
}
