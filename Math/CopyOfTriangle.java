package Math;

import java.awt.geom.Point2D;

public class CopyOfTriangle {
	
	private Point2D.Double a, b, c; 
	private double xa, ya, xb, yb, xc, yc; 
	private double ab, bc, ac, anglea, angleb, anglec; 

	
	public static double roundHundreths(double x) {
		return (int)(x * 100 + 0.5) / 100.0;  
	}


	public Triangle(Point2D.Double a, Point2D.Double b, Point2D.Double c) {
		this.a = a; 
		this.b = b; 
		this.c = c; 
	}
	
	public void setVerticies() {
		xa = this.a.getX(); 
		ya = this.a.getY(); 
		xb = this.b.getX(); 
		yb = this.b.getY(); 
		xc = this.c.getX(); 
		yc = this.c.getY(); 
		
	}
	
	public String getVertices() {
		return "The triangle with vertices at: \n" 
		+ 	"\tPoint A: " + "(" + xa + ", " + ya + ")\n"
		+   "\tPoint B: " + "(" + xb + ", " + yb + ")\n"
		+   "\tPoint C: " + "(" + xc + ", " + yc + ")\n"
		+   "has the following properties:\n";
	
					
	}
	
	public void setLength() {
		ab = (Math.sqrt(Math.pow(xa  - xb, 2) + Math.pow(ya - yb, 2)));  
		bc = (Math.sqrt(Math.pow(xb - xc, 2) + Math.pow(yb - yc, 2)));
		ac = (Math.sqrt(Math.pow(xa - xc, 2) + Math.pow(ya - yc, 2)));
	}
	
	public String getLength() {
		return "Length of side AB\t" + roundHundreths(ab) + " units\n" 
			+ "Length of side BC\t" + roundHundreths(bc) + " units\n"
			+ "Lenght of side AC\t" + roundHundreths(ac) + " units\n"; 
	}
	
	public void setAngles() {  //NEED TO FIX NUMBERS 
		anglea = Math.toDegrees(Math.acos((((ac * ac) + (ab * ab) - (bc * bc)) / (2.0 * ac * ab)))); 
		angleb = Math.toDegrees(Math.acos((((ab * ab) + (bc * bc) - (ac * ac)) / (2.0 * ab * bc))));
		anglec = 180 - (anglea + angleb); 
	}

	public String getAngles() {  //Good 10/17
		// their = our;
		// a = b; b = c; c = a; 
		
		return "Measure of angle A\t" 
			+ roundHundreths(anglea) + " degrees\nMeasure of angle B\t" 
			+ roundHundreths(angleb) + " degrees\nMeasure of angle C\t"
			+ roundHundreths(anglec) + " degrees\n"; 
			
	}
	public double getPerimeter() {
		return roundHundreths((ab + bc + ac));
	}
	public String getArea() {
		//A = 1/2 * ab * sinC; To find height measure 
		// C - angle measure
		// height = bSinC
		// Acute triangle, right triangle, obtuse triangle 
		double height; 
		
		if (anglea == 90.0 || angleb == 90.0 || anglec == 90.0) {
			height = bc; 
		} else {
			height = ac * Math.sin(Math.toRadians(anglea)); 
		}
		

//		WE'RE STUPID AND WE DIDN'T USE HERONS FORMULA 
//		double s = getPerimeter() / 2.0; 
//		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
		
		double area = roundHundreths(0.5 * (ab * height)); 
		return "and area of\t" + area + " square units\n"; 

	}
	public String testTriangle() {
		// their a - BC | b - AC | c - AB
		// theirs = ours
		// a = b; b = c; c = a; 
				
		boolean isosceles = (ab == bc && ab == ac) ||(ab == ac && bc == ac) || (bc == ac && ab == bc); 
		boolean equilateral = (ab == bc && bc == ac); 
		boolean scalene = (ab != bc && bc != ac && ab != ac); 
		boolean right = (anglea == 90.0 || angleb == 90.0 || anglec == 90.0); 
		boolean acute = (anglea < 90.0 || angleb < 90.0 || anglec < 90.0); 
		boolean obtuse = (anglea > 90.0 || angleb > 90.0 || anglec > 90.0); 

		
		return "Triangle is Isosceles?  " + isosceles
				+ "\nTriangle is Equilateral?  " + equilateral
				+ "\nTriangle is Scalene?  " + scalene
				+ "\nTriangle is Right?  " + right 
				+ "\nTriangle is Acute?  " + acute 
				+ "\nTriangle is Obtuse?  " + obtuse; 
			
	}
//	public String getTestTriangle() {				
//	boolean isosceles = (ab == bc && ab == ac) ||(ab == ac && bc == ac) || (bc == ac && ab == bc); 
//	boolean equilateral = (ab == bc && bc == ac); 
//	boolean scalene = (ab != bc && bc != ac && ab != ac); 
//	boolean right = (anglea == 90.0 || angleb == 90.0 || anglec == 90.0); 
//	boolean acute = (anglea < 90.0 || angleb < 90.0 || anglec < 90.0); 
//	boolean obtuse = (anglea > 90.0 || angleb > 90.0 || anglec > 90.0); 
//
//	
//	return "Triangle is Isosceles?  " + isosceles
//			+ "\nTriangle is Equilateral?  " + equilateral
//			+ "\nTriangle is Scalene?  " + scalene
//			+ "\nTriangle is Right?  " + right 
//			+ "\nTriangle is Acute?  " + acute 
//			+ "\nTriangle is Obtuse?  " + obtuse; 
//		
//}
}	
			

