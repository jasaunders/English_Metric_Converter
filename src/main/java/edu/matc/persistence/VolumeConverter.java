package edu.matc.persistence;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("/volume")
public class VolumeConverter {


    // The Java method will process HTTP GET requests
    @GET
    @Produces("text/plain")
    @Path("/text/{inUnit}/{outUnit}/{quantity}")
    public Response getVolumeText(
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
    public Response getVolumeHTML(
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
    public Response getVolumeJSON(
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
            case ("ozfl") : return convertFluidOunces(quantity, outUnit);

            case ("tsp") : return convertTeaspoons(quantity, outUnit);

            case ("tbsp") : return convertTablespoons(quantity, outUnit);

            case ("cups") : return convertCups(quantity, outUnit);

            case ("ml") : return convertMilliliters(quantity, outUnit);

            case ("liters") : return convertLiters(quantity, outUnit);

            default : return 0.0;
        }
    }

    private Double convertFluidOunces (Double quantity, String outUnit) {

        switch (outUnit) {
            case ("tsp") : return (quantity * 6);

            case ("tbsp") : return (quantity * 2);

            case ("cups") : return (quantity / 8);

            case ("ml") : return (quantity * 29.5735);

            case ("liters") : return (quantity * 0.0295735);

            default : return 0.0;
        }
    }

    private Double convertTeaspoons (Double quantity, String outUnit) {
        switch (outUnit) {
            case ("ozfl") : return (quantity / 6);

            case ("tbsp") : return (quantity / 3);

            case ("cups") : return (quantity / 48);

            case ("ml") : return (quantity * 4.92892);

            case ("liters") : return (quantity * 0.00492892);

            default : return 0.0;
        }

    }

    private Double convertTablespoons(Double quantity, String outUnit) {

        switch (outUnit) {
            case ("ozfl") : return (quantity / 2);

            case ("tsp") : return (quantity * 3);

            case ("cups") : return (quantity / 16);

            case ("ml") : return (quantity * 14.7868);

            case ("liters") : return (quantity * 0.0147868);

            default : return 0.0;
        }
    }

    private Double convertCups (Double quantity, String outUnit) {

        switch (outUnit) {
            case ("ozfl") : return (quantity * 8);

            case ("tsp") : return (quantity * 48);

            case ("tbsp") : return (quantity * 16);

            case ("ml") : return (quantity * 236.588);

            case ("liters") : return (quantity * 0.236588);

            default : return 0.0;
        }

    }

    private Double convertMilliliters (Double quantity, String outUnit) {
        switch (outUnit) {
            case ("ozfl") : return (quantity * 0.033814);

            case ("tsp") : return (quantity * 0.202884);

            case ("tbsp") : return (quantity * 0.067628);

            case ("cups") : return (quantity / 236.588);

            case ("liters") : return (quantity / 1000);

            default : return 0.0;
        }

    }

    private Double convertLiters (Double quantity, String outUnit) {
        switch (outUnit) {
            case ("ozfl") : return (quantity * 33.814);

            case ("tsp") : return (quantity * 202.884);

            case ("tbsp") : return (quantity * 67.628);

            case ("cups") : return (quantity / 0.236588);

            case ("ml") : return (quantity * 1000);

            default : return 0.0;
        }
    }
}
