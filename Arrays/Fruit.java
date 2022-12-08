package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Fruit {
	
	private String[] bowl; 
	
//	String name = new sssssssString("Debbie"); 
//	String name2 = "Debbie"; 
	
	public Fruit() {
		bowl = new String[10]; 
		bowl[0] = "apple"; //memory address is held here
		bowl[1] = "banana"; 
		bowl[2] = "kiwi"; 
		bowl[3] = "lemon"; 
		bowl[4] = "lime"; 
		bowl[5] = "mango"; 
		bowl[6] = "orange"; 
		bowl[7] = "pear"; 
		bowl[8] = "pinapple"; 
		bowl[9] = "plum"; 
		
	}
	
//	public Fruit() { 
//		bowl = new String[]{"apple", "Showrya", "Atharva"}; 
//		
//		
//	}
	
	public Fruit(String[] arr) {
		
		bowl = arr; 
		
	}
	
	public void display() {
		for (int i = 0; i < bowl.length; i++) {
			System.out.println(bowl[i]); 
		}
		
		
	}
	

	// traverse with an iterator and a "for each" loop 
	
	public void displayForEach() {
		for (String x: bowl) {
			System.out.println(x);
		}
	}
	
	public void displayEveryOther() {
		for (int i = 0; i < bowl.length; i +=2 ) {
			System.out.println(bowl[i]);
		}
	}
	
	public void displayReverse() {
		for (int i = bowl.length - 1; i >= 0; i--) {
			System.out.println(bowl[i]);
		}
		
	}
	
	public void displayReverse2() {
		for (int i = 0; i < bowl.length; i++) {
			System.out.println(bowl[bowl.length - 1 - i]);
		}
	}
	
	//use the FindMax Function to find the longest lettered fruit
	public String getLongestFruit() {
//		String finale = "";
//		for (int i = 0; i < bowl.length; i++) 
//			if (bowl[i].length() > finale.length()) 
//				finale = bowl[i]; 
//		return finale; 
		
		
		String longest = ""; 
		for (String x: bowl) {
			if (x.length() > longest.length()) {
				longest = x; 
			}
		}
		
		return longest;
	
	}
	
	public String getMinAlphabetically() {
		
		
		String smallest = bowl[0]; 
		
		for (int i = 1; i < bowl.length; i++) {
			if (bowl[i].compareToIgnoreCase(smallest) < 0) 
				smallest = bowl[i]; 
			
		}
		
		
		
		
		
		return smallest; 
	}
	//print the first letter of each element in the array
	
	public void initials() {
		for (int i = 0; i < bowl.length; i++) {
			System.out.println(bowl[i].substring(0, 1));
		}
		
		
	}
	
	//return the nth element from an array
	
	public String retrieve(int n) {
		
//		if (n <= 0 && n <= bowl.length - 1) {
//			System.out.println("Incorrect nth element");
//		}
////		
		if (n < bowl.length)
			return bowl[n -1]; 
		System.out.println("Not a valid entry");
		return null; 
		
		
//		try {
//			String error = bowl[n -1]; 
//		} catch (IndexOutOfBoundsException e) {
//			e.printStackTrace();
//
//		}
//		return bowl[n -1]; 
	
		
	}
	
	// replace an elemen t in the arryay with a secon element that you supply 
	
	public void replace(String first, String second) {
		//begin by.. traversing the array
		for (int i = 0; i < bowl.length; i++) {
			if (bowl[i].equals(first)) {
				bowl[i] = second; 
			}
		}
		
	}
	
	//create and RETRUN an array of the first n multiples of 7 

	public static int[] multOfSevens(int n) {
		int[] arr = new int[n]; // instansiating a new array object
		
		for (int i = 0; i< arr.length; i++) { //traversing the array 
			arr[i] = (i + 1) * 7; //populating the array (there was a shift adjustment) 
		}
		
		return arr; 
	}
	
	//create and RETURN a String array of the 
	// letters of your last name 

	public static String[] nameArray(String lastname)  {
		

		String[] arr = new String[lastname.length()]; 
		
		for (int i = 0; i < arr.length; i ++) {
			arr[i] = lastname.substring(i, i + 1); 
//			revised = lastname.substring(0, lastname.length() -1); 
		}
		
		return arr; 
		
		
	}
	
	public static String[] delete(String[] arr, String exfriend) {
		
		int exIndex = -1; 
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i].equals(exfriend)) {
				exIndex = i; 
			}
			
		}
		
		for (int i = exIndex; i < arr.length - 1; i++) {  //REVIEW THIS YOU DO - 1 TO REMOVE THE INDEX OUT OF BOUND ERROR 
			arr[i] = arr[i + 1]; 
		}
		
		String[] temp = new String[arr.length - 1]; 
		

		for (int i = 0; i < temp.length; i++) {
			
			temp[i] = arr[i]; 
			
		}
		
		return temp; 
		
	}
	
	public void delete(String fruit) { // mutator
		
		int eindex = -1; 
		
		
		
		for (int i = 0; i < bowl.length; i++) {
			if (bowl[i].equals(fruit)) {
				eindex = i; 
			}
		}
		
		if (eindex == -1) {
			System.out.println("The fruit that you gave does not exist in the list - nothing was deleted");
			return; //this is a way that you can get out of the method immediatly
		}
		
		
		for (int i = eindex; i < bowl.length - 1; i++) { //overwriting the values to shift them 
			bowl[i] = bowl[i + 1]; 
		}
		String[] arr = new String[bowl.length - 1]; 
		
		
		for (int i = 0; i < arr.length; i ++) {
			arr[i] = bowl[i]; 
		}
		
		bowl = arr; 
		
	}
	
	public void addFruit(String fruit) {
		
		String [] temp = new String[bowl.length + 1]; 
		
		int index = -1; 
		
		for (int i = 0; i < bowl.length; i++) {
			if (fruit.compareTo(bowl[i]) < 0) {
				index = i; 
				break; 
			}
		}
		if (index == -1) {
			index = temp.length - 1; 
		}
		for (int i = 0, j = 0; j < bowl.length; i++, j++) {
			temp[i] = bowl[j]; 
		}
		
		for (int i = temp.length - 2; i >= index;  i--) {
			
			temp[i + 1] = temp[i];
			
		}
		
		temp[index] = fruit; 
		
		bowl = temp; 
		
		
		//create a new array one bigger than the existing arrya 
		//find the 'right indext to insert' the other fruit 
		//copy the values individuall from the bowl to the temp array
		//move elements tarting at the bottom of the list until you get downt ot hte 'right index to insert' 
		//insert the "other" fruit into the insert index 
		//point the bowl to the memeory location of the temp array
		
	}
	
	
	
	public static void main(String[] args) {
		
		Fruit one = new Fruit(); 
//		System.out.println(one);
		one.display(); 
		System.out.println();
//		System.out.println();
//		one.displayForEach(); 
//		System.out.println();
//		one.displayEveryOther();
//		System.out.println();
//		one.displayReverse(); 
		
//		System.out.println(one.getLongestFruit());
//		String[] period4 = new String[] {"Showrya", "Elizabeth", "LawnGirl"}; 
//		
//		Fruit two = new Fruit(period4); 
//		System.out.println(one.getMinAlphabetically());
//		
//		one.initials();
//		System.out.println(one.retrieve(55)); 
//		one.replace("lime", "LawnGirl"); 
//		System.out.println(Arrays.toString(multOfSevens(3)));
//		int[] sevens = multOfSevens(3); 
//		System.out.println(Arrays.toString(sevens));
//		
//		System.out.println(Arrays.toString(nameArray("Tandon")));
		
		
//		String[] friends = new String[] {"Andy", "Ludy", "Elizabeth", "Cathernie" }; 
//		System.out.println(Arrays.toString(friends));
//		
//		friends = delete(friends, "Ludi"); 
//		System.out.println(Arrays.toString(friends));
//		//you use Arrays.toString to print 
		
//		one.delete("sadf");
		one.addFruit("aaple");
		one.display(); 

				
		
		
	}

}
