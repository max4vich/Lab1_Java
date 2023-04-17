import org.junit.After;
import org.junit.jupiter.api.*;
import ua.lviv.iot.algo.part1.lab1.*;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PlateWriterTest {

    private static final String RESULT_FILE = "Plate.csv";
    private static final String EXPECTED_FILE = "Plate3.csv";

    private PlateWriter plateWriter;
    private List<Plate> list;

    @BeforeEach
    public void setUp() {
        plateWriter = new PlateWriter();
        list = new ArrayList<>();
    }

    @Test
    public void emptyWriteToFileTest() {
        plateWriter.writeToFile(list);
        if (list.isEmpty()) {
            System.out.println("An error occurred");
        } else {
            System.out.println("List isn't empty");
        }
        assertTrue(list.isEmpty());
    }

    @Test
    public void testWriteToFile() throws IOException {
        SoupPlate soupPlate1 = new SoupPlate(17.3f, "glass", "white", true, false, 8.1f, "mushroom soup");
        SoupPlate soupPlate2 = new SoupPlate(15.4f, "plastic", "blue", true, false, 8.3f, "borsch");

        SaladPlate saladPlate1 = new SaladPlate(23.6f, "glass", "white", true, false, "oval", true);
        SaladPlate saladPlate2= new SaladPlate(27.1f, "ceramic", "grey", true, false, "cube", true);

        DessertPlate dessertPlate1 = new DessertPlate(14.3f,"glass","grey",true,false);
        DessertPlate dessertPlate2 = new DessertPlate(11.5f,"ceramic","white",true,false);

        DinnerPlate dinnerPlate1 = new DinnerPlate(40.2f, "ceramic","white",true,false);
        DinnerPlate dinnerPlate2 = new DinnerPlate(35.2f, "ceramic","white",true,false);

        List<Plate> plates = new ArrayList<>();
        plates.add(soupPlate1);
        plates.add(soupPlate2);
        plates.add(saladPlate1);
        plates.add(saladPlate2);
        plates.add(dessertPlate1);
        plates.add(dessertPlate2);
        plates.add(dinnerPlate1);
        plates.add(dinnerPlate2);

        plateWriter.writeToFile(plates);

        Path expected = new File(EXPECTED_FILE).toPath();
        Path result = new File(RESULT_FILE).toPath();
        assertEquals(-1L, Files.mismatch(expected, result));
    }

    @AfterEach
    public void tearDown() throws IOException {
//        Files.deleteIfExists(Path.of(RESULT_FILE));
    }
}