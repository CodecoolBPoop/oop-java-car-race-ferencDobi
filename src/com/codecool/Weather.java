package com.codecool;

import static com.codecool.RandomGen.*;

class Weather {
    private static boolean raining;

    static void setRaining() {
       raining = randomOccurrence(30);
    }

    static boolean isRaining() { return raining; }
}
