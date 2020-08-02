package com.arzds.headparam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hearderParam")
public class HeaderParam {
	@Path("/msg")
	@GET
	public String getHeaderDetail(@javax.ws.rs.HeaderParam("user") String un,
			@javax.ws.rs.HeaderParam("pwd") String pwd) {
		return "ArzDs ->> Header Param " + un + " " + pwd;

	}
}
