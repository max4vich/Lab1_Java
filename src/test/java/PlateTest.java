import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.DessertPlate;

import static org.junit.jupiter.api.Assertions.*;

class PlateTest {
    @Test
    void CheckingOfValuesTest(){
        DessertPlate dessertPlate = new DessertPlate(14.3f,"glass","grey",true,false);
        dessertPlate.setDiameter(13);
        dessertPlate.setColour("grey");
        assertEquals(13,dessertPlate.getDiameter());
        assertEquals("grey",dessertPlate.getColour());
    }
}