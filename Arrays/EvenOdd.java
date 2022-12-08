package Arrays;

import java.util.Scanner;

public class EvenOdd {
	
	private static int[] bowl; 
	
	
	
	public static boolean doesContainEven() {
	
		for (int i = 0; i < bowl.length; i++) {
			if (bowl[i] %2 == 0) {
				return true; 
			}
		}
		return false; 
		
	}
	
	public static boolean doesContainOdd() {
		
		for (int i = 0; i < bowl.length; i++) {
			if (bowl[i] % 2 == 0) {
				return true; 
			}
		}
		return false; 
		
	}
	
	public static void delete(int index) { // mutator
		
		int eindex = -1; 
		
		
		
		for (int i = 0; i < bowl.length; i++) {
			if (bowl[i] == index) {
				eindex = i; 
			}
		}
				
		
		for (int i = eindex; i < bowl.length - 1; i++) { //overwriting the values to shift them 
			bowl[i] = bowl[i + 1]; 
		}
		int[] arr = new int[bowl.length - 1]; 
		
		
		for (int i = 0; i < arr.length; i ++) {
			arr[i] = bowl[i]; 
		}
		
		bowl = arr; 
		
	}

	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		int N = scan.nextInt(); 
		
		bowl = new int[N]; 
		 
		int group = 0; 
		
		for (int k = 0; k < N; k ++) {
			bowl[k] = scan.nextInt(); 	
		}
		
		int i = 0; 
		
		while (bowl.length > 0) { 
			
			
			if (group % 2 == 0) { //even
				
				if (doesContainEven() == true) {
					for (int k = 0; k < bowl.length; k++) {
						if (bowl[k] % 2 == 0) {
//							delete(bowl[k]); 
							int temp = bowl[group -1];
							bowl[group - 1] = bowl[k]; 
							bowl[k] = temp; 
							group++; 
						}
					}
				
				} else {
									
					int sum = bowl[i] + bowl[i + 1]; 
					
					if (sum % 2 == 0) {
						group++; 
						i = i+2; 
											
					} else {
						int sum2 = bowl[i] + bowl[i + 1]; 
						while (true) {
							if (sum2 % 2 == 0) {
								group++;
								i+=2; 
								break;
							}
							i++; 
							sum2 += bowl[i + 1]; 
							
						}
					
					
					
					
				}
					
				
				}
				
				
			} else {
				
				if (doesContainOdd() == true) {
					
					for (int k = 0; k < bowl.length; k++) {
						if (bowl[k] % 2 == 1) {
//							delete(bowl[k]); 
							int temp = bowl[group -1];
							bowl[group - 1] = bowl[k]; 
							bowl[k] = temp; 
							group++; 
						}
					}
					
				} else {
					
					
					int sum = bowl[i] + bowl[i + 1]; 
					
					
					if (sum % 2 == 1) {
						group++; 
						i = i+2; 
						delete(bowl[i]);
						delete(bowl[i + 1]); 
						
						
					} else {
						
						
						int sum2 = bowl[i] + bowl[i + 1]; 
						
						delete(bowl[i]);
						delete(bowl[i + 1]); 
						
						while (true) {
							sum2 += bowl[i];
							if (sum2 % 2 == 1) {
								group++;
								i+=2; 
								break;
							}
							i++; 
							sum2 += bowl[i + 1]; 
						}
						
						
					}
					
					
					
					
					
					
				}
				
			}
			
			
		
			
		}
		
		
		
	}

}
