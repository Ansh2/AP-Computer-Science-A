package Arrays; 

import java.util.Arrays;

public class WarmUp2 {


	
	// This method will return a String array which
	// contains the elements of a supplied array
	// with more than one word.
	// The new array should be no larger than necessary.
	public static String[] moreThanOneWord(String[] a) {
		
		
		int counter = 0; 
		for (int i = 0; i < a.length; i++) {
			if (a[i].contains(" "))  { //if (a[i].indexOf (" ") > -1
				counter++; 
			}
		}
		
		String[] temp = new String[counter]; 
		
		int i = 0; 
		for (int j = 0; i < temp.length; j++) {
			if (a[j].contains(" ")) {
				temp[i++] = a[j]; 
			}
			
		}

		
		//int tempIndex
		//++tempINdex (incrememnes immeidates) 
		//tempIndex (still starts at indesx the index) 
		//	nice trick
		
		
		return temp;
	}

	
	
	
	
	
	public static void main(String[] args) {
		String[] list = { "New Jersey", "Pennsylvania", "New York", "Delaware", "California", "Idaho", "Illinois",
				"New Mexico", "North Carolina", "Florida" };
		String[] b = moreThanOneWord(list);
		System.out.println(Arrays.toString(b));

	}

}



