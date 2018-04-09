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
    void convertInchesToMileSuccess() {

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
    void getLengthHTML() {
    }

    @Test
    void getLengthJSON() {
    }
}