package com.epam.training.tsylko.andrei.excercise5;

import com.epam.training.tsylko.andrei.util.Util;

public class ArrayWorker {
    public static final String CHECKER = "^[+,-]?\\d{1,5}";

    public static double[] addNumberToArray(String [] args){
        double[] result = new double [args.length];
        int j = 0;
        for (int i = 0; i < args.length; i++) {
            if(Util.checkInputNumbers(args[i], CHECKER)){
                result[j] = Double.parseDouble(args[i]);
                j++;
            }
        }

        return result;
    }
}
