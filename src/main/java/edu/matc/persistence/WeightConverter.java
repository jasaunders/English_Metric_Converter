package edu.matc.persistence;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("/weight")
public class WeightConverter {

    private Double convertedQuantity = 0.0;
    private String output = "";

    // The Java method will process HTTP GET requests
    @GET
    @Produces("text/plain")
    @Path("/text/{inUnit}/{outUnit}/{quantity}")
    public Response getLengthText(
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
    public Response getLengthHTML(
            @PathParam("inUnit") String inUnit,
            @PathParam("outUnit") String outUnit,
            @PathParam("quantity") double quantity) {

        convertUnits(inUnit, outUnit, quantity);
        if (output.length() == 0) {
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
        }
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
        if (output.length() == 0) {
            String output = "Hello  from length/json method";
        }
        return Response.status(200).entity(output).build();

    }

    private void convertUnits(String inUnit, String outUnit, Double quantity) {
        switch (inUnit) {
            case ("oz") : convertOunces(quantity, outUnit);
                break;
            case ("lbs") : convertPounds(quantity, outUnit);
                break;
            case ("grains") : convertGrains(quantity, outUnit);
                break;
            case ("tons") : convertTons(quantity, outUnit);
                break;
            case ("grams") : convertGrams(quantity, outUnit);
                break;
            case ("kilos") : convertKilos(quantity, outUnit);
                break;
            default : output = "error determining input units.";
        }
    }

    private void convertOunces (Double quantity, String outUnit) {

        switch (outUnit) {
            case ("lbs") : convertedQuantity = (quantity / 16);
                break;
            case ("grains") : convertedQuantity = (quantity * 437.5);
                break;
            case ("tons") : convertedQuantity = (quantity / 32000);
                break;
            case ("grams") : convertedQuantity = (quantity * 28.3495);
                break;
            case ("kilos") : convertedQuantity = (quantity * 0.0283495);
                break;
            default : output = "error converting ounces";
        }
    }

    private void convertPounds (Double quantity, String outUnit) {
        switch (outUnit) {
            case ("oz") : convertedQuantity = (quantity * 16);
                break;
            case ("grains") : convertedQuantity = (quantity * 7000);
                break;
            case ("tons") : convertedQuantity = (quantity / 2000);
                break;
            case ("grams") : convertedQuantity = (quantity * 453.592);
                break;
            case ("kilos") : convertedQuantity = (quantity * 0.453592);
                break;
            default: output = "error converting pounds";
        }

    }

    private void convertGrains (Double quantity, String outUnit) {

        switch (outUnit) {
            case ("oz") : convertedQuantity = (quantity * 0.00228571);
                break;
            case ("lbs") : convertedQuantity = (quantity / 7000);
                break;
            case ("tons") : convertedQuantity = (quantity / 1400000);
                break;
            case ("grams") : convertedQuantity = (quantity * 0.0647989);
                break;
            case ("kilos") : convertedQuantity = (quantity * 0.0000647989);
                break;
            default: output = "error converting grains";
        }
    }

    private void convertTons (Double quantity, String outUnit) {

        switch (outUnit) {
            case ("oz") : convertedQuantity = (quantity * 32000);
                break;
            case ("lbs") : convertedQuantity = (quantity * 2000);
                break;
            case ("grains") : convertedQuantity = (quantity * 1400000);
                break;
            case ("grams") : convertedQuantity = (quantity * 907185);
                break;
            case ("kilos") : convertedQuantity = (quantity * 907.185);
                break;
            default: output = "error converting short tons";
        }
    }

    private void convertGrams (Double quantity, String outUnit) {
        switch (outUnit) {
            case ("oz") : convertedQuantity = (quantity / 28.3495);
                break;
            case ("lbs") : convertedQuantity = (quantity / 453.592);
                break;
            case ("grains") : convertedQuantity = (quantity * 15.4324);
                break;
            case ("tons") : convertedQuantity = (quantity / 907185);
                break;
            case ("kilos") : convertedQuantity = (quantity / 1000);
                break;
            default: output = "error converting grams";
        }
    }

    private void convertKilos (Double quantity, String outUnit) {
        switch (outUnit) {
            case ("oz") : convertedQuantity = (quantity / 0.0283495);
                break;
            case ("lbs") : convertedQuantity = (quantity / 0.453592);
                break;
            case ("grains") : convertedQuantity = (quantity * 15432.4);
                break;
            case ("tons") : convertedQuantity = (quantity / 907.185);
                break;
            case ("grams") : convertedQuantity = (quantity * 1000);
                break;
            default: output = "error converting short tons";
        }
    }
}
