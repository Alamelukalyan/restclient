package com.jersey.helloworld;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cts")
public class HelloJersey {

@GET
@Path("/hello")
@Produces(MediaType.TEXT_PLAIN)
public String SayHello(){
	String str="hello jersey gvbfgf";
	return str;
}
@Path("/{urlvalue1}/{urlvalue2}")
@Produces(MediaType.TEXT_PLAIN)
public String SayHello1(@PathParam("urlvalue1")String value,@PathParam("urlvalue2")Integer value2 ){
	String str1="hello jersey gvbfgf "+value +(value2+10);
	return str1;
}

}
