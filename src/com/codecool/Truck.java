package com.codecool;

import static com.codecool.RandomGen.*;

public class Truck extends Vehicle {

    private int breakdownTurnsLeft;

    public Truck() {
        setName(String.valueOf(randomNumber(0, 1000)));
        setNormalSpeed(100);
    }

    private void updateBreakdownStatus() {
        if (randomOccurrence(5)) breakdownTurnsLeft += 2;
    }

    @Override
    public void moveForAnHour(Race race) {
        if (breakdownTurnsLeft == 0) {
            updateBreakdownStatus();
            updateDistanceTraveled(getNormalSpeed());
        } else breakdownTurnsLeft--;
    }
}
