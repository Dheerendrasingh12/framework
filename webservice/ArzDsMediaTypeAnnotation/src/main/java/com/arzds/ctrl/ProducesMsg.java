package com.arzds.ctrl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.arzds.model.Employee;
import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

@Path("/home")
public class ProducesMsg {
	@Path("/msg")
	@GET
	@Produces("application/json")
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setEmpId(12);
		emp.setEmpName("D");
		return emp;
	}

	@Path("listShow")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getEmployeess() {
		Employee employee = new Employee();
		employee.setEmpId(1);
		employee.setEmpName("D");
		employee.setEmpPwd("Arz");
		Employee employee1 = new Employee();
		employee1.setEmpId(2);
		employee1.setEmpName("DA");
		employee1.setEmpPwd("ArzDS");
		return Arrays.asList(employee, employee1);
	}
}
