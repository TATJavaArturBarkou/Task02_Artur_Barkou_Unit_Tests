package com.epam.training.tsylko.andrei.excercise9;


import com.epam.training.tsylko.andrei.util.Util;

public class Test {

	public static final String CHECKER = "^[+]?[0-9]{1,3}";

	public static void main(String[] args) {

		if (args.length == 3) {
			// first argument - array size, second argument - array size and
			// third is number
			if (Util.checkInputNumbers(args[0], CHECKER)&& Util.checkInputNumbers(args[1], CHECKER)) {
				int[] firstArray = new int[Integer.parseInt(args[0])];
				firstArray = ArrayGenerator.fillArray(firstArray);
				int[] secondArray = new int[Integer.parseInt(args[1])];
				secondArray = ArrayGenerator.fillArray(secondArray);

				int key = Integer.parseInt(args[2])-1;
				if(ExpressionCheker.checkKeyShorterThanArray(key, firstArray.length)){
					int[] result =ArrayUtil.mergeArrays(firstArray, secondArray, key);
					for (int s = 0; s < result.length; s++) {
						System.out.print(result[s] + " ");
					}
				}else{
					System.out.println("Enter correct key");
				}
				

			}
		}

	}


	




}
