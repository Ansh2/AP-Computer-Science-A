package TwoDimArray;

import java.util.ArrayList;

/**
 * 2 Dim Array Assessment Complete the following program.
 */
public class Golf {
//Each row stores rounds of golf for a particular player
	public int[][] scores;

	/**
	 * Constructor for objects of class Golf
	 */
	public Golf() {
		int[][] myScores = { { 67, 73, 79 }, { 71, 70, 68 }, { 78, 76, 75 } };

		scores = myScores;
	}

	/**
	 * Constructor for objects of class Golf
	 */
	public Golf(int[][] myScores) {
		scores = myScores;
	}

	/**
	 * displays the scores in columnar form. Golfer # is the header for each column
	 */
	
	
//	

	void displayColumns() {
		System.out.println("SCORES");
		System.out.println("0\t1\t2\t3\t4\t5"); // \t will space to the next tab
		System.out.println("-\t-\t-\t-\t-\t-");

// marker (for formatting)
		
		for (int row = 0; row < scores.length; row++) {
			for (int col = 0; col < scores[0].length; col++) {
				System.out.print(scores[row][col] + "\t");
			}
			System.out.print("\n");
			
		}

		
	}

	/**
	 * returns the total score of a particular player (0 - n)
	 */
	int getScore(int player) {
		
		int sum = 0; 
		for (int row = 0; row < scores[0].length; row++) {
				
			sum += scores[player][row]; 
			
		}

		return sum; 
		
	}

	/**
	 * returns the index # of the winner. That is the golfer with the lowest sum of
	 * the rounds
	 */
	int findWinner() {
		
		
	    int min = getScore(0); 
	    int index = 0; 
		for (int col = 0; col < scores.length; col++) {
			if (getScore(col) < min) {
				min = getScore(col); 
				index = col; 
			}
		}
		
		
		return index;
	}

	/**
	 * returns the average round of all of the golfers
	 *
	 */
	double averageRound() {
		int sum = 0; 
		for (int col = 0; col < scores.length; col++) {
			sum += getScore(col); 
		}
		return sum / ((double) (scores.length * scores[0].length)); 
	}

	public static void main(String args[]) {
		Golf masters = new Golf();
		System.out.println("MASTERS1");
		masters.displayColumns();
		System.out.println();
		System.out.println("Player 2's Score is: " + masters.getScore(2));
		System.out.println("Player " + masters.findWinner() + " is the winner");
		System.out.println("The average score for all of the rounds is : " + masters.averageRound());

		System.out.println();
		System.out.println("MASTERS2");
		int[][] scores2 = { { 73, 72, 71, 70 }, { 67, 76, 67, 74 }, { 72, 70, 74, 70 }, { 72, 72, 72, 72 },
				{ 71, 67, 70, 78 }, { 68, 70, 72, 77 } };
		Golf masters2 = new Golf(scores2);
		masters2.displayColumns();
		System.out.println();
		System.out.println("Player 3's Score is: " + masters2.getScore(3));
		System.out.println("Player " + masters2.findWinner() + " is the winner");
		System.out.println("The average score for all of the rounds is : " + masters2.averageRound());

	}

}