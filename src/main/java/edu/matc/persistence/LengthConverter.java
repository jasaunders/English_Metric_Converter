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
            case ("inches") : convertInches(quantity, outUnit);
                break;
            case ("feet") : convertFeet(quantity, outUnit);
                break;
            case ("yards") : convertYards(quantity, outUnit);
                break;
            case ("miles") : convertMiles(quantity, outUnit);
                break;
            case ("mm") : convertMM(quantity, outUnit);
                break;
            case ("cm") : convertCM(quantity, outUnit);
                break;
            case ("meters") : convertMMeters(quantity, outUnit);
                break;
            case ("km") : convertKM(quantity, outUnit);
                break;
            default : output = "error determining input units.";
        }
    }

    private void convertInches (Double quantity, String outUnit) {

        switch (outUnit) {

            case ("feet") : convertedQuantity = (quantity / 12);
                break;
            case ("yards") : convertedQuantity = (quantity / 36);
                break;
            case ("miles") : convertedQuantity = (quantity / 63360);
                break;
            case ("mm") : convertedQuantity = (quantity * 25.4);
                break;
            case ("cm") : convertedQuantity = (quantity * 2.54);
                break;
            case ("meters") : convertedQuantity = (quantity * .0254);
                break;
            case ("km") : convertedQuantity = (quantity * 2.54e-5);
                break;
            default : output = "error converting inches";
        }

    }

    private void convertFeet (Double quantity, String outUnit) {
        switch (outUnit) {
            case ("inches"):
                convertedQuantity = quantity * 12.00;
                break;
            case ("yards"):
                convertedQuantity = quantity / 3.00;
                break;
            case ("miles"):
                convertedQuantity = quantity * 0.000189394;
                break;
            case ("mm"):
                convertedQuantity = quantity * 304.80;
                break;
            case ("cm"):
                convertedQuantity = quantity * 30.48;
                break;
            case ("meters"):
                convertedQuantity = quantity * 0.3048;
                break;
            case ("km"):
                convertedQuantity = quantity * 0.0003048;
                break;
            default: output = "error converting feet";
        }

    }

    private void convertYards (Double quantity, String outUnit) {

        switch (outUnit) {
            case ("inches"):
                convertedQuantity = quantity * 36.00;
                break;
            case ("feet"):
                convertedQuantity = quantity * 3;
                break;
            case ("miles"):
                convertedQuantity = quantity * 0.00056818;
                break;
            case ("mm"):
                convertedQuantity = quantity * 914.4;
                break;
            case ("cm"):
                convertedQuantity = quantity * 91.44;
                break;
            case ("meters"):
                convertedQuantity = quantity * 0.9144;
                break;
            case ("km"):
                convertedQuantity = quantity * 0.0009144;
                break;
            default:
                output = "error converting yards";
        }
    }
    private void convertMiles (Double quantity, String outUnit) {

        switch (outUnit) {
            case ("inches"):
                convertedQuantity = quantity * 63360;
                break;
            case ("feet"):
                convertedQuantity = quantity * 5280;
                break;
            case ("yards"):
                convertedQuantity = quantity * 1760;
                break;
            case ("mm"):
                convertedQuantity = quantity * 1.609e+6;
                break;
            case ("cm"):
                convertedQuantity = quantity * 160934;
                break;
            case ("meters"):
                convertedQuantity = quantity * 1609.34;
                break;
            case ("km"):
                convertedQuantity = quantity * 1.60934;
                break;
            default:
                output = "error converting miles";
        }
    }

    private void convertMM (Double quantity, String outUnit) {

        switch (outUnit) {
            case ("inches"):
                convertedQuantity = quantity * 0.0393701;
                break;
            case ("feet"):
                convertedQuantity = quantity * 0.00328084;
                break;
            case ("yards"):
                convertedQuantity = quantity * 0.00109361;
                break;
            case ("miles"):
                convertedQuantity = quantity * 6.2137e-7;
                break;
            case ("cm"):
                convertedQuantity = quantity * 0.1;
                break;
            case ("meters"):
                convertedQuantity = quantity * 0.001;
                break;
            case ("km"):
                convertedQuantity = quantity * 1e-6;
                break;
            default:
                output = "error converting mm";
        }
    }

    private void convertKM (Double quantity, String outUnit) {

        switch (outUnit) {
            case ("inches"):
                convertedQuantity = quantity * 39370.1;
                break;
            case ("feet"):
                convertedQuantity = quantity * 3280.84;
                break;
            case ("yards"):
                convertedQuantity = quantity * 1093.61;
                break;
            case ("miles"):
                convertedQuantity = quantity * 0.621371;
                break;
            case ("cm"):
                convertedQuantity = quantity * 100000;
                break;
            case ("meters"):
                convertedQuantity = quantity * 1000;
                break;
            case ("mm"):
                convertedQuantity = quantity * 1e+6;
                break;
            default:
                output = "error converting km";
        }
    }

    private void convertCM (Double quantity, String outUnit) {

        switch (outUnit) {
            case ("inches"):
                convertedQuantity = quantity * 0.393701;
                break;
            case ("feet"):
                convertedQuantity = quantity * 0.0328084;
                break;
            case ("yards"):
                convertedQuantity = quantity * 0.0109361;
                break;
            case ("miles"):
                convertedQuantity = quantity * 6.2137e-6;
                break;
            case ("km"):
                convertedQuantity = quantity * 1e-5;
                break;
            case ("meters"):
                convertedQuantity = quantity * 0.01;
                break;
            case ("mm"):
                convertedQuantity = quantity * 10;
                break;
            default:
                output = "error converting cm";
        }
    }

    private void convertMMeters (Double quantity, String outUnit) {

        switch (outUnit) {
            case ("inches"):
                convertedQuantity = quantity * 39.3701;
                break;
            case ("feet"):
                convertedQuantity = quantity * 3.28084;
                break;
            case ("yards"):
                convertedQuantity = quantity * 1.09361;
                break;
            case ("miles"):
                convertedQuantity = quantity * 0.000621371;
                break;
            case ("km"):
                convertedQuantity = quantity * 0.001;
                break;
            case ("cm"):
                convertedQuantity = quantity * 100;
                break;
            case ("mm"):
                convertedQuantity = quantity * 1000;
                break;
            default:
                output = "error converting meters";
        }
    }

}
