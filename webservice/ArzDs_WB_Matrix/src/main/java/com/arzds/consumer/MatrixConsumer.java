package com.arzds.consumer;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class MatrixConsumer {
	public static void main(String[] args) {
		String url = "http://localhost:9080/ArzDs_WB_Matrixs/show;name=Arzds;id=12";
		Client client = Client.create();
		WebResource resource = client.resource(url);
		ClientResponse response = resource.get(ClientResponse.class);
		String res = response.getEntity(String.class);
		System.out.println(res);
	}
}
