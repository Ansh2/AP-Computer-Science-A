package TwoDimArray;

import java.util.Arrays;

public class TicTacToe { 
	private String[][] board; 
	
	public TicTacToe() {
		board = new String[5][2]; 
//		board[0][0] = "X"; 
//		board[0][1] = "O"; 
//		board[0][2] = "X"; 
//		board[1][0] = " "; 
//		board[1][1] = " "; 
//		board[1][2] = " "; 
//		board[2][0] = " "; 
//		board[2][1] = "X"; 
//		board[2][2] = "O";
		
		board[0][0] = "A"; 
		board[0][1] = "N"; 
		board[1][0] = "S"; 
		board[1][1] = "H"; 
		board[2][0] = "T"; 
		board[2][1] = "A"; 
		board[3][0] = "N"; 
		board[3][1] = "D"; 
		board[4][0] = "O"; 
		board[4][1] = "N";
		
	}
	
//	public TicTacToe(String input) {
//		board = new String[3][3]; 
//		int i = 0; 
//		for (int row = 0; row < board.length; row++) {
//			for (int col = 0; col < board[0].length; col++) {
//				board[row][col] = input.substring(i, i + 1); 
//				i++; 
//			}
//			
//		}
//	}
	public TicTacToe(String input, int r, int c) {
		board = new String[r][c]; 
		int i = 0; 
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				if (i < input.length()) {
					board[row][col] = input.substring(i, i + 1); 
					i++; 
				} else {
					board[row][col] = ""; 
				}
			}
			
		}
		
	}
	public TicTacToe(String input) {
//		int c = 4;
//		int r = 0; 
//		if (input.length() % 4 == 0) {
//			r = (int) (input.length() / 4.0 + 0.5);
//		} else {
//			r = (int) (input.length() / 4.0 + 1.5);
//		}
		
		int r = 1; 
		int c = 1; 
		int counter = 0; 
		for (int i = 0; i < input.length(); i++) {
			if (r * c >= input.length()) {
				break; 
			} else if (counter % 2 == 0) {
				r++; 
			} else if (counter % 2 == 1) {
				c++; 
			}
			counter++; 
		}
		
		//The teacher's solution 
		//BREAK STATEMENTS DO WORK ON FOR LOOPS!!! THey work on both for and while loops 
		
//		int r = 0; 
//		int c = 0; 
//		
//		boolean enough = false; 
//		while (!enough) {
//			c++; 
//			if (r * c >= input.length() ) {
//				enough = true; 
//				break; 
//			}
//			r++; 
//			if (r * c >= input.length() ) {
//				enough = true; 
//				break; 
//			}
//		}
		
		board = new String[r][c];
		int i = 0;
		for (int row = 0; row < board.length; row++) {
			for (int column = 0; column < board[0].length; column++) {
				if (i < input.length()) {
					board[row][column] = input.substring(i, i + 1);
					i++;
				} else {
					board[row][column] = "*";
				}
			}
		}

	}



	
	public String toString() {
		String accumulator = ""; 
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				accumulator += board[row][col] + " ";
				
			}
			accumulator += "\n"; 
		}
		return accumulator; 
	}
	
	public static void main(String[] args) {
		TicTacToe one = new TicTacToe(); 
//		System.out.println(Arrays.toString(one.board)); //doesn't work because it only works for one dimesnional method
//		System.out.println(Arrays.deepToString(one.board)); //THIS IS THE ONLY THING THAT WILL WORK FOR THE TWO DIMENSIONAL ARRAYS
		TicTacToe two = new TicTacToe("HENRY ZHENG");
		System.out.println(two);
		
		TicTacToe three = new TicTacToe("Henry Zheng", 3, 4);  
		System.out.println(three);
	
	}

}
