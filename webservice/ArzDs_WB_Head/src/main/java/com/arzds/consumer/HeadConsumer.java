package com.arzds.consumer;

import javax.ws.rs.FormParam;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.representation.Form;

public class HeadConsumer {
	public static void main(String[] args) {
		String url = "http://localhost:9080/ArzDs_WB_Head/show";
		Client client = Client.create();
		WebResource resource = client.resource(url);
		Form form = new Form();
		form.add("name", "Arz-Dheerendra");
		ClientResponse clientResponse = resource.header("usn", "ArzDs").header("pwd", "love").post(ClientResponse.class,
				form);
		String res = clientResponse.getEntity(String.class);
		System.out.println(res);
		System.out.println(clientResponse.getCookies());
		System.out.println(clientResponse.getResponseStatus());
		System.out.println(clientResponse.getStatus());
		System.out.println(clientResponse.getStatusInfo());
	}
}
