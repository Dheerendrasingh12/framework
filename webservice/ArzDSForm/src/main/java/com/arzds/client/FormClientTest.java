package com.arzds.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.representation.Form;

public class FormClientTest {
public static void main(String[] args) {
	String url="http://localhost:9080/ArzDSForm/from/formParam/formMsg";
	Client client=Client.create();
	WebResource resource=client.resource(url);
	Form form=new Form();
	form.add("eid", 12);
	form.add("ename", "D");
	// this is treated as xtra key because form request he needed sal but we are giving as esal
	form.add("esal", 98.65);
	ClientResponse clientResponse= resource.post(ClientResponse.class,form);
	String resp=clientResponse.getEntity(String.class);
	System.out.println(resp);
	System.out.println(clientResponse.getStatus());
	System.out.println(clientResponse.getStatusInfo());
	
}
}
