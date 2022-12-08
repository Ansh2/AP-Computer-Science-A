package Strings;

public class StringDoNow5 {
	
	
	
	
	//Problem #12 a
	//String w = "Organization Team"; 
	//            0123456789
	
	public static String A(String input) {
		
		return input.substring(0,2).toLowerCase(); 
		
	}
	public static String B(String input) {
		
		return input.charAt(4) + input.substring(7, 12); 
	}
	public static String C(String input) {
		
		return input.substring(13).toUpperCase(); 
	}
	
	public static String lowerUpper(String word) {
			
		String newword = ""; 
		for (int i = 0; i<= word.length() -1; i++) {
			if ((int)word.charAt(i) >= 65 && ((int)word.charAt(i) <= 77)) {
				newword += word.substring(i, i+1).toLowerCase();
			} else if ((int)word.charAt(i) >= 110 && ((int)word.charAt(i) <= 122) ) {
				newword += word.substring(i, i+1).toUpperCase(); 
			} else {
				newword += word.charAt(i); 
			}
		}
		return newword; 
		
	}
	
	public static int vowelCount() {
		String vowels = "aeiou"; 
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(lowerUpper("Seven Cats"));
	}

}
