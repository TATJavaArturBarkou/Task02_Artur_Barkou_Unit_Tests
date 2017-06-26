package com.epam.training.tsylko.andrei.excercise9.tests;

import org.testng.annotations.Test;

import com.epam.training.tsylko.andrei.excercise5.NumbersWorker;
import com.epam.training.tsylko.andrei.excercise6.ArrayWorker;
import com.epam.training.tsylko.andrei.excercise6.SumCounter;
import com.epam.training.tsylko.andrei.excercise7.ExpressionResolver;
import com.epam.training.tsylko.andrei.excercise8.DivisibleNumbersCounter;
import com.epam.training.tsylko.andrei.excercise9.ArrayUtil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class ArrayUtilTest {


	@DataProvider
	public Object[][] dp() {
		return new Object[][] { 
			new Object[] {new int[]{2, 3, 4}, new int[]{2, 3, 5}, 2, new int[]{2, 3, 2, 3, 5, 4}},
			new Object[] {new int[]{2, 3, 4}, new int[]{2, 3, 5}, 1, new int[]{2, 2, 3, 5, 3, 4}},
			new Object[] {new int[]{2, 3, 4}, new int[]{2, 3, 5}, 3, new int[]{2, 3, 4, 2, 3, 5}},
		};
	}
	@Test(dataProvider = "dp")
	public void test(int[] a, int[] b, int k, int[] expected) {
		
		
		int[] result = ArrayUtil.mergeArrays(a, b, k);
		
		for(int i =0; i<result.length; i++){
		Assert.assertEquals(result[i], expected[i]);
		}
		
	}
}
