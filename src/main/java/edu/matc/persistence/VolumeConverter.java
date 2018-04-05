package edu.matc.persistence;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("/volume")
public class VolumeConverter {

    private Double convertedQuantity = 0.0;
    private String output = "";

    // The Java method will process HTTP GET requests
    @GET
    @Produces("text/plain")
    @Path("/text/{inUnit}/{outUnit}/{quantity}")
    public Response getVolumeText(
            @PathParam("inUnit") String inUnit,
            @PathParam("outUnit") String outUnit,
            @PathParam("quantity") double quantity) {

        convertUnits(inUnit, outUnit, quantity);

        if (output.length() == 0) {
            output += quantity + " " + inUnit + " =  " + convertedQuantity + " " + outUnit;
        }

        return Response.status(200).entity(output).build();
    }


    @GET
    @Produces("text/html")
    @Path("/html/{inUnit}/{outUnit}/{quantity}")
    public Response getVolumeHTML(
            @PathParam("inUnit") String inUnit,
            @PathParam("outUnit") String outUnit,
            @PathParam("quantity") double quantity) {

        convertUnits(inUnit, outUnit, quantity);
        if (output.length() == 0) {
            output = "<html> <title>length converter</title> "
                    + "<body><h1>"
                    + quantity
                    + " "
                    + inUnit
                    + " = "
                    + convertedQuantity
                    + " "
                    + outUnit
                    + "</h1></body></html>";
        }
        return Response.status(200).entity(output).build();

    }

    @GET
    @Produces("text/json")
    @Path("/json/{inUnit}/{outUnit}/{quantity}")
    public Response getVolumeJSON(
            @PathParam("inUnit") String inUnit,
            @PathParam("outUnit") String outUnit,
            @PathParam("quantity") double quantity) {

        convertUnits(inUnit, outUnit, quantity);
        if (output.length() == 0) {
            output = "Hello  from length/json method";
        }
        return Response.status(200).entity(output).build();

    }

    private void convertUnits(String inUnit, String outUnit, Double quantity) {
        switch (inUnit) {
            case ("ozfl") : convertFluidOunces(quantity, outUnit);
                break;
            case ("tsp") : convertTeaspoons(quantity, outUnit);
                break;
            case ("tbsp") : convertTablespoons(quantity, outUnit);
                break;
            case ("cups") : convertCups(quantity, outUnit);
                break;
            case ("ml") : convertMilliliters(quantity, outUnit);
                break;
            case ("liters") : convertLiters(quantity, outUnit);
                break;
            default : output = "error determining input units.";
        }
    }

    private void convertFluidOunces (Double quantity, String outUnit) {

        switch (outUnit) {
            case ("tsp") : convertedQuantity = (quantity * 6);
                break;
            case ("tbsp") : convertedQuantity = (quantity * 2);
                break;
            case ("cups") : convertedQuantity = (quantity / 8);
                break;
            case ("ml") : convertedQuantity = (quantity * 29.5735);
                break;
            case ("liters") : convertedQuantity = (quantity * 0.0295735);
                break;
            default : output = "error converting fluid ounces";
        }
    }

    private void convertTeaspoons (Double quantity, String outUnit) {
        switch (outUnit) {
            case ("ozfl") : convertedQuantity = (quantity / 6);
                break;
            case ("tbsp") : convertedQuantity = (quantity / 3);
                break;
            case ("cups") : convertedQuantity = (quantity / 48);
                break;
            case ("ml") : convertedQuantity = (quantity * 4.92892);
                break;
            case ("liters") : convertedQuantity = (quantity * 0.00492892);
                break;
            default : output = "error converting teaspoons";
        }

    }

    private void convertTablespoons(Double quantity, String outUnit) {

        switch (outUnit) {
            case ("ozfl") : convertedQuantity = (quantity / 2);
                break;
            case ("tsp") : convertedQuantity = (quantity * 3);
                break;
            case ("cups") : convertedQuantity = (quantity / 16);
                break;
            case ("ml") : convertedQuantity = (quantity * 14.7868);
                break;
            case ("liters") : convertedQuantity = (quantity * 0.0147868);
                break;
            default : output = "error converting tablespoons";
        }
    }

    private void convertCups (Double quantity, String outUnit) {

        switch (outUnit) {
            case ("ozfl") : convertedQuantity = (quantity * 8);
                break;
            case ("tsp") : convertedQuantity = (quantity * 48);
                break;
            case ("tbsp") : convertedQuantity = (quantity * 16);
                break;
            case ("ml") : convertedQuantity = (quantity * 236.588);
                break;
            case ("liters") : convertedQuantity = (quantity * 0.236588);
                break;
            default : output = "error converting cups";
        }
    }

    private void convertMilliliters (Double quantity, String outUnit) {
        switch (outUnit) {
            case ("ozfl") : convertedQuantity = (quantity * 0.033814);
                break;
            case ("tsp") : convertedQuantity = (quantity * 0.202884);
                break;
            case ("tbsp") : convertedQuantity = (quantity * 0.067628);
                break;
            case ("cups") : convertedQuantity = (quantity / 236.588);
                break;
            case ("liters") : convertedQuantity = (quantity / 1000);
                break;
            default : output = "error converting milliliters";
        }
    }

    private void convertLiters (Double quantity, String outUnit) {
        switch (outUnit) {
            case ("ozfl") : convertedQuantity = (quantity * 33.814);
                break;
            case ("tsp") : convertedQuantity = (quantity * 202.884);
                break;
            case ("tbsp") : convertedQuantity = (quantity * 67.628);
                break;
            case ("cups") : convertedQuantity = (quantity / 0.236588);
                break;
            case ("ml") : convertedQuantity = (quantity * 1000);
                break;
            default : output = "error converting liters";

        }
    }
}
