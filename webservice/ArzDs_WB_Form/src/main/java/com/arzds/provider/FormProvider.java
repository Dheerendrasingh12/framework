package com.arzds.provider;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/home")
public class FormProvider {
	@Path("/msg")
	@GET
	public String getMsg() {
		return "Good Morning ArzDs";
	}

	@Path("/save")
	@POST
	public String saveData(@FormParam("name") String nm, @FormParam("id") int id) {
		return "Hey " + nm + " " + id;
	}
}
