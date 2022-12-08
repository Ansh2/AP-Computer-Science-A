package Recursion;
import static java.lang.System.*;

public class AtCounterRunner
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		int[][] x = {{0, 0}, {2, 5}, {5, 0}, {9, 9}, {3, 9}};
		AtCounter one = new AtCounter(x);
		//test the code
		System.out.println("0 0 has " + one.countAts(x[0][0], x[0][1]) + " @s connected.");
		System.out.println("2 5 has " + one.countAts(x[1][0], x[0][1])+ " @s connected.");
		System.out.println("5 0 has " + one.countAts(x[2][0], x[0][1]) + " @s connected.");
		System.out.println("9 9 has " + one.countAts(x[3][0], x[0][1]) + " @s connected.");
		System.out.println("3 9 has " + one.countAts(x[4][0], x[0][1]) + " @s connected.");
	}
}