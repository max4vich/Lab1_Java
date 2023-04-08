package ua.lviv.iot.algo.part1.lab1;

public class DinnerPlate extends Plate {
    public DinnerPlate(final float diameter, final String material,
                       final String colour, final boolean isClean,
                       final boolean hasFood) {
        super(diameter, material, colour, isClean, hasFood);
    }

    @Override
    public double getMaxFoodWeight() {
        final double plateRadius = getDiameter() / 2;
        final double plateArea = plateRadius * plateRadius * Math.PI;
        final double foodHeight = plateRadius * 0.4;
        final double foodVolume = plateArea * foodHeight;
        final double foodWeight = foodVolume * FOOD_DENSITY;
        return foodWeight;
    }

    private static final double FOOD_DENSITY = 1.2;
}
