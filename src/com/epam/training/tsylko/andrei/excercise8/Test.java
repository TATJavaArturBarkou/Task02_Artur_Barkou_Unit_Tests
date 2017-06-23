package com.epam.training.tsylko.andrei.excercise8;


import com.epam.training.tsylko.andrei.util.Util;

public class Test {

	public static final String CHECKER = "^[+]?[0-9]{1,3}";

	public static void main(String[] args) {

		if (args.length == 2) {
			// first argument array size and second is divider
			if( Util.checkInputNumbers(args[0], CHECKER) && Util.checkInputNumbers(args[1], CHECKER)) {
				int[] array = new int[Integer.parseInt(args[0])];
				array = ArrayGenerator.fillArray(array);
				System.out.println(" Sum :" + DivisibleNumbersCounter.countDivisibleNumbers(array, Integer.parseInt(args[1])));
			}
		}

	}





}
