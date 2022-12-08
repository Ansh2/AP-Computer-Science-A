package Math;

public class LinearEQ {
	private double xcoeff, ycoeff, constant;
	

	// default constructor (write signature line and implement)

	public LinearEQ() {
		
	}
	
	// overloaded constructor takes an x-coefficient, y-coefficient, and constant
	
	public LinearEQ(double a, double b, double c) {
		xcoeff = a; 
		ycoeff = b; 
		constant = c; 
		 
	}
	// for linear equation of form ax + by + c = 0
	// (write signature line and implement)

	
	
	// method to round numbers to two decimals
	// (this was covered previously - use this to clean up your points)
	public static double round(double x) {
		return (int)(x * 100 + 0.5) / 100.0;  
	}
	

	public double getXcoeff() {
		return xcoeff;
	}

	public void setXcoeff(double xcoeff) {
		this.xcoeff = xcoeff;
	}

	public double getYcoeff() {
		return ycoeff;
	}

	public void setYcoeff(double ycoeff) {
		this.ycoeff = ycoeff;
	}

	public double getConstant() {
		return constant;
	}

	public void setConstant(double constant) {
		this.constant = constant;
	}
	

	// returns the x-value of the intersection of two lines
	public double xSol(LinearEQ b){
		return  (int)((this.getYcoeff() * b.getConstant() - this.getConstant() * b.getYcoeff()) / (this.getXcoeff() * b.getYcoeff() - b.getXcoeff() * this.getYcoeff())); 
		
	}

	// returns the y-value of the system's intersection

	public double ySol (LinearEQ b){  //change to int 
				
		return (int)((b.constant * this.xcoeff - this.constant * b.xcoeff)/(this.ycoeff * b.xcoeff - b.ycoeff * this.xcoeff));
	}

	// returns a Point object (or myPoint object) that represents
	// the coordinate where the two lines intersect
//	public myPoint solution(LinearEQ b){
//
//		return new myPoint(this.xSol(b), this.ySol(b));
//	}
	
	

	public static void main(String[] args) {
		// example calls for constructors
		LinearEQ one = new LinearEQ(2, -3, -2);
		LinearEQ two = new LinearEQ(4, 1, 24);
		System.out.println("The x-solution of the line is " + xSol(one, two)); 
		System.out.println("The y-solution of the line is " + one.ySol(two));
		System.out.println("The solution of the lines is " + one.solution(two));
//		include testers that can take objects one and two
		//above and print out the solution to the system
		
		
		
	}


}
