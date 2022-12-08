package Math;

public class myPoint { 
	
	private double myX, myY; //instance
	
	public static double round(double x) {
		return (int)(x * 100 + 0.5) / 100.0;  
	}
	public myPoint(double x, double y) {  //constructor with 2 para.
		myX = x; 
		myY = y; 
	}
	
	public double getMyX() {  //Fetches data
		return myX;
	}
	public void setMyX(double myX) { //Dumps data into instance. 
		this.myX = myX;
	}
	public double getMyY() {
		return myY;
	}
	public void setMyY(double myY) {
		this.myY = myY;
	}	

	public String toString() {  
		return "(" + myX + ", " + myY + ")"; 
		
	}
	public myPoint midpoint(myPoint other) { 
		 double xValue = (this.myX + other.myX) / 2.0; 
		 double yValue = (this.myY + other.myY) / 2.0; 
		 return new myPoint(xValue, yValue); 
	}
	
	public static double slope(myPoint first, myPoint second) {   
		return ((double)(first.myY - second.myY)) / (first.myX - second.myX); 
		
	}
	public static double distance(myPoint first, myPoint second) {   //int / int = int //double / int = double | Make sure to cast!     
		return round((Math.sqrt(Math.pow((double)second.myY - first.myY, 2) + Math.pow((double)second.myX - first.myX, 2)))); 
		
	}
	
	public static String pointSlopeForm(myPoint first, myPoint second) { //Sending implictly and exlipcitly 
		double xValue = first.getMyX(); 
		double yValue = first.getMyY();
		double xValue2 = second.getMyX(); 
		double yValue2 = second.getMyX(); 
		double slope = slope(first, second);
		double roundedslope = (int)(slope * 100 + 0.5) / 100.0;
			
		if (xValue < 0) {
			return "y - " + yValue + " = " + roundedslope + "(x + " + Math.abs(xValue) + ")"; 
		} else if (yValue < 0) {
			return "y + " + Math.abs(yValue) + " = " + roundedslope + "(x - " + xValue + ")"; 
		} else if (xValue < 0 && yValue < 0) {
			return "y + " + yValue + " = " + roundedslope + "(x + " + xValue + ")"; 		
		} else  {
			return "y - " + yValue + " = " + roundedslope + "(x - " + xValue + ")"; 
		}
			
		
	}
	
	public String AXBYForm(myPoint other) { //memorize
		double slope = slope (this, other); 
		double a = -slope; 
		double b = 1; 
//		double c = slope * (this.getMyX() - this.getMyY()); 
		double c = -1.0 * other.getMyY() + (slope * other.getMyX());
		String eqn = round(a) + "x + " + round(b) + "y " + round(c) + " = 0"; 
		return eqn; 
	}
	
	//Find x and y intercepts 
	
	//Find a point on the equation of the two lines
	public String findOtherPoint(myPoint other) {
		double slope = slope (this, other); 
		double a = -slope; 
		double b = 1; 
		double c = slope * (this.getMyX() - this.getMyY()); 

//		double xslope = slope * this.getMyX(); 
//		String eq = this.
		
		return "(" + 0 + ", " + c + ")";
	}
	
	public static void main(String[] args) {
		myPoint one = new myPoint(3,4); 
		myPoint two = new myPoint(8,11); 
		System.out.println(one.midpoint(two));
		System.out.println("The midpoint of " + one + " and " + two + " is " + one.midpoint(two));
		System.out.println("The slope of " + one + " and " + two + " is " + slope(one, two));
		System.out.println("The distance of " + one + " and " + two + " is " + distance(one, two));
		System.out.println("The equation of " + two + " is " + pointSlopeForm(one, two));
		System.out.println("The equation that passes through " + one + " and " + two + " is " +
            "\n" + one.AXBYForm(two));
		System.out.println("The y-intercept of the equation that passes through " + one + " and " + two + " is " + "\n" + one.findOtherPoint(two));
	}

}
