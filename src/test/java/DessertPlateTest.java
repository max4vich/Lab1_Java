import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.DessertPlate;
import ua.lviv.iot.algo.part1.lab1.SoupPlate;

import static org.junit.jupiter.api.Assertions.*;

class DessertPlateTest {
    private DessertPlate dessertPlate = new DessertPlate(14.3f,"glass",
                "grey",true,false);;
    @Test
    void getMaxFoodWeightTest(){
        assertEquals(642.4242989898606,dessertPlate.getMaxFoodWeight());
    }

    @Test
    void getHeadersTest(){
        String expectedString = "diameter, material, colour, isClean, hasFood";
        assertEquals(expectedString,dessertPlate.getHeaders());
    }

    @Test
    void toCSVTest(){
        String expectedString = "14.3, glass, grey, true, false";
        assertEquals(expectedString, dessertPlate.toCSV());
    }
}