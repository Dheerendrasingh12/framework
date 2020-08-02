package com.arzds.filter;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;

public class SecurityFilter implements ContainerRequestFilter {
	@Context
	private ResourceInfo resInfo;
	@Context
	private HttpHeaders header;

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		Method method = resInfo.getResourceMethod();
		if (!method.isAnnotationPresent(PermitAll.class)) {
			if (method.isAnnotationPresent(DenyAll.class)) {
				requestContext.abortWith(
						Response.ok("This Request Can't be processed Denny").status(Status.FORBIDDEN).build());

				return;
			}
			List<String> reqHeaders = header.getRequestHeaders().get("Authorization");
			if (reqHeaders == null || reqHeaders.isEmpty()) {
				requestContext
						.abortWith(Response.ok("Invalid User Details Provided ").status(Status.UNAUTHORIZED).build());

				return;
			}
			List<String> userDetails = getUsnPwd(reqHeaders.get(0));
			if (method.isAnnotationPresent(RolesAllowed.class)) {
				List<String> roles = Arrays.asList(method.getAnnotation(RolesAllowed.class).value());
				if (!isValidUser(userDetails, roles)) {
					requestContext.abortWith(
							Response.ok("Invalid user details Roles not assigned").status(Status.UNAUTHORIZED).build());
					return;
				}
			} else {
				if (!isValidUser(userDetails, Arrays.asList("ALLPERMIT"))) {
					requestContext.abortWith(Response.ok("Invalid User Details").status(Status.UNAUTHORIZED).build());
					return;
				}
			}
		}
	}

	private boolean isValidUser(List<String> userDetails, List<String> roles) {
		boolean flag = false;
		if (userDetails != null && roles != null) {
			if (StringUtils.equalsIgnoreCase(userDetails.get(0), "ArzDs")
					&& StringUtils.equalsIgnoreCase(userDetails.get(1), "DsArz") && roles.contains("ALLPERMIT")
					|| roles.contains("ARZ")) {
				flag = true;
			} else if (StringUtils.equalsIgnoreCase(userDetails.get(0), "DsArz")
					&& StringUtils.equalsIgnoreCase(userDetails.get(1), "ArzDs") && roles.contains("ALLPERMIT")
					|| roles.contains("DS")) {
				flag = true;

			}
		}

		return flag;

	}

	private List<String> getUsnPwd(String auth) {
		auth = auth.replace("Basic", "");
		byte[] decAuth = Base64.decodeBase64(auth.getBytes());
		auth = new String(decAuth);
		StringTokenizer stringTokenizer = new StringTokenizer(auth, ":");
		return Arrays.asList(stringTokenizer.nextToken(), stringTokenizer.nextToken());
	}
}