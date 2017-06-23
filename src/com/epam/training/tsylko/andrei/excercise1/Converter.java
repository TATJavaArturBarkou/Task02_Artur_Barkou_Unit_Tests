package com.epam.training.tsylko.andrei.excercise1;

public class Converter {
    public static int[] castNumberToOrderOfMagnitude(int number) {
        int[] array = new int[4];
        int i = 0;
        while (number > 0) {
            array[i] = number % 10;
            number = number / 10;
            i++;
        }
        return array;
    }
}
