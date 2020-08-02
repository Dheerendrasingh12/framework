package com.arzds.consumer;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientTest {
public static void main(String[] args) {
	String url="http://localhost:9080/ArzDsMediaTypeAnnotation/rest/home/msg";
	Client client=Client.create();
	WebResource resource=client.resource(url);
	ClientResponse clientResponse=resource.get(ClientResponse.class);
	System.out.println("Response "+clientResponse.getEntity(String.class));

	System.out.println("Status "+clientResponse.getStatus());
	System.out.println("info "+clientResponse.getStatusInfo());
	System.out.println("type "+clientResponse.getType());
}
}
