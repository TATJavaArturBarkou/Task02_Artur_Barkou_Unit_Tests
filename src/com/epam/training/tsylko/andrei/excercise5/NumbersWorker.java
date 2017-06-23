package com.epam.training.tsylko.andrei.excercise5;


public class NumbersWorker {
    public static final int POSITIVE = 3;
    public static final int NEGATIVE = 4;

    public static double[] raisingNumbersToPower(double[]array){
        double [] result = new double[array.length];
        for (int  i = 0;  i < array.length; i++) {
            if(array[i]>0){
                result[i] = Math.pow(array[i], POSITIVE);
            }else if (array[i]<0){
                result[i] = Math.pow(array[i], NEGATIVE);
            }else{
                result[i] = array[i];
            }
        }
        return result;
    }
}
