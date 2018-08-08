package com.codecool;

import java.util.Random;

class RandomGen {
    private static Random random = new Random();

    /**
     * Generates a random integer between the values specified in the parameters.
     *
     * @param from lower bound (inclusive)
     * @param to upper bound (inclusive)
     *
     * @return randomly generated integer
     */
    static int randomNumber(int from, int to) {
        int bound = to - from + 1;
        return random.nextInt(bound) + from;
    }
}
