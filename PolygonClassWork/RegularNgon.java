package PolygonClassWork;

public class RegularNgon extends Polygon {
	
	private int sideLength; 
	
	 public RegularNgon() {
		 
	 }

	 
	 public RegularNgon(int sides, int sideLength) {
		 super(sides, sides + " sided N-Gon");
		 this.sideLength = sideLength; 
	 }
	 
	 @Override
	 public double getPerimeter() {
		 return getSides() * sideLength; 
	 }
	 @Override
	 public double getArea() {
		 return getSides() * Math.pow(sideLength, 2) * ((1 / Math.tan(Math.PI / getSides()) / 4)); 
	 }
	 
	 public String toString() {
		 return super.toString() + "\nAREA: " + getArea() + "\nPERIMETER: " + getPerimeter(); 
	 }
	 
	 public static void main(String[] args) {
		 RegularNgon one = new RegularNgon(4, 5);
		 System.out.println(one);
	 }
}
