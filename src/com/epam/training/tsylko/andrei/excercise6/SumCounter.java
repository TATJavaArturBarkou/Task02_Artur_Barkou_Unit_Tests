package com.epam.training.tsylko.andrei.excercise6;


public class SumCounter {
    public static double findSumOfMaxAndMin(double[] array) {
        double min = array[0];
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        return min + max;
    }
}
