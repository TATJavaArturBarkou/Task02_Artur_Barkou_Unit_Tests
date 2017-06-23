package com.epam.training.tsylko.andrei.excercise7;

import com.epam.training.tsylko.andrei.util.Util;

import java.util.Map;

public class Test {

	public static final String CHECKER = "^[+,-]?d{1,3}";

	public static void main(String[] args) {
		args.toString();
		if (args.length == 3) {
			if (Util.checkInputNumbers(args[0], CHECKER) && Util.checkInputNumbers(args[1], CHECKER) && Util.checkInputNumbers(args[3], CHECKER)) {
				double a = Double.parseDouble(args[0]);
				double b = Double.parseDouble(args[1]);
				double h = Double.parseDouble(args[2]);

			Map<Double,Double> result = ExpressionResolver.resolveExpression(a, b, h);
			result.forEach((k,v)-> System.out.println(k + "\t : " + v));
			} else {
				System.out.println("Check entered numbers");
			}
		} else {
			System.out.println("Check amount of numbers");
		}

	}


}
