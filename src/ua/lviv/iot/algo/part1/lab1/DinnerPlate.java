package ua.lviv.iot.algo.part1.lab1;

public class DinnerPlate extends Plate{
    public DinnerPlate(float diameter, String material, String colour, boolean isClean, boolean hasFood) {
        super(diameter, material, colour, isClean, hasFood);
    }
    @Override
    protected double getMaxFoodWeight() {
        return diameter/4*diameter*0.4*Math.PI;
    }
}
