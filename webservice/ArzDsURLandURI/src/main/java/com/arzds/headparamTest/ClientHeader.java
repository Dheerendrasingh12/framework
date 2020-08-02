package com.arzds.headparamTest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientHeader {
public static void main(String[] args) {
	String url="http://localhost:9080/ArzDsHeaderParam/headerParam/hearderParam/msg";
	Client client=Client.create();
	WebResource resource=client.resource(url);
	ClientResponse  response=resource.header("user", "D").header("pwd", "dsarz").header("pwd", "arzds").header("user", "A").header("pd", "pd").get(ClientResponse.class);
	System.out.println(response.getEntity(String.class));
}
}
