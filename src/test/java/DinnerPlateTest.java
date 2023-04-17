import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.DessertPlate;
import ua.lviv.iot.algo.part1.lab1.DinnerPlate;

import static org.junit.jupiter.api.Assertions.*;

class DinnerPlateTest {
    private  DinnerPlate dinnerPlate = new DinnerPlate(40.2f,
            "ceramic","white",true,false);
    @Test
    void getMaxFoodWeightTest(){
        assertEquals(12245.578510491825,dinnerPlate.getMaxFoodWeight());
    }

    @Test
    void getHeadersTest(){
        String expectedString = "diameter, material, colour, isClean, hasFood";
        assertEquals(expectedString,dinnerPlate.getHeaders());
    }

    @Test
    void toCSVTest(){
        String expectedString = "40.2, ceramic, white, true, false";
        assertEquals(expectedString, dinnerPlate.toCSV());
    }
}