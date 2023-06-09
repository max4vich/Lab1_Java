package ua.lviv.iot.algo.part1.lab1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class PlateManager {
    public static final List<Plate> PLATES = new ArrayList<>();

    private PlateManager() {
    }

    public static PlateManager create() {
        return new PlateManager();
    }

    public static void addPlate(final Plate plate) {
        PLATES.add(plate);
    }

    public static List<Plate>
    findAllWithMaxFoodWeightGreaterThan(final int maxFoodWeight) {
        return PLATES.stream()
                .filter(plate -> plate.getMaxFoodWeight() > maxFoodWeight)
                .collect(Collectors.toList());
    }

    public static List<Plate> findGlassPlates() {
        return PLATES.stream()
                .filter(plate -> plate.getMaterial().equals("glass"))
                .collect(Collectors.toList());
    }
}

