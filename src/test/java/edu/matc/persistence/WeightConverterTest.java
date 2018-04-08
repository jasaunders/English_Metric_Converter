package edu.matc.persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeightConverterTest {
    @Test
    void convertOuncesToPoundsSuccess() {


        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("oz", "lbs", 48.0) ;

        assertEquals((Double)3.0, result);
    }

    @Test
    void convertOuncesToGrainsSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("oz", "grains", 2.0) ;

        assertEquals((Double)875.0, result);
    }

    @Test
    void convertOuncesToTonsSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("oz", "tons", 32000.0) ;

        assertEquals((Double)1.0, result);
    }

    @Test
    void convertOuncesToGramsSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("oz", "grams", 1.0) ;

        assertEquals((Double)28.3495, result);
    }

    @Test
    void convertOuncesToKilogramsSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("oz", "kilos", 1.0) ;

        assertEquals((Double)0.0283495, result);
    }

    @Test
    void getLengthHTML() {
    }

    @Test
    void getLengthJSON() {
    }

}
