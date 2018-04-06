package edu.matc.persistence;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import static org.junit.jupiter.api.Assertions.*;

class LengthConverterTest {

    @Test
    void convertInchesToFeetSuccess() throws Exception{

        Double result = 0.0;
        LengthConverter converter = new LengthConverter();
        result = converter.convertUnits("inches", "feet", 36.0) ;

        assertEquals((Double)3.0, result);
    }

    @Test
    void convertInchesToYardsSuccess() throws Exception{

        Double result = 0.0;
        LengthConverter converter = new LengthConverter();
        result = converter.convertUnits("inches", "yards", 36.0) ;

        assertEquals((Double)1.0, result);
    }

    @Test
    void convertInchesToMileSuccess() throws Exception{

        Double result = 0.0;
        LengthConverter converter = new LengthConverter();
        result = converter.convertUnits("inches", "miles", 63360.0) ;

        assertEquals((Double)1.0, result);
    }

    @Test
    void convertInchesToMilimetersSuccess() throws Exception{

        Double result = 0.0;
        LengthConverter converter = new LengthConverter();
        result = converter.convertUnits("inches", "mm", 1.0) ;

        assertEquals((Double)25.4, result);
    }

    @Test
    void convertInchesToCentimetersSuccess() throws Exception{

        Double result = 0.0;
        LengthConverter converter = new LengthConverter();
        result = converter.convertUnits("inches", "cm", 1.0) ;

        assertEquals((Double)2.54, result);
    }

    @Test
    void convertInchesToMetersSuccess() throws Exception{

        Double result = 0.0;
        LengthConverter converter = new LengthConverter();
        result = converter.convertUnits("inches", "meters", 36.0) ;

        assertEquals((Double)0.9144, result);
    }

    @Test
    void convertInchesToKilometersSuccess() throws Exception{

        Double result = 0.0;
        LengthConverter converter = new LengthConverter();
        result = converter.convertUnits("inches", "km", 10000.0) ;

        assertEquals((Double)0.254, result);
    }

    @Test
    void getLengthHTML() {
    }

    @Test
    void getLengthJSON() {
    }
}