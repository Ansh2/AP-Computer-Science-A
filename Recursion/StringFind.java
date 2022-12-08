package Recursion;

public class StringFind {
	
	public static Boolean find(String text, String str) {
		
		if (text.length() == 0) {
			return false; 
		}
		if (text.startsWith(str)) {
			return true; 
		}
		return StringFind.find(text.substring(1), str);
		
	}
	
	public static void main(String[] args) {
		System.out.println(StringFind.find("Mississippi", "sip"));
		System.out.println("Expected: true");
		System.out.println(StringFind.find("Mississippi", "sisip"));
		System.out.println("Expected: false");
		System.out.println(StringFind.find("shoe", "oe"));
		System.out.println("Expected: true");
	}

}
