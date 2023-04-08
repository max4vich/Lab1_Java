import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.SaladPlate;

import static org.junit.jupiter.api.Assertions.*;

class SaladPlateTest {

    @Test
    void testToString() {
        SaladPlate saladPlate = new SaladPlate(23.6f, "glass", "white", true, false, "oval", true);
        String required_output = "\nDiameter of plate is: " + 23.6f +
                "\nMaterial of plate is: " + "glass" +
                "\nColour of plate is: " + "white" +
                "\nIs plate clean? - " + true +
                "\nDoes plate has food? - " + false +
                "\nShape of SaladPlate: " + "oval" +
                "\nCan it be used in dishwasher? " + true +
                "\nWhat is maximum weight of food? " + 1720.5791703718235 + "\n";
        assertEquals(required_output, saladPlate.toString());

    }

    @Test
    void getMaxFoodWeightTest() {
        SaladPlate saladPlate = new SaladPlate(23.6f, "glass", "white", true, false, "oval", true);
        assertEquals(1720.5791703718235,saladPlate.getMaxFoodWeight());
    }
}