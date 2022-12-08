package ObjectsAndMethods;

public class Circle {
	
	private double radius; 
	
	public Circle() {
		
	}
	
	public Circle(double r) {
		this.radius = r; 
	}

	public double getRadius() {
		return radius;
	}

	public void changeRadius(double radius) {
		this.radius = radius;
	}
	

	public double findDiameter() {
		
		return this.radius * 2; 
		
	}
	
	public double findCircumference() {
		
		return findDiameter() * Math.PI; 
	}
	
	public double findArea() {
		
		return Math.pow(this.radius, 2) * Math.PI; 
	}
	
	@Override
	public String toString() {
		
		return "Radius = " + radius + "\nDiameter = " + findDiameter() + "\nCircumference = " + findCircumference() + "\nArea = " + findArea();
	}


		
	

}
