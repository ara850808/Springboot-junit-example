package com.junit.demo;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	Calculator cal = new Calculator();

	
	@BeforeClass
	public static void printHeader() {
		System.out.println("CalculatorTest start");
		System.out.println("--------------------");
	};
	
	@AfterClass
	public static void printFooter() {
		System.out.println("--------------------");
		System.out.println("CalculatorTest end");	
	};		
	
	@Test
	public void sum() {
		System.out.println("sum");
		assertEquals(6, cal.sum(2, 4));
	}

	@Test
	public void subtract() {
		System.out.println("subtract");
		// assertEquals(-3, cal.substract(2, 4));
		assertEquals(-2, cal.substract(2, 4));
	}
}
