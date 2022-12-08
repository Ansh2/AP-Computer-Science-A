package Recursion;

public class SquareRootApprox {
	//helper method
	public static double squareRootGuess(double x, double g) {
		if (Math.abs((x/g) - g) < 0.001) {
			return g; 
		}
		return squareRootGuess(x, (g + x/g) /2);  
	}
	
	public static double squareRoot(double x) {
		return squareRootGuess(x, 1);
	}
 
	public static void main(String[] args) {
		System.out.println(SquareRootApprox.squareRoot(9.0));
		System.out.println("Expected: 3.0");
		System.out.println(SquareRootApprox.squareRoot(5.0));
		System.out.println("Expected: 2.2");
		System.out.println(SquareRootApprox.squareRoot(12.0));
		System.out.println("Expected: 3.4");
	}
} 
