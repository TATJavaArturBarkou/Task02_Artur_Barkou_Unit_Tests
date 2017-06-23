package com.epam.training.tsylko.andrei.excercise4;

import com.epam.training.tsylko.andrei.util.Util;
import com.epam.training.tsylko.andrei.excercise4.Area;

public class Test {
	public static final String CHECKER = "^[+,-]?[0-9]{1,3}";

	public static void main(String[] args) {
		Cross rect1 = new Area(new Point(-4, -3), new Point(4, 0));
		Cross rect2 = new Area(new Point(-2, 0), new Point(2, 4));
	
			if (args.length == 2 && Util.checkInputNumbers(args[0], CHECKER) && Util.checkInputNumbers(args[0], CHECKER)) {
				Point point = new Point(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
				System.out.println(rect1.isAreaCrossed(point) || rect2.isAreaCrossed(point));
			}
		

	}

}


