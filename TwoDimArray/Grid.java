package TwoDimArray;

import java.util.Random;

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals) {
		//randomly select indices within the string vals array 
		Random rand = new Random(); 
		grid = new String[rows][cols]; 
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				grid[row][col] = vals[rand.nextInt(vals.length)];
			}
		}	
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		String max = vals[0]; 
		int count = countVals(vals[0]); 
		for (int i = 0; i < vals.length; i++) {
			if (countVals(vals[i]) > count) { 
				count = countVals(vals[i]); 
				max = vals[i]; 
			}
		}
		
		return max;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val ) 
	{
		int count = 0; 
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[0].length; col++) {
				if (grid[row][col].equals(val)) {
					count++; 
				}
			}
		}
		return count;
	}

	
	public void mostSurrounded() {
		int greatestSum = 0; 
		int greatestRow = 0; 
		int greatestCol = 0; 
		String val = grid[0][0]; 
		int sum = 0;
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[0].length; col++) {
				sum = helperCheckNeighbors(row, col); 
				if (sum > greatestSum) {
					greatestSum = sum; 
					greatestRow = row; 
					greatestCol = col; 
					val = grid[row][col]; 
				} 
				sum = 0; 
			}
		}

		System.out.println("The value \"" + val + "\" at position ["
				+ (greatestRow + 1) + "][" 
				+ (greatestCol + 1) + "] has the greatest number of like neighbors - " + greatestSum);	
	}
	
	
	public int helperCheckNeighbors(int row, int col) {
		int sum = 0; 
		for (int r = row -1; r <= row + 1; r++) {
			for (int c = col -1; c <= col + 1; c++) {
				if (!(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length)) {
					if (grid[row][col].equals(grid[r][c])) {
							sum++; 
					}
				}
			}
		}
		return sum - 1; 
		
	}
	  
	
	
	//display the grid
	public String toString()
	{
		String output = "";
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[0].length; col++) {
				output += (grid[row][col] + " "); 
			}
			output += "\n"; 
		}
		
		
		return output;
	}
}
