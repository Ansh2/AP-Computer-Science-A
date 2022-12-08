package PolygonClassWork;

public class Square extends Rectangle {

	
	public Square() {   
		
	}
	
	public Square(double mySide) {
		super(mySide, mySide); 
		setTypes("Square"); //this mutator will overwrite the type that was instantiated in the constructor of polygon 
	}

	public static void main(String[] args) {
		Square one = new Square(5); 
		System.out.println(one);
	}
	
}
