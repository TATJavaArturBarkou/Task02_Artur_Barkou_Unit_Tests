package com.epam.training.tsylko.andrei.excercise10;


public class ArrayCreator {
    public static int[][] craftArray(int n) {
        int[][] array = new int[n][n];
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i % 2 == 0) {
                    array[i][j] = ++number;
                } else {
                    array[i][j] = number--;
                }
            }
        }

        return array;
    }
}
