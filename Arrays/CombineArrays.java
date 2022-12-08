package Arrays;


public class CombineArrays {
	// displays the array
	public static void display(int[] a) {

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}

	}

	// returns a new array where b is appended to the end of a
	public static int[] append(int[] a, int[] b) {

		int[] temp = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			temp[i] = a[i];
		}

		int j = 0;

		for (int i = a.length; i < temp.length; i++) {
			temp[i] = b[j];
			j++;
		}

		return temp;
	}

	// returns a new array with alternating values from a and b
	// (question: does it matter if the arrays have different lengths?
	public static int[] alternate(int[] a, int[] b) {

		int[] temp = new int[a.length + b.length];

		int x = 0;

		int y = 0;

		int count = 0;

		for (int i = 0; i < temp.length; i++) {
			if (count % 2 == 1) {
				temp[i] = b[y];
				y++;
			}

			if (x >= a.length) {
				int j = a.length;
				for (int k = a.length * 2; k < temp.length; k++) {
					temp[k] = b[j];
					j++;
				}
				break;
			}

			if (count % 2 == 0) {
				temp[i] = a[x];
				x++;
			}

			if (y >= b.length) {
				int j = b.length;
				for (int k = b.length * 2; k < temp.length; k++) {
					temp[k] = a[j];
					j++;
				}
				break;

			}

			count++;
		}
		return temp;
	}

	

	// returns a new ordered array
	// prerequisite a and b must be ordered
	// (and NO, you may NOT just append the arrays and then sort – individual
	// elements must be compared between the arrays to see what to add next)
	public static int[] merge(int[] a, int[] b) {

		int[] temp = new int[a.length + b.length];

		int x = 0;
		int y = 0;
		int z = 0;
		

		while (z < temp.length) {
			
			if (x < a.length) {
				if ((a[x] < b[y])) {
					temp[z] = a[x];
					z++;
					x++;
				}
			}

			
			if (x >= a.length) {
				while (y < b.length) {
					temp[z] = b[y]; 
					y++; 
					z++;
				}
				break; 
			} 
			
			
		
			if (y < b.length) {
				if (a[x] > b[y]) {
					temp[z] = b[y];
					z++;
					y++;
				}
			}
				
			
		
		
			if (y >= b.length) {								
				while (x < a.length) {
					temp[z] = a[x]; 
					x++;
					z++; 
				}
				
				break; 

			} 
			
			

		} 

		return temp;

	}

	public static void main(String[] args) {
		int[] a = {1,4,9,16,25,36,49,64,81,100}; //b
		int[] b = {3,10,11,12,21,26}; //a

//		int[] a = { 0, 2, 10 }; //b
//		int[] b = { 1, 3, 5, 9, 11 }; //a
		// 0 1 2 3 5 9 10 11
		// 0 1 2 3 4 5 6  7 

//		System.out.println("APPEND") ;
//		display(append(a,b));
//		System.out.println() ;
//		System.out.println("ALTERNATE");
//		display(alternate(a, b));
//		System.out.println() ;
//		System.out.println("MERGE") ;
//		display(merge(a,b));
	}
}