package ua.lviv.iot.algo.part1.lab1;

public class SaladPlate extends Plate {
    private final String saladPlateShape;
    private final boolean isDishwasherSafe;

    private static final double MAX_FOOD_WEIGHT_COEFFICIENT = 3.0;
    public SaladPlate(final float diameter,
                      final String material,
                      final String colour,
                      final boolean isClean,
                      final boolean hasFood,
                      final String saladPlateShape,
                      final boolean isDishwasherSafe) {
        super(diameter, material, colour,
                isClean, hasFood);
        this.saladPlateShape = saladPlateShape;
        this.isDishwasherSafe = isDishwasherSafe;
    }

    @Override
    public double getMaxFoodWeight() {
        final double radius = getDiameter() / 2;
        return Math.PI * radius * radius * radius
                / MAX_FOOD_WEIGHT_COEFFICIENT;
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
                + "\nDoes plate has food? - "
                + isHasFood() + "\nShape of SaladPlate: "
                + saladPlateShape
                + "\nCan it be used in dishwasher? "
                + isDishwasherSafe + "\nWhat is maximum weight of food? "
                + getMaxFoodWeight() + "\n";
    }
    public String getHeaders(){
        return super.getHeaders() + ", saladPlateShape, isDishwasherSafe";
    }

    public String toCSV(){
        return super.toCSV() + ", " + saladPlateShape + ", " + isDishwasherSafe;
    }
}