package ArrayList;

import java.util.Arrays;


public class TakeFour {

	public static void takeFour(int[] a) {
		int[] copy = new int[a.length]; 
		for (int i = 0; i < a.length; i ++) {
			copy[i] = a[(i + 1) % a.length] + a[(i + 2) % a.length] + a[(i + 3) % a.length] + a[(i + 4) % a.length];
         }
		
		for (int i = 0; i < copy.length; i ++) 
			a[i] = copy[i];
		
		
		

	}
	public static void main(String[] args) {
		int[] arr = {2, 5, 1, 7, 3, 9, 6, 9, 4, 8, 11, 0, 13, 8, 9, 1, 7, 5, 2, 6};
		System.out.println(Arrays.toString(arr));
		takeFour(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}