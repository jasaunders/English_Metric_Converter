package edu.matc.persistence;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


/**
 * The type Weight converter.
 */
@Path("/weight")
public class WeightConverter {


    /**
     * Gets weight in text format.
     *
     * @param inUnit   the entered system of weight
     * @param outUnit  the output system of weight
     * @param quantity the quantity using the entered system of weight
     * @return         the equivalent quantity in the output units of weight in text format
     *
     */
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


    /**
     * Gets weight in HTML format.
     *
     * @param inUnit   the entered system of weight
     * @param outUnit  the output system of weight
     * @param quantity the quantity using the entered system of weight
     * @return         the equivalent quantity in the output units of weight in HTML format
     *
     */

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
            output = "<h1>"
                    + quantity
                    + " "
                    + inUnit
                    + " = "
                    + convertedQuantity
                    + " "
                    + outUnit
                    + "</h1>";
        }
        return Response.status(200).entity(output).build();

    }

    /**
     * Gets weight in JSON format.
     *
     * @param inUnit   the entered system of weight
     * @param outUnit  the output system of weight
     * @param quantity the quantity using the entered system of weight
     * @return         the equivalent quantity in the output units of weight in JSON format
     */
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
            output = "{ \"inUnit\" : " + "\"" + inUnit + "\",\n"
                    + "\"outUnit\" : " + "\"" + outUnit + "\",\n"
                    + "\"quantity\" : " + quantity + ",\n"
                    + "\"convertedQuantity\" : " + convertedQuantity + "\n"
                    + "}";
        }
        return Response.status(200).entity(output).build();

    }

    /**
     * Convert entered units of one system of weight into equivalent units of another system of weight.
     *
     * @param inUnit   the entered system of weight
     * @param outUnit  the output system of weight
     * @param quantity the quantity using the entered system of weight
     * @return         the equivalent quantity in the output units of weight
     */
    public Double convertUnits(String inUnit, String outUnit, Double quantity) {
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

    /**
     * Convert entered number of ounces into equivalent units of another system of weight.
     *
     * @param quantity the quantity in ounces
     * @param outUnit  the output system of ounces
     * @return         the equivalent quantity in the output units of weight
     */
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

    /**
     * Convert entered number of pounds into equivalent units of another system of weight.
     *
     * @param quantity the quantity in pounds
     * @param outUnit  the output system of pounds
     * @return         the equivalent quantity in the output units of weight
     */
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

    /**
     * Convert entered number of grains into equivalent units of another system of weight.
     *
     * @param quantity the quantity in grains
     * @param outUnit  the output system of grains
     * @return         the equivalent quantity in the output units of weight
     */
    private Double convertGrains (Double quantity, String outUnit) {

        switch (outUnit) {
            case ("oz") : return (quantity * 0.00228571);

            case ("lbs") : return (quantity / 7000);

            case ("tons") : return (quantity / 14000000);

            case ("grams") : return (quantity * 0.0647989);

            case ("kilos") : return (quantity * 0.0000647989);

            default: return 0.0;
        }
    }

    /**
     * Convert entered number of tons into equivalent units of another system of weight.
     *
     * @param quantity the quantity in tons
     * @param outUnit  the output system of tons
     * @return         the equivalent quantity in the output units of weight
     */
    private Double convertTons (Double quantity, String outUnit) {

        switch (outUnit) {
            case ("oz") : return (quantity * 32000);

            case ("lbs") : return (quantity * 2000);

            case ("grains") : return (quantity * 14000000);

            case ("grams") : return (quantity * 907185);

            case ("kilos") : return (quantity * 907.185);

            default: return 0.0;
        }
    }

    /**
     * Convert entered number of grams into equivalent units of another system of weight.
     *
     * @param quantity the quantity in grams
     * @param outUnit  the output system of grams
     * @return         the equivalent quantity in the output units of weight
     */
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

    /**
     * Convert entered number of kilograms into equivalent units of another system of weight.
     *
     * @param quantity the quantity in kilograms
     * @param outUnit  the output system of kilograms
     * @return         the equivalent quantity in the output units of weight
     */
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
