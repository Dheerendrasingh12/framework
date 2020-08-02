package com.arzds.ConsumerCode;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class TestClient {
	public static void main(String[] args) {
		String url = "http://localhost:9080/ArdsParam/param/paramHome/queryParam?eid=12&ename=D&esal=2.2";
		Client c = Client.create();
		WebResource resource = c.resource(url);
		resource.queryParam("ename", "DsArz");
		resource.queryParam("esal", "21.04");
		resource.queryParam("eadb", "df");
		ClientResponse clientResponse = resource.get(ClientResponse.class);
		String str = clientResponse.getEntity(String.class);

		System.out.println(str);
		System.out.println(clientResponse.getStatus());
		System.out.println(clientResponse.getStatusInfo());
		String matrixUrl = "http://localhost:9080/ArdsParam/param/paramHome/matrixParam;eid=5;ename=D;esal=1000000.0";
		Client matrixClient=Client.create();
		WebResource matrixResource=matrixClient.resource(matrixUrl);
		matrixResource.queryParam("ename", "DSArz");
		ClientResponse matrixResponse=matrixResource.get(ClientResponse.class);
		str=matrixResponse.getEntity(String.class);

		System.out.println(str);
		System.out.println(clientResponse.getStatus());
		System.out.println(clientResponse.getStatusInfo());

	}
}
