package com.codecool;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Race {

    private List<Vehicle> vehicles = new LinkedList<>();

    /**
     * creates 10 cars, 10 trucks and 10 motorcycles.
     */
    private void createVehicles() {
        for (int i = 0; i < 10; i++) {
            vehicles.add(new Car());
            vehicles.add(new Truck());
            vehicles.add(new Motorcycle());
        }
    }

    /**
     * simulates the race by
     *     - calling moveForAnHour() on every vehicle 50 times
     *     - setting whether its raining
     */
    private void simulateRace() {
        for (int i = 0; i < 50; i++) {
            Weather.setRaining();
            vehicles.forEach(vehicle -> vehicle.moveForAnHour(this));
            vehicles.sort(Comparator.comparing(Vehicle::getDistanceTraveled).reversed());
            System.out.println("After " + (i + 1) + " hours, the leader of the race is: " + vehicles.get(0).toString());
        }
    }

    /**
     * prints each vehicle's name, distance traveled and type.
     */
    private void printRaceResults() {
        System.out.println("\nFinal placements: ");
        int placement = 1;
        for (Vehicle vehicle : vehicles) {
            System.out.println(placement + ". " + vehicle.toString());
            placement++;
        }
    }

    boolean isThereABrokenTruck() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getClass().toString().contains("Truck")) {
                Truck truck = (Truck) vehicle;
                if (truck.getBreakdownTurnsLeft() > 0) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();
        race.createVehicles();
        race.simulateRace();
        race.printRaceResults();
    }
}
