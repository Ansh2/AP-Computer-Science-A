package ObjectsAndMethods;

public class NumberPairs {
	// declare the fields / instance variables "num1, num2, and sum"

	private double num1, num2, sum;

	// Code the no-args constructor
	
	public NumberPairs() {
		this.num1 = 0.0; 
		this.num2 = 0.0; 
		this.sum = 0.0; 
	}
	
	// Code the overloaded constructor that takes two numbers as parameters (not
	// the sum)
	
	public NumberPairs(double n1, double n2) {
		num1 = n1; 
		num2 = n2; 
	}

	public double getNum1() {
		return num1;
	}



	public void setNum1(double num1) {
		this.num1 = num1;
	}



	public double getNum2() {
		return num2;
	}



	public void setNum2(double num2) {
		this.num2 = num2;
	}



	public double getSum() {
		return sum;
	}



	public void setSum(double sum) {
		this.sum = sum;
	}
	
	// Code a mutator to change the values in the NumberPairs object
	

	
	public void setNums(double n1, double n2) {
		this.num1 = n1; 
		this.num2 = n2; 
		
		
		
	}

	// Code a mutator that computes the sum, but does not print it out

	public void setsums() {
		this.sum = this.num1 + this.num2; 
	}
	
	// Code a toString method that returns the numbers and their sum
	@Override
	public String toString() {
		setsums();
		return this.num1 + " + " + this.num2 + " == " + this.sum; 
		
	}

	// EXTENSION - CAN YOU DO IT?
	// Code a mutator that adds the second NumberPair to increase the first.
	
	public void cobine (NumberPairs other) {
		this.num1 = this.num1 + other.num1; 
		this.num2 = this.num2 + other.num2; 
		//this.sum(); 
	}

	// EXTENSION - CAN YOU DO IT?
	// Create a new NumberPairs object from the sum of the others


	public static void main(String[] args) {
		NumberPairs one = new NumberPairs();
		one.setNums(5, 5);
		NumberPairs two = new NumberPairs(90, 100.0);
		NumberPairs three = new NumberPairs(100.5, 85.8);
		NumberPairs four = new NumberPairs(-100, 55);
		NumberPairs five = new NumberPairs(15236, 5642);
		NumberPairs six = new NumberPairs(1000, 555);
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);

	}

}
