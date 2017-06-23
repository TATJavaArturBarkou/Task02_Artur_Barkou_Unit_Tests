package com.epam.training.tsylko.andrei.excercise7;


import java.util.HashMap;
import java.util.Map;

public class ExpressionResolver {
    public static Map resolveExpression(double a, double b, double h) {
        Map<Double,Double> result = new HashMap<>();
        for (; a < b; a += h) {
            result.put(a,(Math.pow(Math.sin(a), 2.0) - Math.cos(2.0 * a)));
        }
        return result;
    }
}
