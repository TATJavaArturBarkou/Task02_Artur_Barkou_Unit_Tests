package com.epam.training.tsylko.andrei.excercise1.tests;

import org.testng.annotations.Test;

import com.epam.training.tsylko.andrei.util.Util;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class RegularExpressionTest {
	@DataProvider
	public Object[][] trueDp() {
		return new Object[][] { 
			new Object[] { "1111" },
			new Object[] { "2350" },
			new Object[] { "-9999" },
			new Object[] { "+9999" },
			
			//hello
			
		};
	}
	@DataProvider
	public Object[][] falseDp() {
		return new Object[][] { 
			new Object[] { "1000" },
			new Object[] { "0001" },
			
			
		};
	}
  
	@Test(dataProvider = "trueDp")
	public void compareSumOfNumbersTrueTest(String inputString) {
		
		Assert.assertTrue(Util.checkInputNumbers(inputString, com.epam.training.tsylko.andrei.excercise1.Test.CHECKER));
	}
	
	@Test(dataProvider = "falseDp")
	public void compareSumOfNumbersFalseTest(String inputString) {
		
		Assert.assertFalse(Util.checkInputNumbers(inputString, com.epam.training.tsylko.andrei.excercise1.Test.CHECKER));
	}
}
