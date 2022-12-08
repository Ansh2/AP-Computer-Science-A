package TwoDimArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a description of class test here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Magic {

	// no instance variables or constructors needed
	// all methods are static

	/**
	 * Precondition: square is an initialized matrix, MAX rows x MAX columns 0 <=
	 * row < MAX Postcondition: returns the sum of the values in row
	 */
	public static int sumRow(int[][] square, int row) {
		int sum = 0;
		for (int r = 0; r < square.length; r++) {
			if (r == row) {
				for (int col = 0; col < square[0].length; col++) {
					sum += square[row][col];
				}
			}
		}
		return sum;

	}
	public static int sumCol(int[][] square, int col) {
		int sum = 0; 
		for (int c = 0; c < square[0].length; c++) {
			if (c == col) {
				for (int row = 0; row < square.length; row++) {
					sum += square[row][col]; 
				}
			}
		}
		return sum; 
	}
	
	public static int sumDiagNegSlope(int[][] square) {
		int sum = 0; 
		for (int i = 0; i < square.length; i++) {
			sum += square[i][i]; 
		}
		return sum; 
	}
	
	public static int sumDiagPosSlope(int[][] square) {
		int sum = 0; 
		int r = 0; 
		for (int i = 0; i < square.length; i++)  //learn this structure from going forward //they may ask you to go up to down. 
			//the number going down should be based on the number going up (NEED TO LEARN THIS ALGORITHM)
			sum += square[i][square.length - 1 - i];
		
		return sum; 
		 
	}
	public static void printTable(int [][] square) {
		for (int row = 0; row < square.length; row++) {
			for (int col = 0; col < square[0].length; col++) {
				System.out.print(square[row][col] + " ");
				
			}
			System.out.print("\n");
		}
	}

	/**
	 * Precondition: square is initialized with integers. Action: Inspects every
	 * value in square, checking that each one is a unique integer ranging from
	 * 1..MAX*MAX Postcondition: Returns true if each value is unique from
	 * 1..MAX*MAX, otherwise returns false
	 */
	boolean unique(int[][] square) {
		for (int i = 0; i < square.length * square.length; i++) {
			
			int counter = 0; 
			
			for (int row = 0; row < square.length; row++) {
				for (int col = 0; col < square[0].length; col++) {
					if (square[row][col] < 1 || square[row][col] > (square.length * square[0].length)) {
						return false;
					}
					if (square[row][col] == i) {
						counter++; 
					}
				}
			}
			if (counter > 1) {
				return false; 
			}
		}
		return true;

	}

	/**
	 * Precondition: square is initialized with integers. Action: Checks that row,
	 * col, and diagonal sums are equal and elements are unique Postcondition:
	 * Returns true if magic else return false.
	 */
	public boolean testMagic(int[][] square) {
		if (!unique(square)) 
			return false; 
		
		if (!(sumDiagNegSlope(square) == sumDiagPosSlope(square)))
			return false;
		

		for (int row = 0; row < square.length; row++) {
			for (int i = 0; i < square.length; i++) {
				if (!(sumRow(square, row) == sumRow(square, i)))  
					return false; 
					
			}
			
		}
		
		for (int col = 0; col < square[0].length; col++) {
			for (int i = 0; i < square[0].length; i++) {
				if (!(sumCol(square, col) == sumCol(square, i))) 
					return false; 
			}
			
		}
		return true; 
		
	}

//Add methods to sumCol, SumDiag, and print the arrays in matrix format. 

	public static void main(String[] args) {

		Magic x = new Magic();

		int[][] one = { { 13, 3, 2, 16 }, { 8, 10, 11, 5 }, { 12, 6, 7, 9 }, { 1, 15, 14, 4 } };

		int[][] two = { { 1, 14, 8, 11 }, { 15, 4, 10, 5 }, { 12, 7, 13, 2 }, { 6, 9, 3, 16 } };

		int[][] three = { { 8, 11, 14, 1 }, { 13, 2, 7, 12 }, { 3, 16, 9, 6 }, { 10, 5, 4, 15 } };

		int[][] four = { { 16, 2, 5, 11 }, { 3, 4, 10, 8 }, { 9, 7, 3, 14 }, { 6, 12, 15, 1 } };

		int[][] five = { { 4, 9, 15, 16 }, { 15, 6, 10, 3 }, { 14, 7, 11, 2 }, { 1, 12, 8, 13 } };

		int[][] six = { { 1, 2, 3, 4 }, { 2, 3, 4, 1 }, { 3, 4, 1, 2 }, { 4, 1, 2, 3 } };

		printTable(one);
		System.out.println("MAGIC SQUARE? " + x.testMagic(one));
		System.out.println();
		printTable(two);
		System.out.println("MAGIC SQUARE? " + x.testMagic(two));
		System.out.println();
		printTable(three);
		System.out.println("MAGIC SQUARE? " + x.testMagic(three));
		System.out.println();
		printTable(four);
		System.out.println("MAGIC SQUARE? " + x.testMagic(four));
		System.out.println();

		printTable(five);
		System.out.println("MAGIC SQUARE? " + x.testMagic(five));
		System.out.println();
		printTable(six);
		System.out.println("MAGIC SQUARE? " + x.testMagic(six));

	}

}