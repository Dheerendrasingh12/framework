package com.arzds.consume;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.arzds.model.Employee;

@Path("/")
public class EmpConsume {
	@Path("/show")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_XML)
	public Employee getEmp(Employee emp) {
		return emp;
	}
}
