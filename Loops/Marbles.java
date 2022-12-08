package Loops;

import java.util.*;

public class Marbles {

	public static int size;

	/*
	 * Write a program in which computer player is against human opponent List of
	 * things needed to be accomplished: Generate random integer (between 10 to 100)
	 * to denote the size of the pile Generate a random value (either 0 or 1) to
	 * decide whether the computer plays smart or stupid. In Stupid mode, the
	 * computer takes a random legal value between 1 and n / 2 In Smart mode, the
	 * computer takes off enough marbles to make the size a power of two minus 1-
	 * This is legal except if size of pile is one less then a power of 2 In that
	 * case, the computer makes a random legal move.
	 */

	public static void setSizeOfGame() {
		Random rand = new Random();
		size = rand.nextInt(90) + 10;
		System.out.println("The size of this game is " + size);
	}

	public static boolean decideSmartOrStupid() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you want the computer to play smart or stupid? (CODE ONLY WORKS FOR STUPID FOR NOW)");
		String response = scan.next();
		if (response.equalsIgnoreCase("stupid") || response.equalsIgnoreCase("s")) {
			return false;
		} else {
			return true;
		}

	}


	public static void humanMove() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please choose an amount of marbles to take from the pile");
		int humanmarbles = scan.nextInt();
		if (size == 1) {
			if (humanmarbles != 1) {
				while (humanmarbles != 1) {
					System.out.println("Please enter a valid number between 1 to " + size/2);
					humanmarbles = scan.nextInt(); 
				}
			}
			size -= 1; 
				
		} else {
			if ((humanmarbles < 1 || humanmarbles > size / 2)) {
				while (humanmarbles < 1 || humanmarbles > size / 2) {
					System.out.println("Please enter a valid number between 1 to " + size/2);
					humanmarbles = scan.nextInt();
				}
			}
			size -= humanmarbles;
		}

	}

	public static void smart() { //this method is not working
		Random rand = new Random();
		int smartcomp = 0;
		int power = 0;
		for (int i = 0; i <= 10; i++) {
			power = (int) Math.pow(2, i) - 1;
			if (size - power <= (size / 2)) {
				size -= power;
				System.out.println("The computer picked " + power + " marble(s).");
				break;
			}
		}

//		for (int i = 0; i <= 10; i++) {

//			if (size == 1 - Math.pow(2, i)) {
//				int randcomp = rand.nextInt(size / 2) + 1;
//				size -= randcomp;
//			}
//		}

	}

	public static void stupid() {
		Random rand = new Random();
		if (size == 1) {
			size -= 1;
			System.out.println("The computer picked " + 1 + " marble(s)");
		} else {
			int randcomp = rand.nextInt(size / 2) + 1;
			System.out.println("The computer picked " + randcomp + " marble(s)");
			size -= randcomp;
		}
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static boolean checkSize() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static String game() {
		boolean move = firstTurn();
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String lostplayer = "";
		boolean smartStupid = decideSmartOrStupid();
		if (move == true) {
			while (true) {
				if (smartStupid == true) {
					smart();
					if (checkSize() == true) {
						lostplayer = "the computer and therefore you won!!!!!";
						break;
					}
					
					System.out.println("The amount of marbles = " + size);
					try {
						Thread.currentThread().sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					humanMove();
					if (checkSize() == true) {
						lostplayer = "you :(:(";
						break;
					}
					System.out.println("The amount of marbles = " + size);
					try {
						Thread.currentThread().sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				} else {
					stupid();
					if (checkSize() == true) {
						lostplayer = "the computer and therefore you won!!!!!";
						break;
					}
					System.out.println("The amount of marbles = " + size);
					try {
						Thread.currentThread().sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					humanMove();
					System.out.println("The amount of marbles = " + size);
					try {
						Thread.currentThread().sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					if (checkSize() == true) {
						lostplayer = "you :(:(";
						break;
					}

				}
			}
		} else {
			while (true) {
				if (smartStupid == true) {
					humanMove();
					if (checkSize() == true) {
						lostplayer = "you :(:(";
						break;
					}
					try {
						Thread.currentThread().sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("The amount of marbles = " + size);
					smart();
				} else {
					humanMove();
					if (checkSize() == true) {
						lostplayer = "you :(:(";
						break;
					}
					
					System.out.println("The amount of marbles = " + size);
					try {
						Thread.currentThread().sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					stupid();
					System.out.println("The amount of marbles = " + size);
					try {
						Thread.currentThread().sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (checkSize() == true) {
						lostplayer = "the computer and therefore you won!!!!";
						break;
					}
				}

			}

		}

		return lostplayer;
	}

	public static boolean firstTurn() {
		Random rand = new Random();
		int num = rand.nextInt(2) + 1;
		if (num == 1) {
			System.out.println("I will go first");
			return true;
		} else {
			System.out.println("I'll let you go first");
			return false;
		}

	}

	public void play() {
		System.out.println("Hello, welcome to the marbles game!");
		try {
			Thread.currentThread().sleep(1250);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Whoever picks the last marbles loses");
		try {
			Thread.currentThread().sleep(1250);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
		setSizeOfGame();
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The player that lost was " + game());
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thank you for playing marbles!!!");

	}

	public static void main(String[] args) {
		Marbles one = new Marbles();
		one.play();

	}

}
