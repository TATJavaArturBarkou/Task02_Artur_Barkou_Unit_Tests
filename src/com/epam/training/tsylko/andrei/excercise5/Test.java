package com.epam.training.tsylko.andrei.excercise5;


public class Test {
	


	
	public static void main(String[] args) {
		double[] array = ArrayWorker.addNumberToArray(args);
		
		double[]result = NumbersWorker.raisingNumbersToPower(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	

	


}
