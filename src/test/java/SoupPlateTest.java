import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.SoupPlate;
import static org.junit.jupiter.api.Assertions.assertEquals;
class SoupPlateTest {
    SoupPlate soupPlate1 = new SoupPlate(17.3f, "glass", "white", true, false, 8.1f, "mushroom soup");
    @Test
    void getMaxFoodWeightTest() {
        SoupPlate soupPlate = new SoupPlate(17.3f, "glass", "white", true, false, 8.1f, "mushroom soup");
        soupPlate.getMaxFoodWeight();
        assertEquals(952.0003169760598,soupPlate.getMaxFoodWeight());
    }
    @Test
    void toStringTest(){
        SoupPlate soupPlate = new SoupPlate(17.3f, "glass", "white", true, false, 8.1f, "mushroom soup");
        String required_output = "\nDiameter of plate is: "
                + 17.3
                + "\nMaterial of plate is: "
                + "glass"
                + "\nColour of plate is: "
                + "white"
                + "\nIs plate clean? - "
                + true
                + "\nDoes plate have food? - "
                + false
                + "\nDepth of plate is: "
                + 8.1
                + "\nWhat type of soup is plate for? "
                + "mushroom soup"
                + "\nWhat is maximum weight of food? "
                + 952.0003169760598
                + "\n";
        assertEquals(required_output,soupPlate.toString());
    }
    @Test
    void getHeadersTest(){
        String expectedString = "diameter, material, colour, isClean, hasFood, plateDepth, soupType";
        assertEquals(expectedString,soupPlate1.getHeaders());
    }

    @Test
    void toCSVTest(){
        String expectedString = "17.3, glass, white, true, false, 8.1, mushroom soup";
        assertEquals(expectedString, soupPlate1.toCSV());
    }
}