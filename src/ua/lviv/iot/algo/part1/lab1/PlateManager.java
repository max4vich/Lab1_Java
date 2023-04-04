package ua.lviv.iot.algo.part1.lab1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlateManager {
    public static List<Plate> plates = new ArrayList<>();
    public static void addPlate(Plate plate) {
        plates.add(plate);
    }
    public static List<Plate> findAllWithMaxFoodWeightGreaterThan(int maxFoodWeight) {
        return plates.stream()
                .filter(plate -> plate.getMaxFoodWeight() > maxFoodWeight)
                .collect(Collectors.toList());
    }
    public static List<Plate> findGlassPlates() {
        return plates .stream()
                .filter(plate -> plate.getMaterial().equals("glass"))
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        
        SoupPlate soupPlate1 = new SoupPlate(17.3f, "glass", "white", true, false, 8.1f, "mushroom soup");
        SoupPlate soupPlate2 = new SoupPlate(15.4f, "plastic", "blue", true, false, 8.3f, "borsch");

        SaladPlate saladPlate1 = new SaladPlate(23.6f, "glass", "white", true, false, "oval", true);
        SaladPlate saladPlate2= new SaladPlate(27.1f, "ceramic", "grey", true, false, "cube", true);

        DessertPlate dessertPlate1 = new DessertPlate(14.3f,"glass","grey",true,false);
        DessertPlate dessertPlate2 = new DessertPlate(11.5f,"ceramic","white",true,false);

        DinnerPlate dinnerPlate1 = new DinnerPlate(40.2f, "ceramic","white",true,false);
        DinnerPlate dinnerPlate2 = new DinnerPlate(35.2f, "ceramic","white",true,false);

        addPlate(soupPlate1);
        addPlate(soupPlate2);
        addPlate(saladPlate1);
        addPlate(saladPlate2);
        addPlate(dessertPlate1);
        addPlate(dessertPlate2);
        addPlate(dinnerPlate1);
        addPlate(dinnerPlate2);

        for (Plate plate : plates) {
            System.out.println(plate.toString());
        }

        System.out.println("There is list of glass plates: ");

        List<Plate> resultGlass = findGlassPlates();
        for (Plate plate : resultGlass){
            System.out.println("\n" + plate);
        }

        System.out.println("\nThere is a list of plates, which can have weight of food greater than 1000: ");

        List<Plate> resultWeight = findAllWithMaxFoodWeightGreaterThan(1000);
        for (var plate : resultWeight){
            System.out.println("\n" + plate);
        }
    }
}
