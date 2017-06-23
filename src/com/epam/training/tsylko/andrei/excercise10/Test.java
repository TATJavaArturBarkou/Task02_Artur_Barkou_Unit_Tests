package com.epam.training.tsylko.andrei.excercise10;

import com.epam.training.tsylko.andrei.util.Util;

public class Test {
	public static final String CHECKER = "^[+]?[0-9]{1,3}";

	public static void main(String[] args) {

		if (args.length == 1) {
			if (Util.checkInputNumbers(args[0], CHECKER)) {
				int[][] result = ArrayCreator.craftArray(Integer.parseInt(args[0]));
				for (int s = 0; s < result.length; s++) {
					{
						for (int i = 0; i < result.length; i++) {
							System.out.print(result[s][i] + "\t");
						}
						System.out.println();
					}
				}
			}
		}

	}


}
