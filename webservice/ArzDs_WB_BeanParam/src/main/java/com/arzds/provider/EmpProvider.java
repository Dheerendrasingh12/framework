package com.arzds.provider;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.arzds.model.Employee;

@Path("/")
public class EmpProvider {
	@Path("/show")
	@GET
	public String getData(@BeanParam Employee employee) {
		return "Hello " + employee;
	}

	@Path("/msg")
	@GET
	public String getMsg() {
		return "Hello ArzDs";
	}
}
