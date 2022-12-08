package Math;

import java.awt.geom.Point2D;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ObjectsAndMethods.PiggyBank;

public class UserInterface {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter the X coordinate for your 1st point");
		
		double x1 = input.nextDouble(); 
		
		System.out.println("Enter the Y coordinate for your 1st point"); 
		
		double y1 = input.nextDouble(); 
				
		System.out.println("Enter the X coordinate for your 2nd point"); 
		
		double x2 = input.nextDouble(); 
		
		System.out.println("Enter the Y coordinate for your 2nd point"); 
		
		double y2 = input.nextDouble(); 
		
		System.out.println("Enter the X coordinate for your 3rd point"); 
		
		double x3 = input.nextDouble(); 
		
		System.out.println("Enter the Y coordinate for your 3rd point"); 
		
		double y3 = input.nextDouble(); 
		
		Triangle one = new Triangle(new Point2D.Double(x1, y1), new Point2D.Double(x2, y2), new Point2D.Double(x3, y3)); 
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
