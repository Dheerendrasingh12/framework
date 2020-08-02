package com.arzds.consumer;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.representation.Form;

public class Consumer {
	public static void main(String[] args) {
		Client client = Client.create();
		String url = "http://localhost:9080/ArzDs_WB_Form/home/save";
		WebResource resource = client.resource(url);
		Form form = new Form();
		form.add("name", "ArzDs");
		form.add("eid", "12");
		ClientResponse clientResponse = resource.post(ClientResponse.class, form);
		String res = clientResponse.getEntity(String.class);
		System.out.println(res);

	}
}
