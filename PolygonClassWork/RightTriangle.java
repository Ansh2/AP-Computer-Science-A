package PolygonClassWork;

public class RightTriangle extends Polygon {
	
	private double base; 
	private double height; 
	
	public RightTriangle() {
		
	}
	
	public RightTriangle(double base, double height) {
		super(3, "Triangle"); 
		this.base = base; 
		this.height = height; 		
	}
	@Override
	public double getPerimeter() {
		return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2)) + base + height; 
		
	}
	@Override
	public double getArea() {
		return 0.5 * base * height; 
	}
	
	public String toString() {
		return super.toString() + "\nAREA: " + getArea() + "\nPERIMETER: " + getPerimeter(); 
	}
	
	public static void main(String[] args) {
		RightTriangle one = new RightTriangle(3, 4);
		System.out.println(one);
	}
	
	
}
