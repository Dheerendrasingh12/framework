package com.arzds.consurmerApplication;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientTest {
	public static void main(String[] args) {
		String url = "http://localhost:9080/ArzDsExweb1/rest/provider/msg";
		Client c = Client.create();

		WebResource resource = c.resource(url);
		ClientResponse clientResponse = resource.get(ClientResponse.class);

		String clientResponseData = clientResponse.getEntity(String.class);
		System.out.println(clientResponseData);

		System.out.println(clientResponse.getStatus());
		System.out.println(clientResponse.getStatusInfo());
	}
}
