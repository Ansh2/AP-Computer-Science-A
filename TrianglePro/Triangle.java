package TrianglePro;

import java.awt.geom.Point2D;

public class Triangle {
	
	private Point2D.Double a, b, c; 
	
	public Triangle(Point2D.Double a, Point2D.Double b, Point2D.Double c) {
		this.a = a; 
		this.b = b; 
		this.c = c; 
	}

	public String getLength() {
		double ab = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2)); 
		double bc = Math.sqrt(Math.pow(b.getX() - c.getX(), 2) + Math.pow(b.getY() - c.getY(), 2));
		double ac = Math.sqrt(Math.pow(a.getX() - c.getX(), 2) + Math.pow(a.getY() - c.getY(), 2)); 
		return "Length of side AB\t" + ab + "\n" 
			+ "Length of side BC\t" + bc + "\n"
			+ "Lenght of side AC\t" + ac + "\n"; 
	}
	public 
//	}
//
//	public Point2D.Double getA() {
//		return a;
//	}
//
//	public void setA(Point2D.Double a) {
//		this.a = a;
//	}
//
//	public Point2D.Double getB() {
//		return b;
//	}
//
//	public void setB(Point2D.Double b) {
//		this.b = b;
//	}
//
//	public Point2D.Double getC() {
//		return c;
//	}
//
//	public void setC(Point2D.Double c) {
//		this.c = c;
//	}

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

}
