package ua.lviv.iot.algo.part1.lab1;

public class SaladPlate extends Plate{
    private String saladPlateShape;
    private boolean dishwasherSafe;

    public SaladPlate(float diameter, String material, String colour, boolean isClean, boolean hasFood, String saladPlateShape, boolean dishwasherSafe) {
        super(diameter, material, colour, isClean, hasFood);
        this.saladPlateShape = saladPlateShape;
        this.dishwasherSafe = dishwasherSafe;
    }

    @Override
    public double getMaxFoodWeight(){
        double radius = diameter / 2;
        return Math.PI * radius * radius * radius / 3.0;
    }
    @Override
    public String toString() {
        return "\nDiameter of plate is: " + diameter +
                "\nMaterial of plate is: " + material +
                "\nColour of plate is: " + colour +
                "\nIs plate clean? - " + isClean +
                "\nDoes plate has food? - " + hasFood +
                "\nShape of SaladPlate: " + saladPlateShape +
                "\nCan it be used in dishwasher? " + dishwasherSafe +
                "\nWhat is maximum weight of food? " + getMaxFoodWeight() + "\n";

    }

}

