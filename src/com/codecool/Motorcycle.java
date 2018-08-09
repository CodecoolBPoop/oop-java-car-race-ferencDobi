package com.codecool;

import static com.codecool.RandomGen.*;

public class Motorcycle extends Vehicle {

    private static int nameNumber = 1;

    public Motorcycle() {
        setName("Motorcycle " + nameNumber++);
        setNormalSpeed(100);
    }

    @Override
    public void moveForAnHour(Race race) {
        int speedLoss = Weather.isRaining() ? randomNumber(5, 50) : 0;
        updateDistanceTraveled(getNormalSpeed() - speedLoss);
    }
}
