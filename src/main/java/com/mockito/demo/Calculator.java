package com.mockito.demo;

public class Calculator {
	private NumDataService numDataService;

	public Calculator(NumDataService numDataService) {
		super();
		this.numDataService = numDataService;
	}

	public int sum() {
		int[] intArray = numDataService.intArray();
		int result = 0;
		for (int i : intArray) {
			result += i;
		}
		
		return result;				
	}
	
	public int subtract () {
		int[] intArray = numDataService.intArray();
		int result = intArray[0];
		
		for (int i = 1; i < intArray.length; i++) {
			result -= intArray[i];
		}		
		
		return result;				
	}
	
	public int multiple() {
		int[] intArray = numDataService.intArray();
		int result = intArray[0];
		
		for (int i = 1; i < intArray.length; i++) {
			result *= intArray[i];
		}		
		
		return result;				
	}
	
	public int divide() {
		int[] intArray = numDataService.intArray();
		int result = intArray[0];
		
		for (int i = 1; i < intArray.length; i++) {
			result /= intArray[i];
		}		
		
		return result;				
	}
	
}
