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

    /**
     * Picks and returns a random string from an array of strings.
     *
     * @param strings an array of strings
     *
     * @return randomly chosen string
     */
    static String randomPick(String[] strings) {
        return strings[random.nextInt(strings.length)];
    }

    /**
     * Returns true with the given percentage of chance, or false otherwise.
     *
     * @param chancePercentage a number between 1 and 100
     *
     * @return a (weighted) random boolean
     */
    static boolean randomOccurrence(int chancePercentage) {
        return randomNumber(1, 100) <= chancePercentage;
    }
}
