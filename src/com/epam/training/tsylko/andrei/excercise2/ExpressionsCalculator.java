package com.epam.training.tsylko.andrei.excercise2;

public class ExpressionsCalculator {
    public static double solveExpression(double a, double b, double c) {
        double part = Math.sqrt((Math.pow(b, 2) + 4 * a * c));
        double result = (b + part) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
        return result;
    }
}
