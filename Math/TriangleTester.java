package Math;

import java.awt.geom.Point2D;
import java.util.*; 

public class TriangleTester { 
	
	
	
	public static void main(String[] args) { 
		Triangle one = new Triangle(new Point2D.Double(3, 9), new Point2D.Double(8, 0), new Point2D.Double(5, 10)); 
		one.setVerticies(); 
		one.setLength();
		one.setAngles(); 
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		System.out.println(one.getVertices());
		System.out.println(one.getLength());
		System.out.println(one.getAngles());
		System.out.println(one.getPerimeter());
		System.out.println(one.getArea());
		System.out.print(one.getIsosceles());
		System.out.print(one.getEquilateral());
		System.out.print(one.getScalene());
		System.out.print(one.getRight());
		System.out.print(one.getAcute());
		System.out.print(one.getObtuse());
		System.out.println("\n- - - - - - - - - - - - - - - - - - - -");
		
	}
	

}
