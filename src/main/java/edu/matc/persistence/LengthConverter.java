package edu.matc.persistence;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/length")
public class LengthConverter {

    private Double convertedQuantity = 0.0;
    private String output;


    // The Java method will process HTTP GET requests
    @GET
    @Produces("text/plain")
    @Path("/text/{inUnit}/{outUnit}/{quantity}")
    public Response getLengthText(
            @PathParam("inUnit") String inUnit,
            @PathParam("outUnit") String outUnit,
            @PathParam("quantity") double quantity) {

        convertUnits(inUnit, outUnit, quantity);
        //determine if error in output output.length > 0?
        //if length = 0, then do this:
        output += quantity + " " + inUnit + " =  " + convertedQuantity + " " + outUnit; // call format text function

        return Response.status(200).entity(output).build();
    }


    @GET
    @Produces("text/html")
    @Path("/html/{inUnit}/{outUnit}/{quantity}")
    public Response getLengthHTML(
            @PathParam("inUnit") String inUnit,
            @PathParam("outUnit") String outUnit,
            @PathParam("quantity") double quantity) {

        convertUnits(inUnit, outUnit, quantity);
        String output = "<html> <title>length converter</title> "
                + "<body><h1>"
                + quantity
                + " "
                + inUnit
                + " = "
                + convertedQuantity
                + " "
                + outUnit
                + "</h1></body></html>";
        return Response.status(200).entity(output).build();

    }

    @GET
    @Produces("text/json")
    @Path("/json/{inUnit}/{outUnit}/{quantity}")
    public Response getLengthJSON(
            @PathParam("inUnit") String inUnit,
            @PathParam("outUnit") String outUnit,
            @PathParam("quantity") double quantity) {

        convertUnits(inUnit, outUnit, quantity);
        String output = "Hello  from length/json method";
        return Response.status(200).entity(output).build();

    }

    private void convertUnits(String inUnit, String outUnit, Double quantity) {
        switch (inUnit) {
            case ("in") : convertInches(quantity, outUnit);
                break;
            case ("ft") : convertFeet(quantity, outUnit);
                break;
            case ("yard") : convertYard(quantity, outUnit);
                break;
            case ("mile") : convertMile(quantity, outUnit);
                break;
            case ("mm") : convertMM(quantity, outUnit);
                break;
            case ("km") : convertKM(quantity, outUnit);
                break;
            default : output = "error determining input units.";

        }
    }

    private void convertInches (Double quantity, String outUnit) {

        switch (outUnit) {

            case ("ft") : convertedQuantity = (quantity / 12);
                break;
            case ("yard") : convertedQuantity = (quantity / 36);
                break;
            case ("mile") : convertedQuantity = (quantity / 63360);
                break;
            case ("mm") : convertedQuantity = (quantity * 25.4);
                break;
            case ("cm") : convertedQuantity = (quantity * 2.54);
                break;
            case ("m") : convertedQuantity = (quantity * .0254);
                break;
            case ("km") : convertedQuantity = (quantity * 2.54e-5);
                break;
            default : output = "error converting inches";
        }

    }

    private void convertFeet (Double quantity, String outUnit) {
        switch (outUnit) {
            case ("in"):
                convertedQuantity = quantity * 12;
                break;
            case ("yard"):
                convertedQuantity = quantity / 3;
                break;
            case ("mile"):
                convertedQuantity = quantity / 1000; // need to reassess this formula
                break;
            case ("mm"):
                convertedQuantity = quantity; // need formula
                break;
            case ("cm"):
                convertedQuantity = quantity; // need formula
                break;
            case ("m"):
                convertedQuantity = quantity; // need formula
                break;
            case ("km"):
                convertedQuantity = quantity; // need formula
                break;
            default:
                output = "error converting ft";
        }

    }

    private void convertYard (Double quantity, String outUnit) {

        convertedQuantity = 0.0;
    }
    private void convertMile (Double quantity, String outUnit) {

        convertedQuantity = 0.0;
    }

    private void convertMM (Double quantity, String outUnit) {

        convertedQuantity = 0.0;
    }

    private void convertKM (Double quantity, String outUnit) {

        convertedQuantity = 0.0;
    }

}
