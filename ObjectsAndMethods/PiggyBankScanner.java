package ObjectsAndMethods;

import java.util.Scanner;

public class PiggyBankScanner {
	
	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		System.out.println("Enter the number of pennies for Bank #1:");
		int p = key.nextInt();
		System.out.println("enter the number of dimes for Bank #1:"); 
		int d = key.nextInt(); 	
		System.out.println("Enter the number of nickels for Bank #1:");
		int n = key.nextInt(); 
		System.out.println("Enter the number of quarters for Bank #1:");
		int q = key.nextInt(); 
		PiggyBank one = new PiggyBank(p, d, n, q);
		
		
		System.out.println("Enter the number of pennies for Bank #2:");
		int p2 = key.nextInt();
		System.out.println("Enter the number of dimes for Bank #2:"); 
		int d2 = key.nextInt(); 
		System.out.println("Enter the number of nickels for Bank #2:");
		int n2 = key.nextInt(); 
		System.out.println("Enter the number of quarters for Bank #2:");
		int q2 = key.nextInt(); 
		PiggyBank two = new PiggyBank(p2, d2, n2, q2);
		
		
		System.out.println();
		System.out.println("(BEFORE COMBINING)\n");
		System.out.println("Bank #1: " + one);
		System.out.println();
		System.out.println("Bank #2: " + two);
		one.combinePiggy(two);
		System.out.println();
		System.out.println("(AFTER COMBINING)\n");
		System.out.println("Bank #1: " + one);
		System.out.println();
		System.out.println("Bank #2: " + two);
		System.exit(0);
	}

}
