package com.epam.training.tsylko.andrei.excercise6;


public class ArrayWorker {

    public static double[] addNumberToArray(String[] args) {
        double[] result = new double[args.length];
        int j = 0;
        for (int i = 0; i < args.length; i++) {
            result[j] = Double.parseDouble(args[i]);
            j++;
        }
        return result;
    }
}
