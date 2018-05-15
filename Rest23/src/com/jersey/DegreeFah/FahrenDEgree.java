package com.jersey.DegreeFah;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cts")
public class FahrenDEgree {

@GET
@Path("/{urlvalue1}/{url2}")
@Produces(MediaType.TEXT_PLAIN)
public Integer SayHello(@PathParam("urlvalue1")Integer value1,@PathParam("url2")String value3 ){
	int cels=0;
	if(value3.equalsIgnoreCase("C")){
 cels = (value1*9/5)+ 32;
	
	}
	else if(value3.equalsIgnoreCase("F")){
		System.out.println("hjgf");
		cels=(value1-32*5/9);
		
	}
	return cels;
}
/*@GET
@Path("/{urlvalue1}/{F}")
@Produces(MediaType.TEXT_PLAIN)
public Integer SayHello1(@PathParam("urlvalue1")Integer value,@PathParam("urlvalue2")String value2 ){
	int celius = (value-32)*(5/9);
	return celius;
}*/

}
