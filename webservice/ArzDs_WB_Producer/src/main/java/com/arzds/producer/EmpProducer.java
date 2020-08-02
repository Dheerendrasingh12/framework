package com.arzds.producer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.arzds.model.Employee;

@Path("/")
public class EmpProducer {
	@Path("/msg")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getMsg() {
		return "Hello ArzDs";
	}

	@Path("/show")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Employee getShow() {
		Employee employee = new Employee();
		employee.setEmpId(12);
		employee.setEmpName("ArzDs");
		employee.setEmpSal(85362);
		return employee;
	}
}
