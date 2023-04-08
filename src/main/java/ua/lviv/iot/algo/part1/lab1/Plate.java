package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
public abstract class Plate {
    private float diameter;
    private String material;
    private String colour;
    private boolean isClean = false;
    private boolean hasFood = false;

    protected abstract double getMaxFoodWeight();

}
