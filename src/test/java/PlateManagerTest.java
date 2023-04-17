import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlateManagerTest {

    PlateManager plateManager = PlateManager.create();
    PlateWriter plateWriter = new PlateWriter();
    SaladPlate saladPlate1 = new SaladPlate(23.6f, "glass", "white", true, false, "oval", true);
    DessertPlate dessertPlate1 = new DessertPlate(14.3f,"glass","grey",true,false);


    @Test
    void addPlateTest() {
        Plate plate = new SoupPlate(17.3f, "glass", "white", true, false, 8.1f, "mushroom soup");
        int initialSize = plateManager.PLATES.size();
        plateManager.addPlate(plate);
        assertEquals(initialSize + 1, plateManager.PLATES.size());
    }

    @Test
    void findAllWithMaxFoodWeightGreaterThanTest(){
        SoupPlate soupPlate1 = new SoupPlate(17.3f, "glass", "white", true, false, 8.1f, "mushroom soup");
        SoupPlate soupPlate2 = new SoupPlate(14.3f, "glass", "white", true, false, 8.3f, "mushroom soup");
        plateManager.addPlate(soupPlate1);
        plateManager.addPlate(soupPlate2);
        List<Plate> result = plateManager.findAllWithMaxFoodWeightGreaterThan(900);
        assertEquals(1, result.size());
    }

    @Test
    void findGlassPlatesTest(){
        SoupPlate soupPlate1 = new SoupPlate(17.3f, "glass", "white", true, false, 8.1f, "mushroom soup");
        SoupPlate soupPlate2 = new SoupPlate(14.3f, "ceramic", "white", true, false, 8.3f, "mushroom soup");
        plateManager.addPlate(soupPlate1);
        plateManager.addPlate(soupPlate2);
        List<Plate> result = plateManager.findGlassPlates();
        for (Plate plate: result
             ) {
            assertEquals("glass",plate.getMaterial());
        }
        assertEquals(1, result.size());
    }

    @Test
    void checkObjectsTest() throws IOException {
        List <Plate> finalList = new ArrayList<>();
        finalList.add(saladPlate1);
        finalList.add(dessertPlate1);
        plateWriter.writeToFile(finalList);
        List<String> finalLines = Files.readAllLines(Paths.get("Plate.csv"));
        List<String> expectedLines = Files.readAllLines(Paths.get("Plate3.csv"));
        assertEquals(expectedLines,finalLines);
    }
}