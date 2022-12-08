package Strings;

public class StringDoNow6 {
	
	
	public static String answer(String sentence) {
		//Range of 1 - 10 values ascii === 48 through 57 inclusive
		

		
		
		int sum = 0; 
		
		for (int i = 0; i <= sentence.length() - 1; i++) {
			if ((Integer.parseInt(sentence.substring(i, i+1))) >= 48 && (Integer.parseInt(sentence.substring(i, i+1))) <=57) {
				sum += Integer.parseInt(sentence.substring(i, i+1)); 
			}
			if (sentence.contains("how many")) {
				
				   
 
			}
		}
		
		return "Their are " + sum;
		
		
		
		
		
		
//		int firstnum; 
//		for (int i = 0; i<= x.length() - 1; i++) {
//			if ((int)(x.charAt(i)) >= 48 || (int)(x.charAt(i)) <=57) {
//				firstnum += (int)(x.charAt(i)); 
//				break;
//			}
//		}
//	
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println( answer("Her family contains 2 kids, she has 3, I have 0 kids")  );
		
	}

}
