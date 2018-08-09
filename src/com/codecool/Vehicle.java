package com.codecool;

public abstract class Vehicle {

    private String name;
    private int normalSpeed;
    private int distanceTraveled; // holds the current distance traveled.

    /**
     * The vehicle travels for an hour. It increases the distance traveled. Call this from the main class only!
     *     If there is a broken down Truck on the track, then limit the max speed of vehicles to 75 km/h.
     * @param race
     */
    public abstract void moveForAnHour(Race race);

    int getNormalSpeed() {
        return normalSpeed;
    }

    void setNormalSpeed(int normalSpeed) {
        if (this.normalSpeed == 0) this.normalSpeed = normalSpeed;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        if (this.name == null) this.name = name;
    }

    int getDistanceTraveled() {
        return distanceTraveled;
    }

    void updateDistanceTraveled(int distance) {
        distanceTraveled += distance;
    }

    @Override
    public String toString() {
        String type = getClass().toString().split("\\.")[2];
        return getName() + " (" + type + "): " + getDistanceTraveled() + " km travelled.";
    }
}
