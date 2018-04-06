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
    @Produces("text/plain")
    @Path("/text/{inUnit}/{outUnit}/{quantity}")
    public Response getWeightText(
            @PathParam("inUnit") String inUnit,
            @PathParam("outUnit") String outUnit,
            @PathParam("quantity") double quantity) {

        String output = "";
        Double convertedQuantity = convertUnits(inUnit, outUnit, quantity);

        if (output.length() == 0) {
            output += quantity + " " + inUnit + " =  " + convertedQuantity + " " + outUnit;
        }

        return Response.status(200).entity(output).build();
    }


    @GET
    @Produces("text/html")
    @Path("/html/{inUnit}/{outUnit}/{quantity}")
    public Response getWeightHTML(
            @PathParam("inUnit") String inUnit,
            @PathParam("outUnit") String outUnit,
            @PathParam("quantity") double quantity) {

        String output = "";
        Double convertedQuantity = convertUnits(inUnit, outUnit, quantity);

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
    public Response getWeightJSON(
            @PathParam("inUnit") String inUnit,
            @PathParam("outUnit") String outUnit,
            @PathParam("quantity") double quantity) {

        String output = "";
        Double convertedQuantity = convertUnits(inUnit, outUnit, quantity);
        if (output.length() == 0) {
            output = "Hello  from length/json method";
        }
        return Response.status(200).entity(output).build();

    }

    private Double convertUnits(String inUnit, String outUnit, Double quantity) {
        switch (inUnit) {
            case ("oz") : return convertOunces(quantity, outUnit);

            case ("lbs") : return convertPounds(quantity, outUnit);

            case ("grains") : return convertGrains(quantity, outUnit);

            case ("tons") : return convertTons(quantity, outUnit);

            case ("grams") : return convertGrams(quantity, outUnit);

            case ("kilos") : return convertKilos(quantity, outUnit);

            default : return 0.0;
        }
    }

    private Double convertOunces (Double quantity, String outUnit) {

        switch (outUnit) {
            case ("lbs") : return (quantity / 16);

            case ("grains") : return (quantity * 437.5);

            case ("tons") : return (quantity / 32000);

            case ("grams") : return (quantity * 28.3495);

            case ("kilos") : return (quantity * 0.0283495);

            default : return 0.0;
        }
    }

    private Double convertPounds (Double quantity, String outUnit) {
        switch (outUnit) {
            case ("oz") : return (quantity * 16);

            case ("grains") : return (quantity * 7000);

            case ("tons") : return (quantity / 2000);

            case ("grams") : return (quantity * 453.592);

            case ("kilos") : return (quantity * 0.453592);

            default: return 0.0;
        }

    }

    private Double convertGrains (Double quantity, String outUnit) {

        switch (outUnit) {
            case ("oz") : return (quantity * 0.00228571);

            case ("lbs") : return (quantity / 7000);

            case ("tons") : return (quantity / 1400000);

            case ("grams") : return (quantity * 0.0647989);

            case ("kilos") : return (quantity * 0.0000647989);

            default: return 0.0;
        }
    }

    private Double convertTons (Double quantity, String outUnit) {

        switch (outUnit) {
            case ("oz") : return (quantity * 32000);

            case ("lbs") : return (quantity * 2000);

            case ("grains") : return (quantity * 1400000);

            case ("grams") : return (quantity * 907185);

            case ("kilos") : return (quantity * 907.185);

            default: return 0.0;
        }
    }

    private Double convertGrams (Double quantity, String outUnit) {
        switch (outUnit) {
            case ("oz") : return (quantity / 28.3495);

            case ("lbs") : return (quantity / 453.592);

            case ("grains") : return (quantity * 15.4324);

            case ("tons") : return (quantity / 907185);

            case ("kilos") : return (quantity / 1000);

            default: return 0.0;
        }
    }

    private Double convertKilos (Double quantity, String outUnit) {
        switch (outUnit) {
            case ("oz") : return (quantity / 0.0283495);

            case ("lbs") : return (quantity / 0.453592);

            case ("grains") : return (quantity * 15432.4);

            case ("tons") : return (quantity / 907.185);

            case ("grams") : return (quantity * 1000);

            default: return 0.0;
        }
    }
}
