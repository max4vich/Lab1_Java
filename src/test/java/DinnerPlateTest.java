import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.DinnerPlate;

import static org.junit.jupiter.api.Assertions.*;

class DinnerPlateTest {
    @Test
    void getMaxFoodWeightTest(){
        DinnerPlate dinnerPlate = new DinnerPlate(40.2f, "ceramic","white",true,false);
        assertEquals(12245.578510491825,dinnerPlate.getMaxFoodWeight());
    }


}