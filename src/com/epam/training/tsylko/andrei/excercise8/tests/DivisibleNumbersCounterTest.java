package com.epam.training.tsylko.andrei.excercise8.tests;

import org.testng.annotations.Test;

import com.epam.training.tsylko.andrei.excercise5.NumbersWorker;
import com.epam.training.tsylko.andrei.excercise6.ArrayWorker;
import com.epam.training.tsylko.andrei.excercise6.SumCounter;
import com.epam.training.tsylko.andrei.excercise7.ExpressionResolver;
import com.epam.training.tsylko.andrei.excercise8.DivisibleNumbersCounter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class DivisibleNumbersCounterTest {


	@DataProvider
	public Object[][] dp() {
		return new Object[][] { 
			new Object[] {new int[]{2, 3, 4, 5}, 2, 6},
			new Object[] {new int[]{2, 3, 4, 5}, 0, 6},
			new Object[] {new int[]{0, 3, 4, 5}, 1, 12},
			
			new Object[] {new int[]{-4, 3, 4, -5}, 2, 0},
		};
	}
	@Test(dataProvider = "dp")
	public void test(int [] array, int division, int result) {
		Assert.assertEquals(DivisibleNumbersCounter.countDivisibleNumbers(array, division), result);
		
		
	}
}
