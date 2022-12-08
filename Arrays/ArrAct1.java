package Arrays;


import java.util.Random;
import java.util.Arrays; 

public class ArrAct1 {
	private int[] numbArray;

// 1. Constructs a default array of size 10
	public ArrAct1() {
		numbArray = new int[10];
		numbArray[0] = 1;
		numbArray[1] = 3;
		numbArray[2] = 7;
		numbArray[3] = 19;
		numbArray[4] = 15;
		numbArray[5] = 19;
		numbArray[6] = 7;
		numbArray[7] = 3;
		numbArray[8] = 19;
		numbArray[9] = 48;
	}

// 2. Constructs an array of random numbers (0-24) array of size count
	public ArrAct1(int count) {
		Random gen = new Random();
		numbArray = new int[count];
		for (int i = 0; i < numbArray.length; i++) {
			int randomdigit = gen.nextInt(25);
			numbArray[i] = randomdigit;
		}

	}

// 3. This method prints all of the elements of the array in list form
	public void display() {

		for (int i = 0; i < numbArray.length; i++) {
			System.out.println(numbArray[i]);
		}

	}

// 4. This method prints all of the elements in reverse order
	public void displayReverse() {

		for (int i = numbArray.length - 1; i >= 0; i--) {
			System.out.println(numbArray[i]);
		}

	}

// 5. This method calculates and returns the average of all of the elements
// The average of the default array is 14.1
	public double average() {

		double sum = 0;

		for (int i = 0; i < numbArray.length; i++) {
			sum += numbArray[i];
		}

		double avg = sum / numbArray.length;
		return avg;

	}

// 6. This method returns the maximum value of all of the elements
// The max of the default array is 48.
	public int findMax() {
		int max = 0;
		for (int i = 0; i < numbArray.length; i++) {
			if (numbArray[i] > max) {
				max = numbArray[i];
			}
		}
		return max;

	}

// 7. This method returns the index number of the first instance of int lookFor
// returns -1 if not in the list
// ex. Using the default array findIndex(15) will return 4
	public int linearSearch(int lookFor) {

		int index = -1;

		for (int i = 0; i < numbArray.length; i++) {
			if (numbArray[i] == lookFor) {
				return i;
			}
		}
		return index;

	}

	/**
	 * 8. This method will print the elements and the tally. The list with the
	 * default constructor will be Number Frequency 1 1 3 2 7 2 15 1 19 3 48 1
	 */
	public void tallyList() {
		
		
		int[] frequency = new int[numbArray.length]; 	
		System.out.println("Number Frequency");
		

		
		int greatest = 0; 
		for (int i = 0; i < numbArray.length; i++) {
			if (greatest < numbArray[i]) {
				greatest = numbArray[i]; 
			}
		}
		greatest += 1; 
		
		int[] number = new int[greatest]; 
		
		for (int i = 0; i < number.length; i ++) {
			number[i] = i; 
		}
		
		
		int freq = 0; 
		for (int i = 0; i < frequency.length; i++) {
			for (int j = 0; j < frequency.length; j++) {
				if (numbArray[i] == numbArray[j]) { 
					freq++;
				}
				
			}
			frequency[i] = freq; 
			freq = 0; 
		}
		
		
		int frequenc = 0; 
		for (int i = 0; i < greatest; i++) {
			for (int j = 0; j < numbArray.length; j++) {
				if ((number[i] == numbArray[j])) {
					frequenc++;   
					
				  
				}
				
			}
			if (frequenc > 0) {
				System.out.println(number[i] + "\t" + frequenc);
				frequenc = 0; 
			}
		}
		
		
		
	}

