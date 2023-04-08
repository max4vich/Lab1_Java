import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.Plate;
import ua.lviv.iot.algo.part1.lab1.PlateManager;
import ua.lviv.iot.algo.part1.lab1.SoupPlate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlateManagerTest {

    @Test
    void addPlateTest() {
        PlateManager plateManager = PlateManager.create();
        Plate plate = new SoupPlate(17.3f, "glass", "white", true, false, 8.1f, "mushroom soup");
        int initialSize = plateManager.PLATES.size();
        plateManager.addPlate(plate);
        assertEquals(initialSize + 1, plateManager.PLATES.size());
    }

    @Test
    void findAllWithMaxFoodWeightGreaterThanTest(){
        PlateManager plateManager = PlateManager.create();
        SoupPlate soupPlate1 = new SoupPlate(17.3f, "glass", "white", true, false, 8.1f, "mushroom soup");
        SoupPlate soupPlate2 = new SoupPlate(14.3f, "glass", "white", true, false, 8.3f, "mushroom soup");
        plateManager.addPlate(soupPlate1);
        plateManager.addPlate(soupPlate2);
        List<Plate> result = plateManager.findAllWithMaxFoodWeightGreaterThan(900);
        assertEquals(1, result.size());
    }

    @Test
    void findGlassPlatesTest(){
        PlateManager plateManager = PlateManager.create();
        SoupPlate soupPlate1 = new SoupPlate(17.3f, "glass", "white", true, false, 8.1f, "mushroom soup");
        SoupPlate soupPlate2 = new SoupPlate(14.3f, "ceramic", "white", true, false, 8.3f, "mushroom soup");
        plateManager.addPlate(soupPlate1);
        plateManager.addPlate(soupPlate2);
        List<Plate> result = plateManager.findGlassPlates();
        assertEquals(3, result.size());
    }
}