package Arrays;

import java.util.*; 

public class ArrAct2 {
	

	public static int[] countEvens(int[] arr) {

		int countere = 0; 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				countere++; 
			}
		}
		
		
		int [] temp = new int [countere]; 
		
		int j = 0; 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0 ) {
				temp[j] = arr[i]; 
				j++; 
			}
		}
		
		return temp; 
		
		
	}
	
	public static int[] countOdds(int[] arr) {
		
		int countero = 0; 
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				
				countero++; 
				
			}
		}
		
		int[] temp = new int[countero]; 
		
		int j = 0; 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				temp[j] = arr[i]; 
				j++; 
			}
		}
		
		
		return temp; 
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
	
		String input; 
		String[] temp; 
		
		System.out.println("Enter the first list of numbers (use commas between each number) ** also remember to not put a space after the last number **: ");
		input = scan.nextLine();
		temp = input.split(", "); //regice
		
		
		int[] arr1 = new int[temp.length];
		for (int i = 0; i < arr1.length; i++) {
		    arr1[i] = Integer.parseInt(temp[i]);
		}		
		
		
		
		System.out.println("Enter the second list of numbers (use commas between each number) ** also remember to not put a space after the last number **: "); 
		input = scan.nextLine();
		temp = input.split(", "); 
		
		int[] arr2 = new int[temp.length]; 
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = Integer.parseInt(temp[i]); 
		}
	
		
		System.out.println("Enter the third list of numbers (use commas between each number) ** also remember to not put a space after the last number **: ");
		
		input = scan.nextLine(); 
		temp = input.split(", "); 
		
		int[] arr3 = new int[temp.length]; 
		
		for (int i = 0; i < arr3.length; i ++) {
			
			arr3[i] = Integer.parseInt(temp[i]); 
			
		}
	
		
		
		
		
//		int[] arr1 = {2, 4, 6, 8, 10, 12, 14}; 
//		int[] arr2 = {1, 2, 3, 4, 5 ,6 ,7 ,8 ,9}; 
//		int[] arr3 = {2, 10, 20, 21, 23, 24, 40, 55, 60, 61}; 
		
		System.out.println("\n\n"); 
		
		System.out.println("Odds - " + Arrays.toString(countOdds(arr1))); 
		System.out.println("Evens - " + Arrays.toString(countEvens(arr1))); 
		System.out.println();
		System.out.println("Odds - " + Arrays.toString(countOdds(arr2))); 
		System.out.println("Evens - " + Arrays.toString(countEvens(arr2))); 
		System.out.println();
		System.out.println("Odds - " + Arrays.toString(countOdds(arr3))); 
		System.out.println("Evens - " + Arrays.toString(countEvens(arr3))); 
		
	

		
		
		
		
		
		
	}

}
