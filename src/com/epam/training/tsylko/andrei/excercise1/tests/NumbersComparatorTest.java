package com.epam.training.tsylko.andrei.excercise1.tests;

import org.testng.annotations.Test;

import com.epam.training.tsylko.andrei.excercise1.NumbersComparator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class NumbersComparatorTest {

	@DataProvider
	public Object[][] trueDp() {
		return new Object[][] { 
			new Object[] { new int[] { 0, 0, 0, 0 } },
			new Object[] { new int[] { 0, 5, 3, 2 } },
			new Object[] { new int[] { 8, 8, 8, 8 } }, 
			new Object[] { new int[] { 1, 5, 1, 5 } },
			new Object[] { new int[] { 4, 0, 4, 0 } }, 
			new Object[] { new int[] { 9,9,9,9,9,9 } }, 
			
		};
	}
	@DataProvider
	public Object[][] falseDp() {
		return new Object[][] { 

			new Object[] { new int[] { 1, 0, 0, 0 } }, 
			new Object[] { new int[] { 2,1,9,9,9,9 } }, 
			new Object[] { new int[] { 3, 2, 1 } }, 
			new Object[] { new int[] { 2, 1 } },
			new Object[] { new int[] { 1 } }, 
			
		};
	}

	@Test(dataProvider = "trueDp")
	public void compareSumOfNumbersTrueTest(int[]array) {
		
		Assert.assertTrue(NumbersComparator.compareSumOfNumbers(array));
	}
	
	@Test(dataProvider = "falseDp")
	public void compareSumOfNumbersFalseTest(int[]array) {
		
		Assert.assertFalse(NumbersComparator.compareSumOfNumbers(array));
	}

}
