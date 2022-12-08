package Recursion;
import java.util.Random;
import java.util.Scanner;

public class Testing {
	// Best version of code so far

	public static final char CROSS = 'X';
	public static final char CIRCLE = 'O';

	// Need to have multiple methods for organizing the code.

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Welcome to Tic-Tac-Toe!");
		boolean play = true;
		while(play) {
			playGame(console);
			System.out.println("Do you want to play again?");
			String ans = console.next();
			if (!ans.equalsIgnoreCase("yes"))
				play = false;
		}
		System.out.println("Thank you for playing Tic-Tac-Toe with me! Bye for now!");
	}

	public static void playGame(Scanner console) {
		int size = 0;
		System.out.println("Enter size of the game(any positive integer)");
		size = console.nextInt();

		System.out.println("Would you like to go first? (Enter yes or no)");
		String answer = console.next();
		boolean first = !(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("No"));
		if (!(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("No"))) {
			while (first == true) {
				System.out.println("Please enter a correct response");
				answer = console.next();
			}
		}
		char usersymbol = ' ';
		char computersymbol = ' ';
		boolean userplay = false;

		// Define two dimentional char array of the size entered by player
		char[][] board = new char[size][size];
		resetBoard(board, size);
		if (answer.equalsIgnoreCase("Yes")) {
			userplay = true;
			usersymbol = CROSS;
			computersymbol = CIRCLE;
		} else {
			userplay = false;
			usersymbol = CIRCLE;
			computersymbol = CROSS;
		}
		System.out.println("Then you will become " + usersymbol + " and the computer will become " + computersymbol);
		while(!isGameDone(board)) {
			if(userplay)
				fillUserEntry(board, console, usersymbol);
			else
				fillRandom(board, computersymbol);
			printBoard(board);
			userplay = !userplay;
		}
		printBoard(board);
	}

	public static void resetBoard(char[][] board, int size) {
		if(size <=0)
			return;
		for (int rows = 0; rows < size; rows++)
			for (int columns = 0; columns < size; columns++)
				board[rows][columns] = ' ';
		printBoard(board);
	}

	public static void printBoard(char[][] board) {
		System.out.println("Updated Board");
		for (int len = 0; len < board.length; len++){
			System.out.print("----");
		}
		System.out.println("");
		for (int rows = 0; rows < board.length; rows++) {
			for (int columns = 0; columns < board[rows].length; columns++) {
				System.out.print(" " + board[rows][columns] + " |");
			}
			System.out.println("");
			for (int len = 0; len < board.length; len++){
				System.out.print("----");
			}
			System.out.println("");
		}
		System.out.println("");
	}

	public static void fillUserEntry(char[][] board, Scanner console, char usersymbol) {
		if(isAllSpotFilled(board))
			return;
		System.out.println("Enter the rows [0-" + board.length + "] and columns [0-" + board.length + "] for placing your symbol");
		int rows = console.nextInt() - 1;
		int columns = console.nextInt() - 1;
		while (board[rows][columns] != ' ') {
			System.out.println("Please enter another position that is not taken up");
			rows = console.nextInt() - 1;
			columns = console.nextInt() - 1;
		}
		board[rows][columns] = usersymbol;
	}


	public static void fillRandom(char[][] board, char computersymbol) {
		if(isAllSpotFilled(board))
			return;
		Random r = new Random();
		int randomrows = r.nextInt(board.length);
		int randomcolumns = r.nextInt(board.length);
		while (board[randomrows][randomcolumns] != ' ') {
			randomrows = r.nextInt(board.length);
			randomcolumns = r.nextInt(board.length);
		}
		board[randomrows][randomcolumns] = computersymbol;
	}


	public static boolean isGameDone(char[][] board) {
		char winsymbol = checkWinner(board);
		boolean filled = isAllSpotFilled(board);
		if(filled) {
			if(winsymbol != ' ') {
				System.out.println("Game done - All spots are filled - winning symbol:" + winsymbol);
				return true;
			}
			else {
				System.out.println("Game done all spots are filled - no winner , tied, Try again!");
				return true;
			}
		}
		else if( winsymbol != ' ') {
			System.out.println("Game done - winning symbol:" + winsymbol);
			return true;
		}
		return false;
	}
/*
 Method to check if all spots are filled
 Parameters: board, two dimentional char array
 Returns : true if all spots are filled or false
*/
	public static boolean isAllSpotFilled(char[][] board) {
		for (int rows = 0; rows < board.length; rows++) {
			for (int columns = 0; columns < board[rows].length; columns++) {
				if(board[rows][columns] == ' '){
					return false;
				}
			}
		}
		return true;
	}

/*
 Check the winner for rows, columns and diagonals
*/
	public static char checkWinner(char[][] board) {
		boolean win = false;
		char symbol = ' ';
		// Check row winner
		for (int row = 0; row < board.length ; row++) {
			symbol = board[row][0];
			win = true;
			if(symbol == ' '){
				win = false;
				continue;
			}
			for (int col = 0; col < board[row].length ; col++) {
				if(board[row][col] != symbol) {
					win = false;
					break;
				}
			}
			if(win) {
				System.out.println("Symbol " + symbol + " won in row " + (row+1));
				return symbol;
			}
		}
		// Check for column winner
		for (int row = 0; row < board.length; row++) {
			symbol = board[row][0];
			win = true;
			if(symbol == ' '){
					win = false;
					continue;
			}
			for (int col = 0; col < board[row].length; col++) {
				if(board[col][row] != symbol) {
					win = false;
					break;
				}
			}
			if(win) {
				return symbol;
			}
		}
		// Check for diagnal winner
		symbol = board[0][0];
		win = true;
		for (int row = 0; row < board.length; row++) {
			if(symbol == ' '){
					win = false;
					break;
			}
			if(board[row][row] != symbol) {
				win = false;
				break;
			}
		}
		if(win) {
			System.out.println("Symbol " + symbol + " won in diagonal start with [1,1]");
			return symbol;
		}
		// Check for opposite diagnal winner
		symbol = board[board.length - 1][0];
		win = true;
		for (int row = board.length - 1; row >=0; row--) {
			if(symbol == ' '){
					win = false;
					break;
			}
			if(board[board.length-1-row][row] != symbol) {
				win = false;
				break;
			}
		}
		if(win) {
			System.out.println("Symbol " + symbol + " won in opposite diagonal [" + board.length + "," + board.length +"]");
			return symbol;
		}
		return ' ';
	}
}
