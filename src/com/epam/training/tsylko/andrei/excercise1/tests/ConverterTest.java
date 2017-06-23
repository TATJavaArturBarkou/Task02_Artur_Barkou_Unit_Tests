package com.epam.training.tsylko.andrei.excercise1.tests;

import org.testng.annotations.Test;

import com.epam.training.tsylko.andrei.excercise1.Converter;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class ConverterTest {

	@DataProvider
	public Object[][] castNumberToOrderDp() {
		return new Object[][] { 
			new Object[] { 0000, new int[] { 0, 0, 0, 0 } },
			new Object[] { 0001, new int[] { 1, 0, 0, 0 } }, 
			new Object[] { 2350, new int[] { 0, 5, 3, 2 } },
			new Object[] { 8888, new int[] { 8, 8, 8, 8 } }, 
			new Object[] { -5151, new int[] { 1, 5, 1, 5 } },
			new Object[] { +0404, new int[] { 4, 0, 4, 0 } }, 
			new Object[] { 99999, new int[] { 9,9,9,9,9,9 } }, 
			
			new Object[] { 123, new int[] { 3, 2, 1 } }, 
			new Object[] { 12, new int[] { 2, 1 } },
			new Object[] { 1, new int[] { 1 } }, 
		};
	}

	@Test(dataProvider = "castNumberToOrderDp")
	public void castNumberToOrderOfMagnitudeTest(int inputNumber, int[] expectedArr) {

		for(int i = 0; i<expectedArr.length; i++){
			Assert.assertEquals(Converter.castNumberToOrderOfMagnitude(inputNumber)[i], expectedArr[i]);
			Assert.assertEquals(Converter.castNumberToOrderOfMagnitude(inputNumber)[i], expectedArr[i]);
			Assert.assertEquals(Converter.castNumberToOrderOfMagnitude(inputNumber)[i], expectedArr[i]);
			Assert.assertEquals(Converter.castNumberToOrderOfMagnitude(inputNumber)[i], expectedArr[i]);
		}

	}
}
