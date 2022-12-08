package TwoDimArray;
import java.util.*; 

public class TwoDimMethods {
	
	private int[][] numbers; 
	
	public TwoDimMethods() {
		numbers = new int[][] { {1, 2}, {3, 4}, {5, 6}, {7, 8} }; //you are not allowed to drop the new int[][] in multidimensional arrays
	}
	
	public TwoDimMethods(int[][] arr) { //the references to objects hold are MEMORY ADRESSES 
		numbers = arr; 
	}
	
	
	public TwoDimMethods(int r, int c) {
		numbers = new int[r][c]; 
		//use a helper method to fill in random numbers
		//NOTES 
		this.randomizer(); 
	}

	//helper method to fill randoms 
	//you are going to overwrite the values through this method
	public void randomizer() {
		Random gen = new Random(); 
		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[0].length; col++) {
				numbers[row][col] = gen.nextInt(90) + 10; //non-inclusive for the first number 0 - 89 then from + 10 it becomes 10 - 99
			}
		}
	}
		
	
	public String toString() {
		String accumulator = ""; 
		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[0].length; col++) {
				accumulator += numbers[row][col] + " ";
				
			}
			accumulator += "\n"; 
		}
		return accumulator; 
	}
		
	public void displaySideways() {
		//Output:
		//1 3 5
		//2 4 6
		
		for (int col = 0; col < numbers[0].length; col++) {
			for (int row = 0; row < numbers.length; row++) {
				System.out.print(numbers[row][col]  + " ");	
			}
			System.out.print("\n");
		}
		
	}
	public int maximum() {
		int maximum = numbers[0][0]; 
		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[0].length; col++) {
				 maximum = Math.max(maximum, numbers[row][col]); 
			}
			
		}
		return maximum; 
		
	}
	public double average() {
		int sum = 0; 
		int count = 0;  //this would be a nice way to account for a jagged array (array that is not rectangular)
		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[0].length; col++) {
				sum += numbers[row][col]; 
			}
		}
		return sum / (double) (numbers.length * numbers[0].length); 
	}
	
	public long diagonal() {
		long sum = 1; 
		for (int i = 0; i < numbers.length; i++) {
			sum *= numbers[i][i]; 
		}
		return sum; 
	
	}
	
	
	public long skew() {
		long product = 1; 
		for (int i = 0; i < numbers.length; i++) {
			product *= numbers[i][numbers.length - i - 1]; //construct for going backwards 
		}
		return product; 
	}
	
	public int[][] quarter() {
		int[][] copy = new int[numbers.length / 2][numbers[0].length / 2]; 
//		int[][] copy = new int[10][5]; 
		int k = 0; 
		int f = 0; 
		for (int row = copy.length; row < numbers.length; row++) {
			for (int col = 0; col < numbers[0].length; col++) {
				if (col >= 5) {
					copy[k][f] = numbers[row][col]; 
					f++; 
				}			
			}
			k++;
			f = 0; 
		} 
		return copy; 
		
	}
	
	
	public static void main(String [] args) {
		TwoDimMethods one = new TwoDimMethods(7, 7); 
//		System.out.println(one);
		System.out.println(one.diagonal());
		System.out.println(one.skew());
//		one.displaySideways();
//		System.out.println(one.maximum());
//		System.out.println(one.average());
		
		TwoDimMethods two = new TwoDimMethods(20, 10);
		System.out.println(two); 
		int[][] x = two.quarter();
		TwoDimMethods three = new TwoDimMethods(two.quarter()); 
		System.out.println(three);
//		one.display(); 
		//longs are bigger than ints 
		//do not use a nested for loop as you have to go 0, 0 ; 1, 1 ; 2, 2, ; 3, 3
		
	}

}
