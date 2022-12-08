package Arrays;

import java.lang.System;
import java.lang.Math;
import java.util.*; 

public class ArrayFunHouse {
	// instance variables and constructors could be used, but are not really needed
	
//	private int[] arr; 
//	
//	public ArrayFunHouse(int[] arr)	{
//		this.arr = arr; 
//	}

	// getSum() will return the sum of the numbers from start to stop, not including
	// stop *****(I did include stop)*****
	public static int getSum(int[] numArray, int start, int stop) {
		
		int sum = 0; 
		for (int i = start; i <= stop; i++) {
			sum += numArray[i]; 
		}
		
		return sum;
	}

	// getCount() will return number of times val is present
	public static int getCount(int[] numArray, int val) {
		int count = 0; 
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] == val) 
				count++; 
		}
		return count; 
	}

	public static int[] removeVal(int[] numArray, int val) {
		int x = getCount(numArray, val); 
		int[] arr = new int[numArray.length - x]; 
		
		int j = 0; 
		for (int i = 0; i < numArray.length; i++) {
			if (!(numArray[i] == val)) {
				arr[j] = numArray[i]; 
				j++; 

			}
		}
		
		return arr; 
		
		
	
	}

}