package edu.matc.persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeConverterTest {

    @Test
    void convertFluidOuncesToTeaspoonsSuccess() {


        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("ozfl", "tsp", 1.0) ;

        assertEquals((Double)6.0, result);
    }

    @Test
    void convertFluidOuncesToTablespoonsSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("ozfl", "tbsp", 1.0) ;

        assertEquals((Double)2.0, result);
    }

    @Test
    void convertFluidOuncesToCupsSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("ozfl", "cups", 8.0) ;

        assertEquals((Double)1.0, result);
    }

    @Test
    void convertFluidOuncesToMililitersSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("ozfl", "ml", 1.0) ;

        assertEquals((Double)29.5735, result);
    }

    @Test
    void convertFluidOuncesToLitersSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("ozfl", "liters", 1.0) ;

        assertEquals((Double)0.0295735, result);
    }

    @Test
    void convertTeaspoonsToFluidOuncesSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("tsp", "ozfl", 6.0) ;

        assertEquals((Double)1.0, result);
    }


    @Test
    void convertTeaspoonsToTablespoonsSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("tsp", "tbsp", 3.0) ;

        assertEquals((Double)1.0, result);
    }

    @Test
    void convertTeaspoonsToCupsSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("tsp", "cups", 48.0) ;

        assertEquals((Double)1.0, result);
    }

    @Test
    void convertTeaspoonsToMillilitersSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("tsp", "ml", 1.0) ;
        result = (Math.round(result * 10000.0) /10000.0);
        assertEquals((Double)4.9289, result);
    }

    @Test
    void convertTeaspoonsToLitersSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("tsp", "liters", 1000.0);
        result = (Math.round(result * 10000.0) /10000.0);
        assertEquals((Double)4.9289, result);
    }

    @Test
    void convertTablespoonsToFluidOuncesSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("tbsp", "ozfl", 2.0);

        assertEquals((Double)1.0, result);
    }

    @Test
    void convertTablespoonsToTeaspoonsSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("tbsp", "tsp", 1.0);

        assertEquals((Double)3.0, result);
    }

    @Test
    void convertTablespoonsToCupsSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("tbsp", "cups", 16.0);

        assertEquals((Double)1.0, result);
    }

    @Test
    void convertTablespoonsToMilliitersSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("tbsp", "ml", 1.0);
        result = (Math.round(result * 10000.0) /10000.0);
        assertEquals((Double)14.7868, result);
    }

    @Test
    void convertTablespoonsToLitersSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("tbsp", "liters", 1000.0);
        result = (Math.round(result * 10000.0) /10000.0);
        assertEquals((Double)14.7868, result);
    }

    @Test
    void convertCupsToFluidOuncesSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("cups", "ozfl", 1.0);
        assertEquals((Double)8.0, result);
    }

    @Test
    void convertCupsToTeaspoonsSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("cups", "tsp", 1.0);
        assertEquals((Double)48.0, result);
    }

    @Test
    void convertCupsToTablespoonsSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("cups", "tbsp", 1.0);
        assertEquals((Double)16.0, result);
    }

    @Test
    void convertCupsToMillilitersSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("cups", "ml", 1.0);
        result = (Math.round(result * 10000.0) /10000.0);
        assertEquals((Double)236.588, result);
    }

    @Test
    void convertCupsToLitersSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("cups", "liters", 1000.0);
        result = (Math.round(result * 10000.0) /10000.0);
        assertEquals((Double)236.588, result);
    }

    @Test
    void convertMillilitersToFluidOuncesSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("ml", "ozfl", 1000.0);
        result = (Math.round(result * 10000.0) /10000.0);
        assertEquals((Double)33.814, result);
    }

    @Test
    void convertMillilitersToTeaspoons() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("ml", "tsp", 1000.0);
        result = (Math.round(result * 10000.0) /10000.0);
        assertEquals((Double)202.884, result);
    }

    @Test
    void convertMillilitersToTablespoonsSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("ml", "tbsp", 1000.0);
        result = (Math.round(result * 10000.0) /10000.0);
        assertEquals((Double)67.628, result);
    }

    @Test
    void convertMillilitersToCupsSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("ml", "cups", 236.588);
        result = (Math.round(result * 10000.0) /10000.0);
        assertEquals((Double)1.0, result);
    }

    @Test
    void convertMillilitersToLitersSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("ml", "liters", 1000.0);
        result = (Math.round(result * 10000.0) /10000.0);
        assertEquals((Double)1.0, result);
    }

    @Test
    void convertLitersToFluidOuncesSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("liters", "ozfl", 1.0);
        result = (Math.round(result * 10000.0) /10000.0);
        assertEquals((Double)33.814, result);
    }

    @Test
    void convertLitersToTeaspoons() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("liters", "tsp", 1.0);
        result = (Math.round(result * 10000.0) /10000.0);
        assertEquals((Double)202.884, result);
    }

    @Test
    void convertLitersToTablespoonsSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("liters", "tbsp", 1.0);
        result = (Math.round(result * 10000.0) /10000.0);
        assertEquals((Double)67.628, result);
    }

    @Test
    void convertLitersToCupsSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("liters", "cups", 0.236588);
        result = (Math.round(result * 10000.0) /10000.0);
        assertEquals((Double)1.0, result);
    }

    @Test
    void convertLitersToMillilitersSuccess() {

        VolumeConverter converter = new VolumeConverter();
        Double result = converter.convertUnits("liters", "ml", 1.0);
        result = (Math.round(result * 10000.0) /10000.0);
        assertEquals((Double)1000.0, result);
    }
}

