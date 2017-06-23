package com.epam.training.tsylko.andrei.excercise6;

import com.epam.training.tsylko.andrei.util.Util;

public class Test {
	public static final String CHECKER = "^[+,-]?\\d*";

	public static void main(String[] args) {
		if (args.length == 3) {
			if (Util.checkInputNumbers(args[1], CHECKER) && Util.checkInputNumbers(args[2], CHECKER) && 
					args[3].matches(CHECKER)) {
				System.out.println(SumCounter.findSumOfMaxAndMin(ArrayWorker.addNumberToArray(args)));
			} else {
				System.out.println("Enter correct numbers");
			}
		} else {
			System.out.println("Check your input");
		}

	}


}
