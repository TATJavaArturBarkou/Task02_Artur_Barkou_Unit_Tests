package com.epam.training.tsylko.andrei.excercise9;

public class ArrayUtil {
    public static int[] mergeArrays(int[] a, int[] b, int k) {
        int[] array = new int[a.length + b.length];
        int aDex = 0;
        int bDex = 0;
        int cDex = 0;
        while (aDex < a.length) {
            if (cDex != k) {
                array[cDex++] = a[aDex++];
            } else {
                while (bDex < b.length) {
                    array[cDex++] = b[bDex++];
                }
            }

        }
        return array;
    }
}
