package com.mockito.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	Calculator cal = new Calculator(new NumDataServiceImpl());
	
	@Test
	public void sum() {
		int result = cal.sum();
		// assertEquals(16, result);
		assertEquals(15, result);
	}	
	
	@Test
	public void subtract() {		
		int result = cal.subtract();
		// assertEquals(16, result);
		assertEquals(-5, result);
	}	

	@Test
	public void multiple() {		
		int result = cal.multiple();
		// assertEquals(16, result);
		assertEquals(50, result);
	}
	
	@Test
	public void divide() {		
		int result = cal.divide();
		// assertEquals(16, result);
		assertEquals(0, result);
	}
	
}

class NumDataServiceImpl implements NumDataService {
	@Override
	public int[] intArray() {
		return new int[] { 5, 10 };
	}
}
