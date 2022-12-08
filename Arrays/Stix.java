package Arrays;

public class Stix {
	
	private Segment[] handful;
	
	public Stix() { //delcare the array variables
		
		
		handful = new Segment[4]; //instantiate the Segment array with a size
		handful[0] = new Segment ("AB", 1, 4, 6, 3); //populate the array with segment objects
		handful[1] = new Segment("BC", 6, 3, 5, 0);
		handful[2] = new Segment("CD", 5, 0, 2, 2); 
		handful[3] = new Segment("DA", 2, 2, 1, 4); 
	}

	public String toString() {
		String output = ""; 		
		for (int i = 0; i < handful.length; i ++) {
			output += (handful[i] + "\n"); 
		}
		
		return output; 
	}
	
	public double getSegLength(String input) {
		for (int i = 0 ; i < handful.length; i++) {
			if (handful[i].getName().equals(input)) {
				return handful[i].getLength(); 
			}
		}
		System.out.println("Sorry, the segment " + input + " is not here");
		return 0; 
	}
	
	public double sumOfLengths(String input1, String input2) {
		double sum = 0; 
		
		for (int i = 0; i < handful.length; i++) {
			if (handful[i].getName().equals(input1) || handful[i].getName().equals(input2)) { //remeber that you can use or & and conditions
				sum += handful[i].getLength(); 	
			}	
		}
		
		return sum; 
		
	}
	
	
	public static void main(String[] args) {
		
		Stix one = new Stix(); 
		System.out.println(one); //this will give you hexadecimal 		
		System.out.println("The length of CD is " + one.getSegLength("CD"));
		System.out.println("The sum of the lengths of AB and BC is: " + one.sumOfLengths("AB", "BC"));
	}
	
}
