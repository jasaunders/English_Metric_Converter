package edu.matc.persistence;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/length")
public class LengthConverter {
    // The Java method will process HTTP GET requests
    @GET
    @Path("/text/{param}")
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public Response getLengthText(@PathParam("param") String name) {
        // Return a simple message
        String output = "Hello from length text method in LengthConverter";
        return Response.status(200).entity(output).build();
    }

    @GET
    @Path("/html/{param}")
    @Produces("text/html")
    public Response getLengthHTML(@PathParam("param") String name) {
        //return message as html
        String output = "<html> <title>HTML from HelloWorld</title> "
                + "<body><h1>Hello from length html method"
                + "</h1></body></html>";
        return Response.status(200).entity(output).build();

    }

    @GET
    @Path("/json/{param}")
    @Produces("text/json")
    public Response getLengthJSON(@PathParam("param") String name) {
        //return message as html
        String output = "Hello  from length/json method";
        return Response.status(200).entity(output).build();

    }
}
