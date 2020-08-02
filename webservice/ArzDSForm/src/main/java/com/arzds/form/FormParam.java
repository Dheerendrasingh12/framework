package com.arzds.form;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/formParam")
public class FormParam {
	@Path("/formMsg")
	@POST
	public String getFormData(@javax.ws.rs.FormParam("eid") int id, @javax.ws.rs.FormParam("ename") String nam,
			@javax.ws.rs.FormParam("sal") double sal) {
		return "ARZDS ->> Form : " + id + " " + nam + " " + sal;

	}
}
