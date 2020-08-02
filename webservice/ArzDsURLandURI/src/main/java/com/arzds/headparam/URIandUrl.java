package com.arzds.headparam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/emp")
public class URIandUrl {
	@Path("/msg/empName")
	@GET
	public String show1() {
		return "Hello 1";
	}

	@GET
	@Path("/msg/empName/{empSal}")
	public String show2(@PathParam("empSal") double empSal) {
		return "Hello 2" + empSal;

	}

	@Path("/msg/empName/{ename}/{empSal}")
	@GET
	public String show3(@PathParam("ename") String ename, @PathParam("empSal") double empSal) {
		return "hello 3 " + empSal + " " + ename;
	}

}
