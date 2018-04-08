package edu.matc.persistence;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


/**
 * The type Volume converter.
 */
@Path("/volume")
public class VolumeConverter {


    /**
     * Gets volume in text format.
     *
     * @param inUnit   the entered system of volume
     * @param outUnit  the output system of volume
     * @param quantity the quantity using the entered system of volume
     * @return         the equivalent quantity in the output units of volume in text format
     */
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


    /**
     * Gets volume in HTML format.
     *
     * @param inUnit   the entered system of volume
     * @param outUnit  the output system of volume
     * @param quantity the quantity using the entered system of volume
     * @return         the equivalent quantity in the output units of volume in HTML format
     */
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

    /**
     * Gets volume in JSON format.
     *
     * @param inUnit   the entered system of volume
     * @param outUnit  the output system of volume
     * @param quantity the quantity using the entered system of volume
     * @return         the equivalent quantity in the output units of volume in JSON format
     */
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
                output = "{\n    " + inUnit + " : " + quantity + ",\n    "
                        + outUnit + " : " + convertedQuantity + "\n" + "}";
        }
        return Response.status(200).entity(output).build();

    }

    /**
     * Convert entered units of one system of volume into equivalent units of another system of volume.
     *
     * @param inUnit   the entered system of volume
     * @param outUnit  the output system of volume
     * @param quantity the quantity using the entered system of volume
     * @return         the equivalent quantity in the output units of volume
     */
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

    /**
     * Convert entered number of fluid ounces into equivalent units of another system of volume.
     *
     * @param quantity the quantity in fluid ounces
     * @param outUnit  the output system of fluid ounces
     * @return         the equivalent quantity in the output units of volume
     */
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

    /**
     * Convert entered number of teaspoons into equivalent units of another system of volume.
     *
     * @param quantity the quantity in teaspoons
     * @param outUnit  the output system of teaspoons
     * @return         the equivalent quantity in the output units of volume
     */
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

    /**
     * Convert entered number of tablespoons into equivalent units of another system of volume.
     *
     * @param quantity the quantity in tablespoons
     * @param outUnit  the output system of tablespoons
     * @return         the equivalent quantity in the output units of volume
     */
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

    /**
     * Convert entered number of cups into equivalent units of another system of volume.
     *
     * @param quantity the quantity in cups
     * @param outUnit  the output system of cups
     * @return         the equivalent quantity in the output units of volume
     */
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

    /**
     * Convert entered number of milliliters into equivalent units of another system of volume.
     *
     * @param quantity the quantity in milliliters
     * @param outUnit  the output system of milliliters
     * @return         the equivalent quantity in the output units of volume
     */
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

    /**
     * Convert entered number of liters into equivalent units of another system of volume.
     *
     * @param quantity the quantity in liters
     * @param outUnit  the output system of liters
     * @return         the equivalent quantity in the output units of volume
     */
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
