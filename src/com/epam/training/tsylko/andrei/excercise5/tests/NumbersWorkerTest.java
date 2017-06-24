package com.epam.training.tsylko.andrei.excercise5.tests;

import org.testng.annotations.Test;

import com.epam.training.tsylko.andrei.excercise5.NumbersWorker;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class NumbersWorkerTest {


	@DataProvider
	public Object[][] dp() {
		return new Object[][] { 

			new Object[] { new double[]{2.0, -2.0, 2.0}, new double[]{4.0, 16.0, 4.0} },
			new Object[] { new double[]{0.0, 0.0, 0.0}, new double[]{0.0, 0.0, 0.0} },
			new Object[] { new double[]{999999.99, -999999.99, 999999.99}, new double[]{999999980000.0001, 9.999999600000005E23, 999999980000.0001} },
		
		};
	}
	@Test(dataProvider = "dp")
	public void test(double [] array, double [] expected) {
		double[]result = NumbersWorker.raisingNumbersToPower(array);
		
		for(int i = 0; i < result.length; i++){
			Assert.assertEquals(result[i], expected[i]);
		}
	}

}
