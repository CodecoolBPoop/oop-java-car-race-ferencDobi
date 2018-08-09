package com.codecool;

import static com.codecool.RandomGen.*;

public class Car extends Vehicle {

    private String[] carNames = {
            "Celestial", "Nebula", "Aura", "Magic", "Momentum", "Gallop", "Mystery",
            "Whim", "Voyage", "Dynamics", "Wish", "Expedition", "Radiance", "Centaur",
            "Patron", "Crusader", "Flux", "Oracle", "Union", "Vulture", "Grit",
            "Vision", "Tradition", "Phantom", "Olympian", "Adventure", "Pulse"
    };

    public Car() {
        setNormalSpeed(randomNumber(80, 110));
        setName(randomPick(carNames) + " " + randomPick(carNames));
    }

    @Override
    public void moveForAnHour(Race race) {
        updateDistanceTraveled(getNormalSpeed());
    }
}
