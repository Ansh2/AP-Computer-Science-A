// MathFuncts methods Paired Programming Assignment
// Use the documentation from JAVA&#39;s Math class to complete the following methods
package Math;
//import java.awt.Point;

import java.awt.Point;

public class MathFunctions {
// 1. This method returns the distance between integers a and b
	public static int distance(int a, int b) {
		return Math.max(a, b) - Math.min(a, b); 
//		int x; 
//		int y; 
//		if (a > b) {
//			x = a;
//			y = b; 
//			return a - b; 
//		}
//		else  {
//			x = b; 
//			y = a;  
//			return b - a; 
//		}
//		
		
		
		
	}

// 2. This method returns the maximum value of integers a, and b. (the Java API may help.)
	public static int maximum(int a, int b) {
		return Math.max(a, b); 
//		if (a > b) {
//			return a; 			
//		}
//		else {
//			return b; 
//		}
		
	}
// 3. This method returns the maximum value of double values a,b,c. (the Java API may help.)

	public static double maximum(double a, double b, double c) {
		return Math.max(Math.max(a, b), Math.max(b, c)); 
//		double x = 0; 
//		double y = 0; 
//		if (a > b) {
//			x = a;
//		}
//		else  {
//			x = b; 			
//		}
//		
//		if (b > c) { 
//			y = b; 
//			
//		}
//		else {
//			y = c; 		
//		}
//		
//		if (x > y) {
//			return x; 
//		}
//		else { 
//			return y; 
//		}	
//		
		
	}

// 4. This method will return a random integer between 9 and 12 (inclusive) (the Java API may help.)

	public static int getRandomClass() {
		return (int)(Math.random() * (12 - 9 + 1) + 9); 
		// 			* (high - low + 1)  this is the range (finds the range) + low)
		//		**Remeber to cast to an int as Math.random is values between 0.0 - 1.0 (which are doubles)
	}

// 5. This method will return the surface area of a sphere with given radius
// SA = 4PIr�
	public static double sphereSurfaceArea(int radius) {
		return 4.0 * Math.PI * Math.pow(radius, 2); 
		//make sure to cast
	}

// 6. This method will return the volume of a sphere with given radius
// V = 4/3PI r^3
	public static double sphereVolume(int radius) {
		return ((double)4 / 3) * Math.PI * Math.pow(radius, 3); 
		//		Make sure to cast 4 as 4 / 3 is int division and you're loosing precision 
	}

// 7. This method will return the length of the hypotenuse of a right
// triangle
// with legs leg1 and leg2
	public static double hypotenuse(double leg1, double leg2) {
		return Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2)); 
		//return Math.hypot(leg1, leg2); 
		
	
	}
	
//	/8.
//
//	This method will return
//	the length
//	of Segment AB

// Refer to java&#39;s Point class (the Java API may help.)
	public static double segmentLength(Point a, Point b) {
		double x1 = a.getX(); 
		double y1 = a.getY(); 
		double x2 = b.getX(); 
		double y2 = b.getY(); 
//		
		return Math.sqrt(Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2))); 
//		 sqrt (x2 - x1)2 + (y2 -y1)2
//		return Math.sqrt((Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2)));
	}

// 9. this method will find the smallest angle (in degrees) of a right
// triangle with with base and height leg1 and leg2 (the Java API may help.)
	public static double getSmallestAngleOfRightTri(double leg1, double leg2) {	
		if (leg1 < leg2) return  Math.toDegrees(Math.atan(leg1 / leg2)); //atan is the inverse function of tan theta
		return Math.toDegrees(Math.atan(leg2 / leg1));
		
		

//		double degree1 = Math.toDegrees(Math.atan(Math.max(leg1, leg2) / Math.min(leg1, leg2)); 
//		double degree2 = 180 - (90 + degree1);
//
//		if (degree1 < degree2) {
//			return degree1; 
//		} else {
//			return degree2; 
//		}
				
		
		
	}

// 10. This method will round x to the nearest hundredPlace
// roundToHundredPlace(1297) =======&gt; 1300
	public static int roundToHundredPlace(int x) {
		return (int)(((double) x / 100) + 0.5) * 100; 
	}

// 11. This method will round x to the nearest hundredthPlace
// roundToHundredthPlace(12.9756) =======&gt; 12.98
	public static double roundToHundredthPlace(double x) {
		return (int)((x * 100) + 0.5) / 100.0;  
	}
	public static void main(String[] args) {
//     	System.out.println("1. DISTANCE: " + distance(-5, 8));
//		System.out.println("2. MAX: " + maximum(-5, 8));
//		System.out.println("3. MAX: " + maximum(-5, -8, -2));
//		System.out.println("4. Random HS Class: " + getRandomClass());
//		System.out.println("5. Sphere Surface Area: " + sphereSurfaceArea(9)
//		+ " sq. units");
//
//		System.out.println("6. Sphere Volume: " + sphereVolume(2)
//		+ " cubic units");
//
//		System.out.println("7. Hypotenuse: " + hypotenuse(7, 9));
		System.out.println("8. Segment Length: "
		+ segmentLength(new Point(1, 3), new Point(-2, 7)));
//
//		System.out.println("9. Smallest Acute Angle: "
//		+ getSmallestAngleOfRightTri(5, 7));
//		System.out.println("10. Round To Hundred Place: "
//		+ roundToHundredPlace(1297));
//		System.out.println("11. Round To Hundredth Place: "
//		+ roundToHundredthPlace(12.9756));
	}

	/*
	 * OUTPUT 1. DISTANCE: 13 2. MAX: 8 3. MAX: -2.0 4. Random HS Class: 11 5.
	 * Sphere Surface Area: 1017.8760197630929 sq. units 6. Sphere Volume:
	 * 33.510321638291124 cubic units 7. Hypotenuse: 11.40175425099138 8. Segment
	 * Length: 5.0 9. Smallest Acute Angle: 35.53767779197438 10. Round To Hundred
	 * Place: 1300 11. Round To Hundredth Place: 12.98
	 */
}