package com.epam.training.tsylko.andrei.excercise3.tests;

import org.testng.annotations.Test;

import com.epam.training.tsylko.andrei.excercise1.Converter;
import com.epam.training.tsylko.andrei.excercise2.ExpressionsCalculator;
import com.epam.training.tsylko.andrei.excercise3.Triangle;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class TriangleTest {

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { 
			new Object[] { 3.0,4.0,12.0, 6 },
			new Object[] { 100000.0,200000.0,523606.79774997896, 1.0E10 },
		
			// expected results for this cases are not specified
			new Object[] { 0.0,2.0,4.0, 0.0 },
			new Object[] { -1.0,-2.0,-0.7639320225002102, 1.0 },
			new Object[] { 0.0, 0.0, 0.0, 0.0},
			new Object[] { Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY },
			new Object[] { Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NaN, Double.POSITIVE_INFINITY },
			new Object[] { Double.MAX_VALUE, Double.MAX_VALUE, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY },
			new Object[] { Double.MIN_VALUE, Double.MIN_VALUE, 1.0E-323, 0.0 },
		};
	}

	@Test(dataProvider = "dp")
	public void test(double a, double b, double expectedPerimetr, double expectedSquare) {
		
		Triangle s = new Triangle(a, b);

		Assert.assertEquals(s.getPerimeter(), expectedPerimetr);
		Assert.assertEquals(s.getArea(), expectedSquare);

	}
}
