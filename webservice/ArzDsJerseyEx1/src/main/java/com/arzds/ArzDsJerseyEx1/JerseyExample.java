package com.arzds.ArzDsJerseyEx1;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.arzds.model.Employee;

@Path("/emp")
public class JerseyExample {

	@Path("/msg")
	@GET
	public String getMessage(@BeanParam
			Employee employee) {
		return "ArzDs ---->>> "+employee;
	}
}
