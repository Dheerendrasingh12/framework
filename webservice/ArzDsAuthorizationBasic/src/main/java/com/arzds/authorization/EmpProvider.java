package com.arzds.authorization;

import java.util.StringTokenizer;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;

import com.sun.jersey.api.client.ClientResponse.Status;
import com.sun.jersey.core.spi.factory.ResponseBuilderImpl;

@Path("/emp")
public class EmpProvider {
	@POST
	public Response processSave(@HeaderParam("Authorization") String auth) {
		ResponseBuilder builder = new ResponseBuilderImpl();
		if (auth == null || "".equals(auth.trim())) {
			builder.entity("Invalid input provided");
			builder.status(Status.BAD_REQUEST);

		} else {
			auth = auth.replace("Basic", "");
			byte[] byteAuth = auth.getBytes();
			byte[] decAuth = Base64.decodeBase64(byteAuth);

			auth = new String(decAuth);
			System.out.println(auth);

			StringTokenizer str = new StringTokenizer(auth, ":");
			String usn = str.nextToken();
			String pwd = str.nextToken();
			if (StringUtils.equals("ArzDs", usn) || StringUtils.equals("AZ", pwd)) {
				builder.entity("Sucessfully Login");
				builder.status(Status.OK);
			} else {
				builder.entity("Invalid username/password");
				builder.status(Status.UNAUTHORIZED);
			}
		}
		Response response = builder.build();
		return response;
	}
}