//JFrame frame = new JFrame("InputDialog Example #1");
//
//String xcoord1 = JOptionPane.showInputDialog("Enter the X coordinate for your 1st point");
//String ycoord1 = JOptionPane.showInputDialog("Enter the Y coordinate for your 1st point"); 
//String xcoord2 =  JOptionPane.showInputDialog("Enter the X coordinate for your 2nd point"); 
//String ycoord2 = JOptionPane.showInputDialog("Enter the Y coordinate for your 2nd point"); 
//String xcoord3 = JOptionPane.showInputDialog("Enter the X coordinate for your 3rd point"); 
//String ycoord3 = JOptionPane.showInputDialog("Enter the Y coordinate for your 3rd point"); 
//
//double x1 = Double.parseDouble(xcoord1); 
//double y1 = Double.parseDouble(ycoord1); 
//double x2 = Double.parseDouble(xcoord2); 
//double y2 = Double.parseDouble(ycoord2);
//double x3 = Double.parseDouble(xcoord3); 
//double y3 = Double.parseDouble(ycoord3); 
//
//Triangle one = new Triangle(new Point2D.Double(x1, y1), new Point2D.Double(x2, y2), new Point2D.Double(x3, y3)); 
//
//one.getVertices(); 
//
//JOptionPane.showMessageDialog(null, "Total Values =  " + one , "PiggyBank", 1);
//



//	- - - - - - - - - - - - - - - - - - - -
//	The triangle with vertices at:
//	Point A:(3.0, 9.0)
//	Point B:(8.0, 0.0)
//	Point C:(5.0, 10.0)
//	has the following properties:
//	Length of side AB 10.30 units
//	Length of side BC 10.44 units
//	Length of side AC 2.24 units
//	Measure of angle A 87.51 degrees
//	Measure of angle B 12.36 degrees
//	Measure of angle C 80.13 degrees
//	with a perimeter of 22.97 units
//	and area of 11.50 square units
//	Triangle is Isosceles? False
//	Triangle is Equilateral? false
//	Triangle is Scalene? true
//	Triangle is Right? false
//	Triangle is Acute? true
//	Triangle is Obtuse? False
//	The circumcenter lies at (6.28, 4.93)
//	The centroid lies at (5.33, 6.33)
//	The orthocenter is at (3.43, 9.13)
//	- - - - - - - - - - - - - - - - - - - -


