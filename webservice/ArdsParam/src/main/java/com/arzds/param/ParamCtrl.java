package com.arzds.param;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/paramHome")
public class ParamCtrl {

	@GET
	@Path("/queryParam")
	public String getQuereyDetails(@QueryParam("eid") int id, @QueryParam("ename") String ename,
			@QueryParam("esal") double sal) {
		return "ARZDS ->" + id + " " + ename + " " + sal;
	}

	@GET
	@Path("/matrixParam")
	public String getMatrixDetails(@MatrixParam("eid") int eid, @MatrixParam("ename") String ename,
			@MatrixParam("esal") double esal) {
		return "ARZDS -> Matrix ->>" + eid + " " + ename + " " + esal;
	}

}
