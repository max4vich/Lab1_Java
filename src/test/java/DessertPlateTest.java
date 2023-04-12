import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.DessertPlate;

import static org.junit.jupiter.api.Assertions.*;

class DessertPlateTest {
    @Test
    void getMaxFoodWeightTest(){
        DessertPlate dessertPlate = new DessertPlate(14.3f,"glass","grey",true,false);
        assertEquals(642.4242989898606,dessertPlate.getMaxFoodWeight());
    }
}