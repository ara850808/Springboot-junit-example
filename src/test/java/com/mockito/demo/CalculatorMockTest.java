package com.mockito.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorMockTest {
	
	@Mock
	NumDataService numDataService;
	
	@InjectMocks
	Calculator calculator;
		
	@Test
	public void sum() {
		when(numDataService.intArray()).thenReturn(new int[] {10, 5, 15});
		assertEquals(30, calculator.sum());
	}
	
	@Test
	public void subtract() {
		when(numDataService.intArray()).thenReturn(new int[] {10, 5, 15});
		assertEquals(-10, calculator.subtract());
	}
	
}

