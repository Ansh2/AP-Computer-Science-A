package Arrays;

public class Segment {
	
	private int x1, x2, y1, y2; 
	private String name;
	private double length, slope; 
	
	public Segment(String name, int x1, int y1, int x2, int y2) {
		this.x1 = x1; 
		this.y1 = y1; 
		this.x2 = x2; 
		this.y2 = y2; 
		this.name = name; 
		length = (int)(100 * Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1) , 2))) / 100.0;
		slope = (int)(100 * (y2 - y1)/(double)(x2-x1)/100.0); 
	}
	
	

	
	
	public double getLength() {
		return length;
	}





	public void setLength(double length) {
		this.length = length;
	}





	public double getSlope() {
		return slope;
	}





	public void setSlope(double slope) {
		this.slope = slope;
	}





	public int getX1() {
		return x1;
	}





	public void setX1(int x1) {
		this.x1 = x1;
	}





	public int getX2() {
		return x2;
	}





	public void setX2(int x2) {
		this.x2 = x2;
	}





	public int getY1() {
		return y1;
	}





	public void setY1(int y1) {
		this.y1 = y1;
	}





	public int getY2() {
		return y2;
	}





	public void setY2(int y2) {
		this.y2 = y2;
	}





	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	


	public String toString() {
		return name + "\t(" + x1 + ", " + x2 + ")"
				 + "\t(" + x2 + ", " + y2 + ")" 
				 + "\tLength: " + length 
				+ "\tSlope: " + slope; 
				
		
	}
	
	

	public static void main(String[] args) {

		
		Segment one = new Segment("AB", 1, 1, 4, 2);
		System.out.println(one);
		
	}
}
