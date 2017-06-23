package com.epam.training.tsylko.andrei.excercise8;

public class DivisibleNumbersCounter {
    public static int countDivisibleNumbers(int[] array, int divisible) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % divisible == 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}
