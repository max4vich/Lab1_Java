package ua.lviv.iot.algo.part1.lab1;

public class  DessertPlate extends Plate{

    public DessertPlate(float diameter, String material, String colour, boolean isClean, boolean hasFood) {
        super(diameter, material, colour, isClean, hasFood);
    }

    @Override
    protected double getMaxFoodWeight() {
        return diameter*diameter*Math.PI;
    }
}
