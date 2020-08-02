package com.arzds.wbs1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/home")
public class MessageProvider {
	@Path("/msg")
	@GET
	public String showMessage() {
		return "Welocme to ArzDs Restful WebServices!!";
	}
}
