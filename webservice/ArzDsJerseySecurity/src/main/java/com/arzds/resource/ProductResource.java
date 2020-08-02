package com.arzds.resource;

import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/web")
public class ProductResource {
	@GET
	@Path("/all")
	@PermitAll
	public String showAll() {
		return "ArzDs " + " Permit All";
	}

	@GET
	@Path("/admin")
	@RolesAllowed("/DS")
	public String getAdmin() {
		return "ArzDs " + " Admin All";
	}

	@GET
	@Path("/emp")
	@RolesAllowed("/Arz")
	public String getEmp() {
		return "ArzDs " + " Emp All";

	}

	@GET
	@Path("/noALl")
	@DenyAll
	public String getDeny() {
		return "ArzDs " + " Deny All";

	}
}
