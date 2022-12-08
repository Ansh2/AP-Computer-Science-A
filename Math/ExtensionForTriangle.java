package Math;

import java.awt.geom.Point2D;

public class ExtensionForTriangle {
	
	private Point2D.Double a, b, c; 
	private double xa, ya, xb, yb, xc, yc; 
	private double ab, bc, ac, anglea, angleb, anglec; 

//	//
//	public String getCircumference() {
////		myPoint midpointAB = myPoint.midpoint(new myPoint(xa, ya), new myPoint(xb, yb)); 
//		double slopeAB = myPoint.slope(new myPoint(xa, ya), new myPoint(xb, yb)); 
//		double slopeAC = myPoint.slope(new myPoint(xc, yc), new myPoint(xa, ya)); 
//		
//		double a = -1 * slopeAB; 
//		double b = 1; 
//		double c = slopeAB * (xa - ya); 
//						
//		double a1= -1 * slopeAC; 
//		double b1 = 1; 
//		double c1 = slopeAC * (xc - yc);
//		
//		LinearEQ solAB2 = new LinearEQ(a1, b1, c1); 
//		
//		double xsolAB = solAB2.xSol(new LinearEQ(a, b, c));
//		
//		double ysolAB = solAB2.ySol(new LinearEQ(a, b, c)); 
//
//				
//		return "The circumcenter lies at     " + "(" + xsolAB + ", " + ysolAB + ")"; 
// 	}
//	
//	public String getCentroid() {
//		//FORMULA 
//		double xcent = (xa + xb + xc) / 3; 
//		double ycent = (ya + yb + yc) / 3;  
//		return "The centriod lies at         " + "(" + roundHundreths(xcent) + ", " + roundHundreths(ycent) + ")"; 
//	}
//	public String getOrthocenter() {
//		
//		double slopeAB = myPoint.slope(new myPoint(xb, yb), new myPoint(xa, ya)); 
//		double perpendicularCF = (-1.0 / slopeAB); 
//		
//		double slopeBC = myPoint.slope(new myPoint(xc, yc), new myPoint(xb, yb)); 
//		double perpendicularAD = (-1.0 / slopeBC); 
//		
//		
//		double a = -perpendicularCF; 
//		double b = 1; 
//		double c = perpendicularCF * (xa - ya); 
//		
//		double a1= -perpendicularAD; 
//		double b1 =1; 
//		double c1 = perpendicularAD * (xa - ya);
//		
//		LinearEQ sol2 = new LinearEQ(a1, b1, c1); 
//		
//		double xsol = sol2.xSol(new LinearEQ(a, b, c)); 
//		
//		double ysol =  sol2.ySol(new LinearEQ(a, b, c)); 
//			
//		return "The orthocenter lies at      " + "(" + xsol + ", " + ysol + ")"; 
//		
//	}
//	

	

	
	
	//(x, y) = ((ax*tan(α) + bx*tan(β) + cx*tan(γ))/(tan(α) + tan(β) + tan(γ),
   // (ay*tan(α) + by*tan(β) + cy*tan(γ))/(tan(α) + tan(β) + tan(γ))
	

//public static String pointSlopeForm(myPoint first, myPoint second) { //Sending implictly and exlipcitly 
//	double xValue = first.getMyX(); 
//	double yValue = first.getMyY();
//	double xValue2 = second.getMyX(); 
//	double yValue2 = second.getMyX(); 
//	double slope = myPoint.slope(first, second);
//	double roundedslope = (int)(slope * 100 + 0.5) / 100.0;
//		
//	if (xValue < 0) {
//		return "y - " + yValue + " = " + roundedslope + "(x + " + Math.abs(xValue) + ")"; 
//	} else if (yValue < 0) {
//		return "y + " + Math.abs(yValue) + " = " + roundedslope + "(x - " + xValue + ")"; 
//	} else if (xValue < 0 && yValue < 0) {
//		return "y + " + yValue + " = " + roundedslope + "(x + " + xValue + ")"; 		
//	} else  {
//		return "y - " + yValue + " = " + roundedslope + "(x - " + xValue + ")"; 
//	}
//		
//	
//}



}
