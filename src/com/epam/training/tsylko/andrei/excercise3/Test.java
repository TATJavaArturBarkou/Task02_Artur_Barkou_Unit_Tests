package com.epam.training.tsylko.andrei.excercise3;

import com.epam.training.tsylko.andrei.util.Util;

public class Test {
	public static final String CHECKER = "^[+]?\\d{1,3}";

	public static void main(String[] args) {
		if (args.length == 2) {
			if (Util.checkInputNumbers(args[0], CHECKER) && Util.checkInputNumbers(args[1], CHECKER)) {
				Triangle s = new Triangle(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
				System.out.println("Perimeter: " + s.getPerimeter());
				System.out.println("Area: " + s.getArea());
			} else {
				System.out.println("You entered a wrong number.");
			}

		} else {
			System.out.println("Check inputed parameters");
		}

	}

}



