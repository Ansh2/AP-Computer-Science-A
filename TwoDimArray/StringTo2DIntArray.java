package TwoDimArray;

import java.util.Arrays;

public class StringTo2DIntArray {

	// #1 - splitter to Array of Strings(takes String object)
	public static String[] splitIt(String word){
		String[] temp = word.split(" "); //this is how you split a word into an array
		return temp;
	}
	
	
	// #2 - Method takes an array of Strings and converts
	//      to array of ints(takes String[] parameter)
	public static int[] stringToInt(String[] arr) {
		
		int[] temp = new int[arr.length];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = Integer.parseInt(arr[i]); 
		}
		return temp; 
		

		
	}
	// #3 Method takes oneD int array and uses it to 
	//    to populate a twoD int array(takes row, col, int[])
	// ** If the oneD array has fewer elements, stop populating
	//    the twoD array when the oneD runs out.
	//    If the oneD array has more elements than the twoD,
	//    then stop populating when the twoD is full
	public static int[][] oneToTwo(int r, int c, int[] arr) {
		int[][] temp = new int[r][c];
		int counter = 0;
		int i = 0; 
		for (int row = 0; row < temp.length; row++) {
			for (int col = 0; col < temp[0].length; col++) {
				if (i == arr.length || i == temp.length * temp[0].length) 
					break; 
				
				temp[row][col] = arr[counter++]; 
				i++; 
			}
		}
		return temp; 
		
	}
	
	// #4 - Extension: In the example below, the process
	//      required three method calls:
	//      	1. splitIt(numList)
	//			2. stringToInt(one)
	//			3. oneToTwo(3, 4, two)
	//   	Is it possible to change the implementation
	//  	above so that only one method call is needed?
	//  	If so, then do it.  If not, explain why not.'
	
	public static int[][] combine(int r, int c, String word) {
		int[] arr = stringToInt(splitIt(word));
		int[][] temp = new int[r][c];
		int counter = 0;
		int i = 0; 
		for (int row = 0; row < temp.length; row++) {
			for (int col = 0; col < temp[0].length; col++) {
				if (i == arr.length || i == temp.length * temp[0].length) 
					break; 
				
				temp[row][col] = arr[counter++]; 
				i++; 
			}
		}
		return temp; 
	}
	
	
	
	/*You cannot change the implementation so that you call all three of theses methods into one because sicne each 
	one of the methods has a different return type, you cannot do such a thing; however, if you want that to act as a void 
	method and then you just call that method, that is viable. 
	*/
	
	
	public static void main(String[] args) {
//		String numList = "2 5 8 5 3 78 9 -1 3 6 9 0"; //When you read from a file, you normally read from a file. 
//		int[][] x = combine(numList); 
//		System.out.println(Arrays.deepToString(x));
		
//		String numList = "2 5 8 5 3 78 9 -1 3 6 9 0"; //When you read from a file, you normally read from a file. 
//		String[] one = splitIt(numList);
//		System.out.println(Arrays.toString(one) + "\n");
//		// be careful, this is still an array of Strings
//		
//		int[] two = stringToInt(one);
//		System.out.println(Arrays.toString(two)+ "\n");
//		 they look the same, but this is an array of ints
		
//		int[][] three = oneToTwo(3, 4, two);
//		int[][] four = oneToTwo(4, 4, two);
//		int[][] five = oneToTwo(3, 2, two);
//		System.out.println(Arrays.deepToString(three));
//		System.out.println(Arrays.deepToString(four));
//		System.out.println(Arrays.deepToString(five));


	}

}

//[2, 5, 8, 5, 3, 78, 9, -1, 3, 6, 9, 0]
//
//[2, 5, 8, 5, 3, 78, 9, -1, 3, 6, 9, 0]
//
//[[2, 5, 8, 5], [3, 78, 9, -1], [3, 6, 9, 0]]
//[[2, 5, 8, 5], [3, 78, 9, -1], [3, 6, 9, 0], [0, 0, 0, 0]]
//[[2, 5], [8, 5], [3, 78]]