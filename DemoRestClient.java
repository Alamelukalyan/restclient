package com.demo.restclient;
import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class DemoRestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("I will upgrade to rest client");
		
		ClientConfig config = new ClientConfig();
		
		Client client = ClientBuilder.newClient(config);
		
		WebTarget webTarget = client.target(getCustomURI());
		
		String response = webTarget.path("rest")
									.path("first")
									.path("hello")
									.request().accept(MediaType.TEXT_PLAIN)
									.get(Response.class)
									.toString();
		
		System.out.println(response);
		
		String message = webTarget.path("rest")
									.path("cts")
									.path("hello")
									.request().accept(MediaType.TEXT_PLAIN)
									.get(String.class)
									.toString();
		
		System.out.println(message);
		
		
		
	}

	private static URI getCustomURI() {
		// TODO Auto-generated method stub
		
		return UriBuilder
				.fromUri("http://localhost:8080/REstWeb").build();
		
	
	}

}