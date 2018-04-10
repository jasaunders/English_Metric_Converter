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
    void convertPoundsToOuncesSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("lbs", "oz", 1.0) ;

        assertEquals((Double)16.0, result);
    }

    @Test
    void convertPoundsToGrainsSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("lbs", "grains", 1.0) ;

        assertEquals((Double)7000.0, result);
    }

    @Test
    void convertPoundsToTonsSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("lbs", "tons", 2000.0) ;

        assertEquals((Double)1.0, result);
    }

    @Test
    void convertPoundsToGramsSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("lbs", "grams", 1.0) ;

        assertEquals((Double)453.592, result);
    }

    @Test
    void convertPoundsToKilosSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("lbs", "kilos", 1.0) ;

        assertEquals((Double)0.453592, result);
    }

    @Test
    void convertGrainsToOunces() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("grains", "oz", 1.0) ;

        assertEquals((Double)0.00228571, result);
    }

    @Test
    void convertGrainsToPounds() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("grains", "lbs", 7000.0) ;

        assertEquals((Double)1.0, result);
    }

    @Test
    void convertGrainsToTons() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("grains", "tons", 14000000.0) ;

        assertEquals((Double)1.0, result);
    }

    @Test
    void convertGrainsToGramsSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("grains", "grams", 1000.0) ;

        assertEquals((Double)64.7989, result);
    }

    @Test
    void convertGrainsToKilosSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("grains", "kilos", 1000000.0) ;
        result = (Math.round(result * 10000.0) /10000.0);
        assertEquals((Double)64.7989, result);
    }

    @Test
    void convertTonsToOuncesSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("tons", "oz", 1.0);

        assertEquals((Double)32000.0, result);
    }

    @Test
    void convertTonsToPoundsSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("tons", "lbs", 1.0);

        assertEquals((Double)2000.0, result);
    }

    @Test
    void convertTonsToGrainsSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("tons", "grains", 3.0);

        assertEquals((Double)42000000.0, result);
    }

    @Test
    void convertTonsToGramsSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("tons", "grams", 1.0);

        assertEquals((Double)907185.0, result);
    }

    @Test
    void convertTonsToKilosSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("tons", "kilos", 1.0) ;

        assertEquals((Double)907.185, result);
    }

    @Test
    void convertGramsToOuncesSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("grams", "oz", 28.3495) ;

        assertEquals((Double)1.0, result);
    }

    @Test
    void convertGramsToPoundsSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("grams", "lbs", 453.592) ;

        assertEquals((Double)1.0, result);
    }

    @Test
    void convertGramsToGrainsSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("grams", "grains", 1.0) ;

        assertEquals((Double)15.4324, result);
    }

    @Test
    void convertGramsToTonsSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("grams", "tons", 907185.0) ;

        assertEquals((Double)1.0, result);
    }

    @Test
    void convertGramsToKilosSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("grams", "kilos", 1000.0) ;

        assertEquals((Double)1.0, result);
    }

    @Test
    void convertKilosToOuncesSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("kilos", "oz", 0.0283495) ;

        assertEquals((Double)1.0, result);
    }

    @Test
    void convertKilosToPoundsSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("kilos", "lbs", 0.453592) ;

        assertEquals((Double)1.0, result);
    }

    @Test
    void convertKilosToGrainsSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("kilos", "grains", 1.0) ;

        assertEquals((Double)15432.4, result);
    }

    @Test
    void convertKilosToTonsSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("kilos", "tons", 907.185) ;

        assertEquals((Double)1.0, result);
    }

    @Test
    void convertKilosToGramsSuccess() {

        WeightConverter converter = new WeightConverter();
        Double result = converter.convertUnits("kilos", "grams", 2.0) ;

        assertEquals((Double)2000.0, result);
    }


}
