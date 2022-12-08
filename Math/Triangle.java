package Math;

import java.awt.geom.Point2D;

public class Triangle {
	
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
	
	public void setLength() {
		ab = (Math.sqrt(Math.pow(xa  - xb, 2) + Math.pow(ya - yb, 2)));  
		bc = (Math.sqrt(Math.pow(xb - xc, 2) + Math.pow(yb - yc, 2)));
		ac = (Math.sqrt(Math.pow(xa - xc, 2) + Math.pow(ya - yc, 2)));
		
	}
	
	public void setAngles() {  
		anglea = Math.toDegrees(Math.acos((((ac * ac) + (ab * ab) - (bc * bc)) / (2.0 * ac * ab)))); 
		angleb = Math.toDegrees(Math.acos((((ab * ab) + (bc * bc) - (ac * ac)) / (2.0 * ab * bc))));
		anglec = 180 - (anglea + angleb); 
		
	}
	
	
	public String getVertices() {
		return "The triangle with vertices at: \n" 
		+ 	"\tPoint A: " + "(" + xa + ", " + ya + ")\n"
		+   "\tPoint B: " + "(" + xb + ", " + yb + ")\n"
		+   "\tPoint C: " + "(" + xc + ", " + yc + ")\n"
		+   "has the following properties:\n";
					
	}
	

	public String getLength() {
		return "Length of side AB\t" + roundHundreths(ab) + " units\n" 
			+ "Length of side BC\t" + roundHundreths(bc) + " units\n"
			+ "Lenght of side AC\t" + roundHundreths(ac) + " units\n"; 
	}
	
	
	public String getAngles() { 
		return "Measure of angle A\t" 
			+ roundHundreths(anglea) + " degrees\nMeasure of angle B\t" 
			+ roundHundreths(angleb) + " degrees\nMeasure of angle C\t"
			+ roundHundreths(anglec) + " degrees\n"; 
			
	}
	public String getPerimeter() {
		return "with a perimeter of " + roundHundreths(ab + bc + ac) + " units";
	}
	
	public String getArea() {
		// Heron's Formula 
		double s = (ab + bc + ac) / 2.0; 
		double area = Math.sqrt(s * (s - ab) * (s - bc) * (s - ac)); 
		
		
		// Laws of Sines 
//		double height; 
//		if (anglea == 90.0 || angleb == 90.0 || anglec == 90.0) {
//			height = bc; 
//		} else {
//			height = ac * Math.sin(Math.toRadians(anglea)); 
//		}
//		
//		double area = (0.5 * (ab * height));	

		return "and area of\t" + roundHundreths(area) + " square units\n"; 

	}

	public String getIsosceles() {
		boolean isosceles = (a == b && a == c) ||(a == c && b == c) || (b == c && a ==b);
		return  "Triangle is Isosceles?  " + isosceles;
	}

	public String getEquilateral() {
		boolean equilateral = (a == b && b == c);
		return "\nTriangle is Equilateral?  " + equilateral;
	}

	public String getScalene(){
		boolean scalene = (a != b && b != c && a != c);
		return "\nTriangle is Scalene?  " + scalene;
	}


	public String getRight() {
		boolean right = (anglea == 90.0 || angleb == 90.0 || anglec == 90.0);
		return "\nTriangle is Right?  " + right;
	}

	public String getAcute() {
		boolean acute = (anglea < 90.0 || angleb < 90.0 || anglec < 90.0);

		return "\nTriangle is Acute?  " + acute;

	}
	public String getObtuse() {
		boolean obtuse = (anglea > 90.0 || angleb > 90.0 || anglec > 90.0);
		return "\nTriangle is Obtuse?  " + obtuse;
		
	}

}	
			

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


