package ua.lviv.iot.algo.part1.lab1;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor


public abstract class Plate {
    protected float diameter;
    protected String material;
    protected String colour;
    protected boolean isClean = false;
    protected boolean hasFood = false;
    protected abstract double getMaxFoodWeight();

    @Override
    public String toString() {
        return "\nDiameter of plate is: " + diameter +
                "\nMaterial of plate is: " + material +
                "\nColour of plate is: " + colour +
                "\nIs plate clean? - " + isClean +
                "\nDoes plate has food? - " + hasFood + "\n";
    }
}

//    public static void main(String[] args){
//        int number_of_objects = 4;
//        Plate[] plates = new Plate[number_of_objects];
//        plates[0] = Plate.getInstance();
//        plates[1] = Plate.getInstance();
//        plates[2] = new Plate(1.3f, "glass", "white", false,false);
//        plates[3] = new Plate();
//
//        for (Plate plate: plates) {
//            System.out.println(plate.toString());
//        }
//    }
//    public static Plate defaultPlate = new Plate();
//   public static Plate getInstance() {
//      return defaultPlate;
//   }