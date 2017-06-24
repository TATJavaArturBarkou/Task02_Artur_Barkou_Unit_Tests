package com.epam.training.tsylko.andrei.excercise3.tests;

import org.testng.annotations.Test;

import com.epam.training.tsylko.andrei.util.Util;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class RegularExpressionTest {
	@DataProvider
	public Object[][] trueDp() {
		return new Object[][] { 
			new Object[] { "99999999" },
			new Object[] { "-9999" },
			new Object[] { "+9999" },
			new Object[] { "0100" },
			new Object[] { "0001" },
			new Object[] { "0.0" },
			new Object[] { "1.7976931348623157E308" },
			new Object[] { "4.9E-324" },
			new Object[] { "-1d/0d" },
			new Object[] { "1d/0d" },
			//
		};
	}
	@DataProvider
	public Object[][] falseDp() {
		return new Object[][] { 
		
			new Object[] { "abcd" },
			new Object[] { "" },
			new Object[] { " " },
			new Object[] { "абвг" },
			new Object[] { "#" },
			new Object[] { "\n" },
			new Object[] { "0d/0d" },
			new Object[] { "안녕" },
		};
	}
  
	@Test(dataProvider = "trueDp")
	public void trueTest(String inputString) {
		
		Assert.assertTrue(Util.checkInputNumbers(inputString, com.epam.training.tsylko.andrei.excercise1.Test.CHECKER));
	}
	
	@Test(dataProvider = "falseDp")
	public void falseTest(String inputString) {
		
		Assert.assertFalse(Util.checkInputNumbers(inputString, com.epam.training.tsylko.andrei.excercise1.Test.CHECKER));
	}
}
