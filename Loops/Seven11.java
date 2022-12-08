package Loops;

import java.util.Random;
import java.util.Scanner;

public class Seven11 {
	public static int bankamount;
	public static int bet; 

	// askAmountFromBank()
	// askBet()
	// game1()
	// If roll == 7 | roll == 11
	// End game ("Congratulations")
	// playAgain()
	// beginning
	// If roll == 2, 3, 12
	// End game ("You lost"
	// playAgain()
	//
	// game2()
	// 3 test case senarios
	// random (what roll do you need to win the bet *met)
	// Repeat code three times and check every tiem
	// roll twice and accumate each role into result
	// check with if statment to see if equal
	// if result = random roll needed to win
	// you win
	// else (repeate through code unitl you find the result)
	// if result is not found after three rounds
	// loose()
	// play again

	public static void askAmountFromBank() {
		System.out.println("How much would you like to take out from the bank");
		Scanner scan = new Scanner(System.in);
		bankamount = scan.nextInt(); 

	}

	public static void askBet() {
		System.out.println("How much would you like to bet?");
		Scanner scan = new Scanner(System.in);
		bet = scan.nextInt(); 
	}

	public static int roll() {
		Random rand = new Random();
		int roll1 = 0;
		int roll2 = 0;
		roll1 = rand.nextInt(6) + 1;
		System.out.println("Roll 1: " + roll1);
		roll2 = rand.nextInt(6) + 1;
		System.out.println("Roll 2: " + roll2);
		System.out.println("Total: " + (roll1 + roll2) + "\n\n");
		return (roll1 + roll2);
	}

	public static void gameOne() {
		int result = roll();
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}

		if (result == 7 || result == 11) {
			win(result);			
		} else if (result == 2 || result == 3 || result == 12) {
			lose(result);
		} else {
			gameTwo(result); 
		}

	}

	public static void gameTwo(int rollx) {
		System.out.println("\nYou need to roll a " + rollx);
		try {
			Thread.currentThread().sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}

		int totaldice = 0;
		for (int i = 1; i <= 3; i++) {
			totaldice = roll();
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
			if (totaldice == 7) {
				lose(rollx);
				break;
			} else if (totaldice == rollx) {
				win(rollx);
				break;

			}
		}

		if (!(totaldice == 7 || totaldice == rollx)) {
			System.out.println("Sorry, you lost :(");
		}

	}

	public static boolean askPlayAgain() {
		System.out.println("Do you want to play again?");
		Scanner scan = new Scanner(System.in);
		String play = scan.next();
		if (play.equalsIgnoreCase("Yes") || play.equalsIgnoreCase("Y")) {
			return true;
		} else {
			return false;
		}

	}

	public void play() {
		askAmountFromBank();
		boolean again = true;
		while (again == true) {
			askBet();
			gameOne();
			again = askPlayAgain();
		}
		System.out.println("Thank you for playing!");

	}

	public static void win(int rolla) {
		System.out.println("\nYour roll was " + rolla + " and therfore you win ):");
		bankamount += bet;
		System.out.println("You now have $" + bankamount);

	}

	public static void lose(int rolla) {
		System.out.println("\nYour roll was " + rolla + " and therfore you lose :(");
		bankamount -= bet;
		System.out.println("You now have $" + bankamount);

	}

	public static void main(String[] args) {
		Seven11 one = new Seven11();
		one.play();

	}

}
