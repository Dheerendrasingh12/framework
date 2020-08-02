package com.arzds.consumer;

import javax.ws.rs.core.Response;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientRequest;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class QueryConsumer {
	public static void main(String[] args) {
		String url = "http://localhost:9080/ArzDs_WB_Query/home/show";
		Client client = Client.create();
		WebResource resource = client.resource(url);
		resource = resource.queryParam("name", "ArzDs");
		resource.queryParam("id", "2");
		ClientResponse clientResponse = resource.get(ClientResponse.class);
		String res = clientResponse.getEntity(String.class);
		System.out.println(res);
	}
}
