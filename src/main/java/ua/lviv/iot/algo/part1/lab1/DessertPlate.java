package ua.lviv.iot.algo.part1.lab1;

public class DessertPlate extends Plate {

    public DessertPlate(final float diameter,
                        final String material, final String colour,
                        final boolean isClean, final boolean hasFood) {
        super(diameter, material, colour, isClean, hasFood);
    }
    @Override
    public double getMaxFoodWeight() {
        return getDiameter() * getDiameter() * Math.PI;
    }
}
