package PolygonClassWork;

public abstract class Polygon {
	
	private int sides; 
	private String types; 
	
	
	public Polygon() {
		
	}
	
	public Polygon(int mySides, String myType) {
		sides = mySides; 
		types = myType; 
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}
	
	public abstract double getPerimeter(); 
	
	public abstract double getArea(); 
	
	public String toString() {
		return "SIDES: " + sides + "\nTYPE: " + types;
	}
	

}
