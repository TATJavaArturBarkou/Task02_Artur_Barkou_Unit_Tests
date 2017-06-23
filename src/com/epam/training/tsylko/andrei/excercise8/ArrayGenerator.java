package com.epam.training.tsylko.andrei.excercise8;

import java.util.concurrent.ThreadLocalRandom;


public class ArrayGenerator {
    public static final int MIN = 1;
    public static final int MAX = 20;
    public static int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(MIN, MAX);
        }
        return array;
    }
}