	/**
	 * 9. This method will print a column of numbers in the original order, a column
	 * of numbers in reverse order, and the average of the two. default constructor
	 * will be LIST REVERSE AVERAGE 1 48 24.5 3 19 11.0 3 19 11.0 7 19 13.0 7 15
	 * 11.0 15 7 11.0 19 7 13.0 19 3 11.0 19 3 11.0 48 1 24.5
	 */
	public void listReverseAvg() {
		
		int[] array = numbArray; 
		
		
		Arrays.sort(array); 
		
		System.out.println("LIST\tREVERSE\tAVERAGE");
		
		int n = array.length - 1; 
		for (int i = 0; i <  array.length; i++ ) {
			System.out.println("\t" + array[i] + "\t" + array[n] + "\t" + ((array[i] + array[n]) /2.0));
			n--; 
		}
		
		
		
		
		
		

	}

// 10. This method will sort the array in ascending order
//
	public void sort() { // Do not do
		
	
		
		int n = numbArray.length; 
		
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < n - 1; j++) {
				if (numbArray[j] > numbArray[j + 1]) {
					//if in wrong order, sawmp 'em
					//swap algorith; temp = a, a = b, b = temp
					int temp = numbArray[j]; 
					numbArray[j] = numbArray[j + 1]; 
					numbArray[j+1] = temp; 
	
				}
				n--; 
			}
			
			
			
		}
		
		
	
	}
	
	
//	
//	public static int[] bubbleSort(int[] arr) {
//		
//		
//		int n = arr.length; 
//		
//		for (int i = 0; i < n; i ++) {
//			for (int j = 0; j < n - 1; j++) {
//				if (arr[j] > arr[j + 1]) {
//					//if in wrong order, sawmp 'em
//					//swap algorith; temp = a, a = b, b = temp
//					int temp = arr[j]; 
//					arr[j] = arr[j + 1]; 
//					arr[j+1] = temp; 
//	
//				}
//				n--; 
//			}
//			
//			
//			
//		}
//			
//		return arr;
//		
//	}
	

// 11. Binary Search.
// This method returns the index number of the first instance of int lookFor and
// returns -1 if not in the list. The Array must be sorted to use the Binary search.
// ex. Using the default array findIndex(15) will return 4
	public int binarySearch(int lookFor) {

	
		
		int bottom = 0, top = numbArray.length -1; 
		 
		while (bottom <= top) {
			int middle = bottom + (top - bottom)/2; 
			if (lookFor == numbArray[middle]) {
				return middle; 
			} if (lookFor < numbArray[middle]) {
				top = middle -1; 
			} else {
				bottom = middle +1; 
			}
		}
	
		
		return -1; 
		
		
		
		
		
	}
	
	
	
//	public static int BINARY(int[] arr, int val) {
//		int bottom = 0, top = arr.length -1; 
//		 
//		while (bottom <= top) {
//			int middle = bottom + (top - bottom)/2; 
//			if (val == arr[middle]) {
//				return middle; 
//			} if (val < arr[middle]) {
//				top = middle -1; 
//			} else {
//				bottom = middle +1; 
//			}
//		}
//	
//		
//		return -1; 
//		
//	}
	
	
	// 12. Write a tester that will create a random array of size 50
	// and test all of these methods **it is the main method**
	

	public static void main(String[] args) {
//		
//		ArrAct1 one = new ArrAct1();
		ArrAct1 two = new ArrAct1(50);
				 
		
		two.display(); 
		two.display(); 
		two.displayReverse(); 
		System.out.println(two.average()); 
		System.out.println(two.findMax()); 
		System.out.println(two.linearSearch(15)); 
		two.tallyList(); 
		two.listReverseAvg(); 
		two.sort(); 
		System.out.println(two.binarySearch(15));
		
		
//		Random r = new Random();
//
//		int[] arr = new int[50];
//
//		for (int i = 0; i < arr.length; i++) {
//		arr[i] = r.nextInt();
//		}
//
//
//		ArrAct1 twelve = new ArrAct1N(50);
//		twelve.display();
//		twelve.displayReverse();
//		System.out.println(twelve.average());
//		System.out.println(twelve.findMax());
//		System.out.println(twelve.linearSearch(10));
//		twelve.tallyList();
//		twelve.listReverseAvg();
//		twelve.sort();
//		twelve.binarySearch(2);
		
		
		
//		ArrAct1 one = new ArrAct1();
//		ArrAct1 two = new ArrAct1(10);
		
//		System.out.println("Searing.. 15 is at index: " + two.binarySearch());

//		one.display(); 
//		two.display(); 
//		one.displayReverse(); 
//		System.out.println(one.average()); 
//		System.out.println(one.findMax()); 
//		System.out.println(one.linearSearch(15)); 
//		one.tallyList(); 
//		one.listReverseAvg(); 
//		one.sort(); 
//		System.out.println(one.binarySearch(15));
		
		

		


	}

}