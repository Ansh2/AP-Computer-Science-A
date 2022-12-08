package TwoDimArray;


public class GridRunner {
	
	public static void main(String[] args) {
		
		String[] vals = {"a", "b", "c", "7", "9", "x", "2"};
		Grid one = new Grid(25, 25, vals); 
		System.out.println(one); 
//		for (int i = 0; i < vals.length; i++) {
//			System.out.println(vals[i] + " count is " + one.countVals(vals[i]));
//		}
//		System.out.println();
		System.out.println(one.findMax(vals) + " occurs the most.");
	
		System.out.println();
	
		one.mostSurrounded(); 
	
	}

	
		
		
		
		
}

