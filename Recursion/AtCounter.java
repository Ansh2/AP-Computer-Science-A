package Recursion;
import static java.lang.System.*;

import java.util.Arrays;

public class AtCounter {
	private String[][] atMat;
	
	private int count; 

	public AtCounter(int[][] x) {
		int greatest = 0;

		for (int row = 0; row < x.length; row++) {
			for (int col = 0; col < x[0].length; col++) {
				if (x[row][col] > greatest) {
					greatest = x[row][col];
				}
			}
		}

		atMat = new String[greatest][greatest];
		int rand = 0;
		for (int row = 0; row < atMat.length; row++) {
			for (int col = 0; col < atMat[0].length; col++) {
				rand = (int) ((2 * Math.random()) + 1);
				if (rand == 1) {
					atMat[row][col] = "@";
				} else if (rand == 2) {
					atMat[row][col] = "-";
				}
			}
		}
		count = 0; 
		// size the matrix
		// use nested loops to randomly load the matrix
		// you will need to use Math.random()
	}

	public int countAts(int r, int c) {
		if (r < atMat.length && c < atMat[0].length && atMat[r][c].equals("@")) {
			atMat[r][c] = "@1";
			count();
			if (r < atMat.length) {
				return countAts(r + 1, c); 
			}
			if (c < atMat[0].length) {
				return countAts(r, c + 1);
			}
			if (r > 0) {
				return countAts(r -1, c); 
			}
			if (c > 0) {
				return countAts(r, c-1); 
			}
//			return countAts(r + 1, c) + countAts(r, c + 1) +  countAts(r -1, c) + countAts(r, c-1); 
		}
		return count;
		// add in recursive code to count up the # of @s connected
		// start checking at spot [r,c]
		
	}
	public void count() {
		count++; 
	}

	/*
	 * this method will return all values in the matrix this method should return a
	 * view of the matrix that looks like a matrix
	 */
	public String toString() {
		return Arrays.deepToString(atMat);
	}
}