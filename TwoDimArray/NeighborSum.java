package TwoDimArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import java.util.*;
import java.io.*;

public class NeighborSum {

	private int[][] chart = { 
			{ 1, 2, 3, 4, 5 }, 
			{ 6, 7, 8, 9, 0 }, 
			{ 6, 7, 1, 2, 5 }, 
			{ 6, 7, 8, 9, 0 },
			{ 5, 4, 3, 2, 1 }, 
			{ 0, 0, 0, 0, 0 } };


	private int sum(int r, int c) {
		//0, 0 
	
		
		int sum = 0; 
		//Better algorithm (without hardcoding) Include restrictions
		
		for (int row = r - 1; row <= r + 1; row++) {
			for (int col = c - 1; col <= c + 1; col++) {
				if (!(row == r && col == c)) {
					if (!(row < 0 || col < 0 || row >= chart.length || col >= chart[0].length)) {
						sum += chart[row][col]; 
					}
				}
			}
		}
		
		return sum; 
		
		
	}
	



	public void go() throws Exception {
		Scanner file = new Scanner(new File("NeighborSumChart.dat"));
		System.out.println("Matrix values");
		for (int row = 0; row < chart.length; row++) {
			for (int col = 0; col < chart[0].length; col++) {
				System.out.print(chart[row][col] + "  ");
			}
			System.out.println();
		}
		System.out.println();
		int pairs = file.nextInt();
		for (int i = 0; i < pairs; i++) {
			int r = file.nextInt();
			int c = file.nextInt();
			System.out.println("The sum of " + r + "," + c + " is " + sum(r, c));
		}
	}

	public static void main(String[] args) throws Exception {
		
		NeighborSum x = new NeighborSum();
		x.go();
	}
}
