package edu.matc.persistence;

import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.GET;

import javax.ws.rs.core.Response;


/**
 * The type Length converter.
 */
@Path("/length")
public class LengthConverter {


    /**
     * Gets length in text format.
     *
     * @param inUnit   the entered system of length
     * @param outUnit  the output system of length
     * @param quantity the quantity using the entered system of length
     * @return         the equivalent quantity in the output units of length in text format
     */
// The Java method will process HTTP GET requests
    @GET
    @Produces("text/plain")
    @Path("/text/{inUnit}/{outUnit}/{quantity}")
    public Response getLengthText(
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
     * Gets length in HTML format.
     *
     * @param inUnit   the entered system of length
     * @param outUnit  the output system of length
     * @param quantity the quantity using the entered system of length
     * @return         the equivalent quantity in the output units of length in HTML format
     */
    @GET
    @Produces("text/html")
    @Path("/html/{inUnit}/{outUnit}/{quantity}")
    public Response getLengthHTML(
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
     * Gets length in JSON format.
     *
     * @param inUnit   the entered system of length
     * @param outUnit  the output system of length
     * @param quantity the quantity using the entered system of length
     * @return         the equivalent quantity in the output units of length in JSON format
     */
    @GET
    @Produces("text/json")
    @Path("/json/{inUnit}/{outUnit}/{quantity}")
    public Response getLengthJSON(
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
     * Convert entered units of one system of length into equivalent units of another system of length.
     *
     * @param inUnit   the entered system of length
     * @param outUnit  the output system of length
     * @param quantity the quantity using the entered system of length
     * @return         the equivalent quantity in the output units of length
     */
    public Double convertUnits(String inUnit, String outUnit, Double quantity) {
        switch (inUnit) {
            case ("inches") : return convertInches(quantity, outUnit);

            case ("feet") : return convertFeet(quantity, outUnit);

            case ("yards") : return convertYards(quantity, outUnit);

            case ("miles") : return convertMiles(quantity, outUnit);

            case ("mm") : return convertMM(quantity, outUnit);

            case ("cm") : return convertCM(quantity, outUnit);

            case ("meters") : return convertMeters(quantity, outUnit);

            case ("km") : return convertKM(quantity, outUnit);

            default : return 0.0;
        }
    }

    /**
     * Convert entered number of inches into equivalent units of another system of length.
     *
     * @param quantity the quantity in inches
     * @param outUnit  the output system of length
     * @return         the equivalent quantity in the output units of length
     */
    private Double convertInches (Double quantity, String outUnit) {

        switch (outUnit) {

            case ("feet") : return (quantity / 12);

            case ("yards") : return (quantity / 36);

            case ("miles") : return (quantity / 63360);

            case ("mm") : return (quantity * 25.4);

            case ("cm") : return (quantity * 2.54);

            case ("meters") : return (quantity * .0254);

            case ("km") : return (quantity * 2.54e-5);

            default : return 0.0;
        }

    }

    /**
     * Convert entered number of feet into equivalent units of another system of length.
     *
     * @param quantity the quantity in feet
     * @param outUnit  the output system of length
     * @return         the equivalent quantity in the output units of length
     */
    private Double convertFeet (Double quantity, String outUnit) {
        switch (outUnit) {
            case ("inches"): return (quantity * 12.00);

            case ("yards"): return (quantity / 3.00);

            case ("miles"): return (quantity * 0.000189394);

            case ("mm"): return (quantity * 304.80);

            case ("cm"): return (quantity * 30.48);

            case ("meters"): return (quantity * 0.3048);

            case ("km"): return (quantity * 0.0003048);

            default: return 0.0;
        }

    }

    /**
     * Convert entered number of yards into equivalent units of another system of length.
     *
     * @param quantity the quantity in yards
     * @param outUnit  the output system of length
     * @return         the equivalent quantity in the output units of length
     */
    private Double convertYards (Double quantity, String outUnit) {

        switch (outUnit) {
            case ("inches"): return (quantity * 36.00);
            case ("feet"): return (quantity * 3);

            case ("miles"): return (quantity * 0.00056818);

            case ("mm"): return (quantity * 914.4);

            case ("cm"): return (quantity * 91.44);

            case ("meters"): return (quantity * 0.9144);

            case ("km"): return (quantity * 0.0009144);

            default: return 0.0;
        }
    }

    /**
     * Convert entered number of miles into equivalent units of another system of length.
     *
     * @param quantity the quantity in miles
     * @param outUnit  the output system of length
     * @return         the equivalent quantity in the output units of length
     */
    private Double convertMiles (Double quantity, String outUnit) {

        switch (outUnit) {
            case ("inches"): return (quantity * 63360);

            case ("feet"):
                return (quantity * 5280);

            case ("yards"):
                return (quantity * 1760);

            case ("mm"):
                return (quantity * 1.609e+6);

            case ("cm"):
                return (quantity * 160934);

            case ("meters"):
                return (quantity * 1609.34);

            case ("km"):
                return (quantity * 1.60934);

            default: return 0.0;
        }
    }

    /**
     * Convert entered number of millimeters into equivalent units of another system of length.
     *
     * @param quantity the quantity in millimeters
     * @param outUnit  the output system of length
     * @return         the equivalent quantity in the output units of length
     */
    private Double convertMM (Double quantity, String outUnit) {

        switch (outUnit) {
            case ("inches"):
                return (quantity * 0.0393701);

            case ("feet"):
                return (quantity * 0.00328084);

            case ("yards"):
                return (quantity * 0.00109361);

            case ("miles"):
                return (quantity * 6.2137e-7);

            case ("cm"):
                return (quantity * 0.1);

            case ("meters"):
                return (quantity * 0.001);

            case ("km"):
                return (quantity * 1e-6);

            default: return 0.0;
        }
    }

    /**
     * Convert entered number of kilometers into equivalent units of another system of length.
     *
     * @param quantity the quantity in kilometers
     * @param outUnit  the output system of length
     * @return         the equivalent quantity in the output units of length
     */
    private Double convertKM (Double quantity, String outUnit) {

        switch (outUnit) {
            case ("inches"):
                return (quantity * 39370.1);

            case ("feet"):
                return (quantity * 3280.84);

            case ("yards"):
                return (quantity / 0.0009144);

            case ("miles"):
                return (quantity * 0.621371);

            case ("cm"):
                return (quantity * 100000);

            case ("meters"):
                return (quantity * 1000);

            case ("mm"):
                return (quantity * 1e+6);

            default: return 0.0;
        }
    }

    /**
     * Convert entered number of centimeters into equivalent units of another system of length.
     *
     * @param quantity the quantity in centimeters
     * @param outUnit  the output system of length
     * @return         the equivalent quantity in the output units of length
     */
    private Double convertCM (Double quantity, String outUnit) {

        switch (outUnit) {
            case ("inches"):
                return (quantity * 0.393701);

            case ("feet"):
                return (quantity * 0.0328084);

            case ("yards"):
                return (quantity * 0.0109361);

            case ("miles"):
                return (quantity * 6.2137e-6);

            case ("km"):
                return (quantity * 1e-5);

            case ("meters"):
                return (quantity * 0.01);

            case ("mm"):
                return (quantity * 10);

            default: return 0.0;
        }
    }

    /**
     * Convert entered number of meters into equivalent units of another system of length.
     *
     * @param quantity the quantity in meters
     * @param outUnit  the output system of length
     * @return         the equivalent quantity in the output units of length
     */
    private Double convertMeters (Double quantity, String outUnit) {

        switch (outUnit) {
            case ("inches"):
                return (quantity * 39.3701);

            case ("feet"):
                return (quantity * 3.28084);

            case ("yards"):
                return (quantity * 1.09361);

            case ("miles"):
                return (quantity * 0.000621371);

            case ("km"):
                return (quantity * 0.001);

            case ("cm"):
                return (quantity * 100);

            case ("mm"):
                return (quantity * 1000);

            default: return 0.0;
        }
    }

}
