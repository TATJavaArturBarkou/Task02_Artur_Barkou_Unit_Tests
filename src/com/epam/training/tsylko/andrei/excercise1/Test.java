package com.epam.training.tsylko.andrei.excercise1;

import com.epam.training.tsylko.andrei.util.Util;

public class Test {
	public static final String CHECKER = "^[+,-]?[0-9]{4}";

	public static void main(String[] args) {

		
		
		if (Util.checkInputNumbers(args[0], CHECKER)) {
			System.out.println(NumbersComparator.compareSumOfNumbers(Converter.castNumberToOrderOfMagnitude(Integer.parseInt(args[0]))));
		} else {
			System.out.println("Check entered number");
		}

	}

}
