package ua.lviv.iot.algo.part1.lab1;
import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;

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