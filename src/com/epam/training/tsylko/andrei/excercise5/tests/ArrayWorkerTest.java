package com.epam.training.tsylko.andrei.excercise5.tests;

import org.testng.annotations.Test;
import com.epam.training.tsylko.andrei.excercise5.ArrayWorker;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class ArrayWorkerTest {

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { 
			new Object[] { new String[]{"1","2","3"}, new double[]{1.0,2.0,3.0}},
		};
	}

	@Test(dataProvider = "dp")
	public void test(String [] args,double[] expected) {
		
		double[] array = ArrayWorker.addNumberToArray(args);

		for(int i = 0; i < array.length; i++){
			Assert.assertEquals(array[i], expected[i]);
		}
		
	}

}
