package ua.lviv.iot.algo.part1.lab1;

public class SoupPlate extends Plate {
    private final float plateDepth;
    private final String soupType;

    public SoupPlate(final float diameter,
                     final String material,
                     final String colour,
                     final boolean isClean,
                     final boolean hasFood,
                     final float plateDepth,
                     final String soupType) {
        super(diameter, material, colour, isClean, hasFood);
        this.plateDepth = plateDepth;
        this.soupType = soupType;
    }

    @Override
    public double getMaxFoodWeight() {
        final double radius = getDiameter() / 2;
        final double maxFoodWeight =
                0.5 * Math.PI * radius * radius * plateDepth;
        return maxFoodWeight;
    }

    @Override
    public String toString() {
        return "\nDiameter of plate is: "
                + getDiameter()
                + "\nMaterial of plate is: "
                + getMaterial()
                + "\nColour of plate is: "
                + getColour()
                + "\nIs plate clean? - "
                + isClean()
                + "\nDoes plate have food? - "
                + isHasFood()
                + "\nDepth of plate is: "
                + plateDepth
                + "\nWhat type of soup is plate for? "
                + soupType
                + "\nWhat is maximum weight of food? "
                + getMaxFoodWeight()
                + "\n";
    }

}
