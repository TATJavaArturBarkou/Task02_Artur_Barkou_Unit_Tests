package com.epam.training.tsylko.andrei.excercise10.tests;

import org.testng.annotations.Test;

import com.epam.training.tsylko.andrei.excercise10.ArrayCreator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class ArrayCreatorTest {


	@DataProvider
	public Object[][] dp() {
		return new Object[][] { 
			new Object[] {5, new int[][]{{1,2,3,4,5},{5,4,3,2,1},{1,2,3,4,5},{5,4,3,2,1},{1,2,3,4,5}},},
			new Object[] {1, new int[][]{{1}},},
		};
	}
	@Test(dataProvider = "dp")
	public void test(int n, int[][] expected) {
		
		int[][] result = ArrayCreator.craftArray(n);
		for (int s = 0; s < result.length; s++) {
			{
				for (int i = 0; i < result.length; i++) {
					Assert.assertEquals(result[s][i], expected[s][i]);
				}
			
			}
		}
		
	
	
		
		
	}
}
