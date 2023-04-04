package ua.lviv.iot.algo.part1.lab1;
import lombok.*;
public class SoupPlate extends Plate {
    protected float plateDepth;
    protected String soupType;
    public SoupPlate(float diameter, String material, String colour, boolean isClean, boolean hasFood, float plateDepth, String soupType) {
        super(diameter, material, colour, isClean, hasFood);
        this.plateDepth = plateDepth;
        this.soupType = soupType;
    }
    @Override
    protected double getMaxFoodWeight() {
        double radius = diameter / 2;
        return 0.5 * Math.PI * radius * radius * plateDepth;
    }
    @Override
    public String toString() {
        return "\nDiameter of plate is: " + diameter +
                "\nMaterial of plate is: " + material +
                "\nColour of plate is: " + colour +
                "\nIs plate clean? - " + isClean +
                "\nDoes plate has food? - " + hasFood +
                "\nDepth of plate is: " + plateDepth +
                "\nWhat type of soup is plate for? " + soupType +
                "\nWhat is maximum weight of food? " + getMaxFoodWeight() + "\n";

    }
}
