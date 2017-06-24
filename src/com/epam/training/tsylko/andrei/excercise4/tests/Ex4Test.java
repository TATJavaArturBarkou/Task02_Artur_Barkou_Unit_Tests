package com.epam.training.tsylko.andrei.excercise4.tests;

import org.testng.annotations.Test;

import com.epam.training.tsylko.andrei.excercise1.Converter;
import com.epam.training.tsylko.andrei.excercise2.ExpressionsCalculator;
import com.epam.training.tsylko.andrei.excercise3.Triangle;
import com.epam.training.tsylko.andrei.excercise4.Area;
import com.epam.training.tsylko.andrei.excercise4.Cross;
import com.epam.training.tsylko.andrei.excercise4.Point;
import com.epam.training.tsylko.andrei.util.Util;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class Ex4Test {

	@DataProvider
	public Object[][] trueDp() {
		return new Object[][] { 
			new Object[] { 1,1},
			new Object[] { -1,-1 },
			new Object[] { 0, 0},
			
			new Object[] { -4, 0 },
			new Object[] { 4, 0 },
			new Object[] { 0, 4},
			new Object[] { 0, -3},
			
			new Object[] { -4, -3 },
			new Object[] { 4, -3 },
			new Object[] { -2, 4},
			new Object[] { 2, 4},
		};
	}
	@DataProvider
	public Object[][] falseDp() {
		return new Object[][] { 
		
			new Object[] { Integer.MAX_VALUE, Integer.MAX_VALUE},
			new Object[] { Integer.MIN_VALUE, Integer.MIN_VALUE },
			
			new Object[] { -5, 0 },
			new Object[] { 5, 0 },
			new Object[] { 0, 5},
			new Object[] { 0, -4},
			
			new Object[] { -5, -3 },
			new Object[] { 4, -4 },
			new Object[] { -3, 4},
			new Object[] { 2, 5},
		};
	}
	@Test(dataProvider = "trueDp")
	public void testTrue(int a, int b) {
		
		Cross rect1 = new Area(new Point(-4, -3), new Point(4, 0));
		Cross rect2 = new Area(new Point(-2, 0), new Point(2, 4));
		Point point = new Point(a, b);
		Assert.assertTrue(rect1.isAreaCrossed(point) || rect2.isAreaCrossed(point));

	}
	@Test(dataProvider = "falseDp")
	public void testFalse(int a, int b) {
		
		Cross rect1 = new Area(new Point(-4, -3), new Point(4, 0));
		Cross rect2 = new Area(new Point(-2, 0), new Point(2, 4));
		Point point = new Point(a, b);
		Assert.assertFalse(rect1.isAreaCrossed(point) || rect2.isAreaCrossed(point));
			


	}
}
