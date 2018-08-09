package com.codecool;

public class Motorcycle extends Vehicle {
    private static int nameNumber = 1;

    public Motorcycle() {
        setName("Motorcycle " + nameNumber++);
        setNormalSpeed(100);
    }

    @Override
    public void moveForAnHour(Race race) {
        // TODO: If it rains, travels with 5-50km/h slower (randomly).
    }
}
