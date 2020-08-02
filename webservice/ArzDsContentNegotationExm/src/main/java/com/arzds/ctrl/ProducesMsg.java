package com.arzds.ctrl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.arzds.model.Employee;
import com.sun.jersey.core.spi.factory.ResponseBuilderImpl;
import com.sun.research.ws.wadl.Application;
import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

@Path("/emphome")
public class ProducesMsg {
	@POST
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response getResponse() {
		ResponseBuilder builder = new ResponseBuilderImpl();
		Employee employee = new Employee();
		employee.setEmpId(12);
		employee.setEmpName("ArzDs");
		employee.setEmpSal(452.5);
		
		return builder.entity(employee).status(200).build();
	}
}
