package edu.matc.persistence;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("/weight")
public class WeightConverter {
        // The Java method will process HTTP GET requests
    @GET
    @Path("/text/{param}")
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public Response getWeightText(@PathParam("param") String name) {
        // Return a simple message
        String output = "Hello from weight text method in WeightConverter";
        return Response.status(200).entity(output).build();
    }

}
