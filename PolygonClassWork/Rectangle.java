package PolygonClassWork;

public class Rectangle extends Polygon {
	
	private double length; 
	private double width; 
	
	public Rectangle() {
		
	}
	
	public Rectangle(double myLength, double myWidth) {
		super(4, "Rectangle"); 
		length = myLength; 
		width = myWidth; 
	}

	@Override
	public double getArea() {
		return length * width; 
	}
	
	@Override
	public double getPerimeter() {
		return 2 * length + 2 * width; 
	}
	
	public String toString() {
		return super.toString() + "\nLENGTH: " + length + "\nWIDTH " + width 
				+ "\nAREA: " + getArea() + "\nPERIMETER: " + getPerimeter(); 
	}
	
	public static void main(String[] args) {
		Rectangle one = new Rectangle(); 
		System.out.println(one);
	}
	

}
