package Loops;

import java.util.Random;

public class LoopingFunIntro extends Object {

//	public LoopingFunIntro(String a) { //You do not need this code as you are defining your own constructor
//		super(); //special request to use default constructor
//	}
	//but by default, sh

	
	//create (print) a row by column matric of asterisks
	public void asterisks(int row, int column) {
		
		for (int i = 1; i<=row; i++) {
			for (int j = 1; j<= column; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	//Dice game, Rooll one die repeatedly. 
	//How many rools does it take to 
	//get a total of at least 100? 
	
	public int rollToHundred() {
		Random rand = new Random(); 
		int sum = 0;
		//instance variables can get default varibles, but not local variables 
		//if you did not set that int, you would get the defualt value but not 
		//for local variables 
		int count = 0; 
		while (sum < 100) {
			sum += (rand.nextInt(6) + 1);
			count++; 
		}
		return count; 
		
			
	}
	
	//
	public void factors(int number) {
		for (int i = 1; i<number; i++) {
			if (number % i == 0) {
				System.out.print(i + ", ");
			}
		}
		System.out.println(number);
		
		
		
		
	}
	public static int lcm(int first, int second) {
		//none of them are multipels
		//you are looking for multipeles of 6 and 8 
		int multiple = 0; 
		for (int i = 1; i < first; i++) {
			if ((first * i) % second == 0) {
				multiple = first * i;
				break; 
			}
		
		}
		return multiple; 
		
	
	}
	
	
	
	public static void main(String[] args) {
		LoopingFunIntro one = new LoopingFunIntro(); //called the default constructor
		one.asterisks(5, 20); 
		System.out.println(("It took " + one.rollToHundred() + " tries to exceed 99")); 
		one.factors(12);
		System.out.print("The lowest common multiple of");
		System.out.println(" 6 and 8 is " + lcm(6, 8));
		
		
		//if you do not create a construco0tr, you are going to extend and the default that java thinks is the objects class
		//automatically extend from parent class if you do not have a constructor
		//The part class for theis is objects and since this is already extended, you do no have to extend . 
		//SHoewsd up on the multiple choice question on the AP Test 
		//
	}

}
