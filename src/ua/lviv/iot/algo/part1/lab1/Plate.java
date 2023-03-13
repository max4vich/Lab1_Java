package ua.lviv.iot.algo.part1.lab1;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Plate {

<<<<<<< Updated upstream
    private float diameter;
    private String material;
    private String colour;
    private boolean IsClean = false; //з великої, бо сетер під символ "і" чомусь не створюється
=======
    public static final int PLATES_COUNT = 4;

    private float diameter;
    private String material;
    private String colour;
    private boolean isClean = false;
>>>>>>> Stashed changes
    private boolean hasFood = false;
    public static Plate defaultPlate = new Plate();
    public static Plate getInstance() {
        return defaultPlate;
    }
<<<<<<< Updated upstream
    public void wash(){
        setIsClean(true);
    }
    public void dirty(){
        setIsClean(false);
=======

    public void wash(){
        isClean = true;
    }
    public void dirty(){
        isClean();
>>>>>>> Stashed changes
    }
    public void eat(){
        setHasFood(false);
        dirty();
    }
    public void addFood(){
        setHasFood(true);
    }

    @Override
    public String toString() {
        return "\nDiameter of plate is: " + diameter +
                "\nMaterial of plate is: " + material +
                "\nColour of plate is: " + colour +
<<<<<<< Updated upstream
                "\nIs plate clean? - " + IsClean +
=======
                "\nIs plate clean? - " + isClean +
>>>>>>> Stashed changes
                "\nDoes plate has food? - " + hasFood + "\n";
    }

    public static void main(String[] args){
<<<<<<< Updated upstream
        int number_of_objects = 4;
        Plate[] plates = new Plate[number_of_objects];
=======

        Plate[] plates = new Plate[PLATES_COUNT];
>>>>>>> Stashed changes
        plates[0] = Plate.getInstance();
        plates[1] = Plate.getInstance();
        plates[2] = new Plate(1.3f, "glass", "white", false,false);
        plates[3] = new Plate();

<<<<<<< Updated upstream
        plates[0].wash();
        plates[1].dirty();
        plates[2].eat();
        plates[3].addFood();

        for (int i = 0; i < plates.length; i++) {
            System.out.println("Plate " + "ID: " + i + ": " + plates[i].toString());
        }

=======
//        for (int i = 0; i < plates.length; i++) {
//         //   System.out.println("Plate " + "ID: " + i + ": " + plates[i].toString());
//        }
        for (Plate plate : plates)
        {
            System.out.println(plate.toString());
        }
>>>>>>> Stashed changes
    }

}