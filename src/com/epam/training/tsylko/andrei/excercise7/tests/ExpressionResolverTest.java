package com.epam.training.tsylko.andrei.excercise7.tests;

import org.testng.annotations.Test;

import com.epam.training.tsylko.andrei.excercise5.NumbersWorker;
import com.epam.training.tsylko.andrei.excercise6.ArrayWorker;
import com.epam.training.tsylko.andrei.excercise6.SumCounter;
import com.epam.training.tsylko.andrei.excercise7.ExpressionResolver;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class ExpressionResolverTest {


	@DataProvider
	public Object[][] dp() {
		return new Object[][] { 
			new Object[] {-2.0, 4.0, 2.0, new double []{1.480465431295418,-1.0 ,1.480465431295418 } },

		};
	}
	@Test(dataProvider = "dp")
	public void test(double a, double b, double h, double [] expected) {
		
		Map result = ExpressionResolver.resolveExpression(a, b, h);
		
		Set<Map.Entry<Double,Double>> setValue = result.entrySet();

		Iterator <Map.Entry<Double,Double>> i = setValue.iterator();
		int counter =0;
		while(i.hasNext()){
			Map.Entry<Double,Double> me=i.next();
			Assert.assertEquals(me.getValue(), expected[counter]);
			counter++;
		}
		
	}
}
