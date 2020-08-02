package com.arzds.postman;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/postman")
public class Message {
	@Path("/show")
	@POST
	public String mesg() {
		return "Hi DsArz";
	}

	@Path("/show")
	@GET
	public String msg() {
		return "hi ArzDS";
	}
	
	/*
	 * @Path("/dup")
	 * 
	 * @GET public String dupCheck() { return "Duplicate 1"; }
	 * 
	 * @Path("/dup")
	 * 
	 * @GET public String dupChecking() { return "Duplicate 2"; }
	 */}
