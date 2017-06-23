package com.epam.training.tsylko.andrei.util;

public class Util {
	public static boolean checkInputNumbers(String inputString, String regex) {
		String numberForReg = "" + inputString;
		if (numberForReg.matches(regex)) {
			return true;
		} else {
			return false;
		}
	}
}
