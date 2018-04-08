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
    void getLengthHTML() {
    }

    @Test
    void getLengthJSON() {
    }
}