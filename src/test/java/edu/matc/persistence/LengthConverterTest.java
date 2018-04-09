package edu.matc.persistence;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class LengthConverterTest {

    @Test
    void convertInchesToFeetSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("inches", "feet", 36.0) ;

        assertEquals((Double)3.0, result);
    }

    @Test
    void convertInchesToYardsSuccess() {

        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("inches", "yards", 36.0) ;

        assertEquals((Double)1.0, result);
    }

    @Test
    void convertInchesToMilesSuccess() {

        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("inches", "miles", 63360.0) ;

        assertEquals((Double)1.0, result);
    }

    @Test
    void convertInchesToMillimetersSuccess() {

        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("inches", "mm", 1.0) ;

        assertEquals((Double)25.4, result);
    }

    @Test
    void convertInchesToCentimetersSuccess() {

        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("inches", "cm", 1.0) ;

        assertEquals((Double)2.54, result);
    }

    @Test
    void convertInchesToMetersSuccess() {

        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("inches", "meters", 36.0) ;

        assertEquals((Double)0.9144, result);
    }

    @Test
    void convertInchesToKilometersSuccess() {

        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("inches", "km", 10000.0) ;

        assertEquals((Double)0.254, result);
    }

    @Test
    void convertFeetToInchesSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("feet", "inches", 36.0) ;

        assertEquals((Double)432.0, result);
    }

    @Test
    void convertFeetToYardsSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("feet", "yards", 36.0) ;

        assertEquals((Double)12.0, result);
    }

    @Test
    void convertFeetToMilesSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("feet", "miles", 5280.0) ;

        assertEquals((Double)1.0, result);
    }

    @Test
    void convertFeetToMillimetersSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("feet", "mm", 3.0) ;

        assertEquals((Double)914.4, result);
    }

    @Test
    void convertFeetToCentimetersSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("feet", "cm", 3.0) ;

        assertEquals((Double)91.44, result);
    }

    @Test
    void convertFeetToMetersSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("feet", "meters", 3.0) ;

        assertEquals((Double)0.9144, result);
    }

    @Test
    void convertFeetToKilometersSuccess() {

        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("feet", "km", 6500.0) ;

        assertEquals((Double)1.9812, result);
    }

    @Test
    void convertYardsToInchesSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("yards", "inches", 3.0) ;

        assertEquals((Double)108.0, result);
    }

    @Test
    void convertYardsToFeetSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("yards", "feet", 3.0) ;

        assertEquals((Double)9.0, result);
    }

    @Test
    void convertYardsToMilesSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("yards", "miles", 1760.0) ;

        assertEquals((Double)1.0, result);
    }

    @Test
    void convertYardsToMillimetersSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("yards", "mm", 3.0) ;

        assertEquals((Double)2743.2, result);
    }

    @Test
    void convertYardsToCentimetersSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("yards", "cm", 3.0) ;

        assertEquals((Double)274.32, result);
    }

    @Test
    void convertYardsToMetersSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("yards", "meters", 10.0) ;

        assertEquals((Double)9.144, result);
    }

    @Test
    void convertYardsToKilometersSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("yards", "km", 1000.0) ;

        assertEquals((Double)0.9144, result);
    }

    @Test
    void convertMilesToInchesSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("miles", "inches", 1.0) ;

        assertEquals((Double)63360.0, result);
    }

    @Test
    void convertMilesToFeetSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("miles", "feet", 1.0) ;

        assertEquals((Double)5280.0, result);
    }

    @Test
    void convertMilesToYardsSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("miles", "yards", 1.0) ;

        assertEquals((Double)1760.0, result);
    }

    @Test
    void convertMilesToMillimetersSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("miles", "mm", 1.0) ;

        assertEquals((Double)1.609e+6, result);
    }
    @Test
    void convertMilesToCentimetersSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("miles", "cm", 1.0) ;

        assertEquals((Double)160.934, result);
    }

    @Test
    void convertMilesToMetersSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("miles", "meters", 1.0) ;

        assertEquals((Double)1609.34, result);
    }
    @Test
    void convertMilesToKilometersSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("miles", "km", 1.0) ;

        assertEquals((Double)1.60934, result);
    }
    @Test
    void convertMillimetersToInchesSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("mm", "inches", 25.4) ;

        assertEquals((Double)1.0, result);
    }

    @Test
    void convertMillimetersToFeetSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("mm", "feet", 304.8) ;

        assertEquals((Double)1.0, result);
    }
    @Test
    void convertMillimetersToYardsSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("mm", "yards", 914.4) ;

        assertEquals((Double)1.0, result);
    }

    @Test
    void convertMillimetersToMilesSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("mm", "miles", 200000.0) ;

        assertEquals((Double)0.124274238, result);
    }

    @Test
    void convertMillimetersToCentimetersSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("mm", "cm", 200000.0) ;

        assertEquals((Double)20000.0, result);
    }

    @Test
    void convertMillimetersToMetersSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("mm", "meters", 4000.0) ;

        assertEquals((Double)4.0, result);
    }

    @Test
    void convertMillimetersToKilometersSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("mm", "km", 200000.0) ;

        assertEquals((Double)0.2, result);
    }

    @Test
    void convertCentimetersToInchesSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("cm", "inches", 5.08) ;

        assertEquals((Double)2.0, result);
    }

    @Test
    void convertCentimetersToFeetSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("cm", "feet", 60.96) ;

        assertEquals((Double)2.0, result);
    }

    @Test
    void convertCentimetersToYardsSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("cm", "yards", 91.44) ;

        assertEquals((Double)1.0, result);
    }

    @Test
    void convertCentimetersToMilesSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("cm", "miles", 20000.0) ;

        assertEquals((Double)0.124274238, result);
    }

    @Test
    void convertCentimetersToMillimetersSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("cm", "mm", 2000.0) ;

        assertEquals((Double)20000.0, result);
    }

    @Test
    void convertCentimetersToMetersSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("cm", "meters", 400.0) ;

        assertEquals((Double)4.0, result);
    }

    @Test
    void convertCentimetersToKilometersSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("cm", "km", 20000.0) ;

        assertEquals((Double)0.2, result);
    }

    @Test
    void convertMetersToInchesSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("meters", "inches", 1.0) ;

        assertEquals((Double)0.0254, result);
    }

    @Test
    void convertMetersToFeetSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("meters", "feet", 609.6) ;

        assertEquals((Double)2.0, result);
    }

    @Test
    void convertMetersToYardsSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("meters", "yards", 1.0) ;

        assertEquals((Double)1.09361, result);
    }

    @Test
    void convertMetersToMilesSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("meters", "miles", 1000.0) ;

        assertEquals((Double)0.621371, result);
    }

    @Test
    void convertMetersToMillimetersSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("meters", "mm", 20.0) ;

        assertEquals((Double)20000.0, result);
    }

    @Test
    void convertMetersToCentimetersSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("meters", "cm", 4.0) ;

        assertEquals((Double)400.0, result);
    }

    @Test
    void convertMetersToKilometersSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("meters", "km", 200000.0) ;

        assertEquals((Double)200.0, result);
    }


    @Test
    void convertKilometersToInchesSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("km", "inches", 3.0) ;

        assertEquals((Double)118110.0, result);
    }

    @Test
    void convertKilometersToFeetSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("km", "feet", .6096) ;

        assertEquals((Double)2000.0, result);
    }

    @Test
    void convertKilometersToYardsSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("km", "yards", 0.9144) ;

        assertEquals((Double)1000.0, result);
    }

    @Test
    void convertKilometersToMilesSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("km", "miles", 200.0) ;

        assertEquals((Double)124.274238, result);
    }

    @Test
    void convertKilometersToMillimetersSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("km", "mm", 2.0) ;

        assertEquals((Double)2000000.0, result);
    }

    @Test
    void convertKilometersToCentimetersSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("km", "cm", 2.0) ;

        assertEquals((Double)200000.0, result);
    }

    @Test
    void convertKilometersToMetersSuccess() {


        LengthConverter converter = new LengthConverter();
        Double result = converter.convertUnits("km", "meters", 2.0) ;

        assertEquals((Double)2000.0, result);
    }

    @Test
    void getLengthHTML() {
    }

    @Test
    void getLengthJSON() {
    }
}