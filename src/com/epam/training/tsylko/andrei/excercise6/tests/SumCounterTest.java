package com.epam.training.tsylko.andrei.excercise6.tests;

import org.testng.annotations.Test;

import com.epam.training.tsylko.andrei.excercise5.NumbersWorker;
import com.epam.training.tsylko.andrei.excercise6.ArrayWorker;
import com.epam.training.tsylko.andrei.excercise6.SumCounter;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class SumCounterTest {


	@DataProvider
	public Object[][] dp() {
		return new Object[][] { 
			new Object[] { new double[]{2.0, -2.0, 3.0}, 1.0 },
			new Object[] { new double[]{2.0, -2.0, 2.0}, 0.0 },
			new Object[] { new double[]{0.0, 0.0, 0.0}, 0.0 },
			new Object[] { new double[]{999999.99, -999999.01, 999999.99}, 0.9799999999813735 },
		
		};
	}
	@Test(dataProvider = "dp")
	public void test(double [] array, double expected) {
		Assert.assertEquals(SumCounter.findSumOfMaxAndMin(array), expected);
	

	}
}
