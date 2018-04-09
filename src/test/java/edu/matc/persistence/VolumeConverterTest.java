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

}

