package com.arzds.ctrl;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.arzds.model.Employee;
import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

@Path("/home")
public class ProducesMsg {

	@Path("msg")
	@POST
	@Consumes("application/json")
	public String show(Employee e) {
		return "ArzDs -->> Consumes " + e.getEmpId() + " " + e.getEmpName() + " " + e.getEmpPwd();
	}

@Path("showMsg")
@POST 
@Consumes(MediaType.APPLICATION_XML)
public String showEmployee(Employee e) {
	return "ArzDs -->> Consumes " + e.getEmpId() + " " + e.getEmpName() + " " + e.getEmpPwd();
}

}
