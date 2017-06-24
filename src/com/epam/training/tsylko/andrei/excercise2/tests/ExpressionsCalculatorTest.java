package com.epam.training.tsylko.andrei.excercise2.tests;

import org.testng.annotations.Test;

import com.epam.training.tsylko.andrei.excercise1.Converter;
import com.epam.training.tsylko.andrei.excercise2.ExpressionsCalculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class ExpressionsCalculatorTest {

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { 
			new Object[] { 1.0,2.0,3.0, 0.25 },
			new Object[] { 0.0,2.0,3.0, 0.25 },
			new Object[] { 100000.0,200000.0,300000.0, -2.9999999997E20 },
			new Object[] { -1.0,-2.0,-3.0, -3.75 },
			new Object[] { 0.0, 0.0, 0.0, Double.POSITIVE_INFINITY },
			new Object[] { Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NaN },
			new Object[] { Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NaN },
			new Object[] { Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE, Double.NaN },
			new Object[] { Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE, Double.POSITIVE_INFINITY },
		};
	}

	@Test(dataProvider = "dp")
	public void test(double a, double b, double c, double expected) {

		Assert.assertEquals(ExpressionsCalculator.solveExpression(a, b, c), expected);

	}
}
