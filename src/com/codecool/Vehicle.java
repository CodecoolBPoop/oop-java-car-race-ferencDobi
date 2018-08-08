package com.codecool;

public class Vehicle {

    private int normalSpeed;
    /*
     TODO: Car: the normal speed of the car. Set to a random number in the constructor between 80-110km/h.
     TODO: Motorcycle: speed is 100km/h. If it rains, travels with 5-50km/h slower (randomly).
     TODO: speed: 100km/h. 5% chance of breaking down for 2 hours.
    */

    public String name() {
        /*  TODO: Make a list from the words here: http://www.fantasynamegenerators.com/car-names.php
                and pick 2 randomly for each instance.
            TODO: Are called "Motorcycle 1", "Motorcycle 2", "Motorcycle 3",... Unique.
            TODO: Truck drivers are boring. They call all their trucks a random number between 0 and 1000.
         */
        return "";
    }

    private int distanceTraveled; // holds the current distance traveled.

    /**
     * The vehicle travels for an hour. It increases the distance traveled. Call this from the main class only!
     *     If there is a broken down Truck on the track, then limit the max speed of vehicles to 75 km/h.
     * @param race
     */
    public void moveForAnHour(Race race) {
        // TODO
    }
}
