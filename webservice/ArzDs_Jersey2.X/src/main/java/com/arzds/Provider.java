package com.arzds;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/home")
public class Provider {
	@Path("/msg")
	@GET
	public String showMsg() {
		return "hello ArzDs";
	}
}
