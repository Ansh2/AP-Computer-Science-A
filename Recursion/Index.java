package Recursion;
public class Index {



	/**
	 * Determines if a string exists in a phrase.
	 * 
	 */
	public static int indexOf(String text, String str)
	{
		return indexOf(text, str, 0); 
	}

	/**
	 * Determines if a string exists in a phrase.
	 * Helper method
	 */
	private static int indexOf(String p, String c, int x) {
		if (x >= p.length() - c.length() + 1) { 
			return -1; 
		}
		if (p.substring(x, x + c.length()).equals(c)) {
			return x; 
		}
		
		return indexOf(p, c, x+1); 
		
	}
	
}