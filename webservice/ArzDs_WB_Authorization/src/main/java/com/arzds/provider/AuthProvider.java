package com.arzds.provider;

import java.util.StringTokenizer;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.apache.commons.codec.binary.Base64;

import com.sun.jersey.api.client.ClientResponse.Status;
import com.sun.jersey.core.spi.factory.ResponseBuilderImpl;

@Path("/")
public class AuthProvider {
	@POST
	@Path("/home")
	public Response processAuth(@HeaderParam("Authorization") String auth) {
		ResponseBuilder builder = new ResponseBuilderImpl();
		if (auth == null || "".equals(auth.trim())) {
			builder.entity("INVALIDE USername/PASSWORD");
		} else {
			auth = auth.replace("Basic", "");

			byte[] encArr = auth.getBytes();
			byte[] decArr = Base64.decodeBase64(encArr);
			auth = new String(decArr);
			StringTokenizer stringTokenizer = new StringTokenizer(auth, ":");
			String usn = stringTokenizer.nextToken();
			String pwd = stringTokenizer.nextToken();
			if ("ArzDs".equals(usn) && "DsArz".equals(pwd)) {
				builder.entity("Sucess");
				builder.status(Status.OK);
			} else {
				builder.entity("Invalid Username/Password");
				builder.status(Status.UNAUTHORIZED);
			}
		}
		Response response = builder.build();
		return response;
	}
}
