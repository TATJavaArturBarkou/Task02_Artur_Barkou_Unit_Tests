package com.epam.training.tsylko.andrei.excercise2;

import com.epam.training.tsylko.andrei.util.Util;

public class Test {
	public static final String CHECKER = "^[+]?\\d{1,5}";

	public static void main(String[] args) {

		if (args.length == 3) {
			if (Util.checkInputNumbers(args[0], CHECKER) && Util.checkInputNumbers(args[1], CHECKER)  && Util.checkInputNumbers(args[2], CHECKER) ) {
				System.out.println(ExpressionsCalculator.solveExpression(Double.parseDouble(args[0]),Double.parseDouble(args[1]), Double.parseDouble(args[2])));
			}else{
				System.out.println("Please, Enter the numbers");
			}
		}else{
			System.out.println("Please, Enter three numbers");
		}

	}


	
}
