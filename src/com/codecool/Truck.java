package com.codecool;

import static com.codecool.RandomGen.*;

public class Truck extends Vehicle {

    private int breakdownTurnsLeft; // holds how long its still broken down.

    public Truck() {
        setName(String.valueOf(randomNumber(0, 1000)));
        setNormalSpeed(100);
    }

    @Override
    public void moveForAnHour(Race race) {
        // TODO 5% chance of breaking down for 2 hours.
    }
}
