package Strings;

import java.util.Random;

public class StringFuncts {
	
	// 1.This method will return an email address in the form
	// first.last@ww-p.org
	// getEmail("Mister", "Scarpitta") ====>; Mister.Scarpitta@ww-p.org
	public static String getEmail(String first, String last) {
		return first + "." + last +"@ww-p.org"; 

	}

	// 2. This method will return initials with periods.
	// getInitials("Mister", "Scarpitta") ====>; M.S.
	public static String getInitials(String first, String last) {
		return 	first.substring(0, 1) + "." + last.substring(0, 1) + "."; 

	}

	// 3. This method will parse the year from a birthdate
	// in the form MMDDYYYY
	// getYear("01021916) ====>; 1916
	public static String getYear(String bday) {
		return bday.substring(4, 8); 
	

	}

	// 4. This method will return a lower case
	// user name in the form of first 3 letters of first name and
	// last 4 letters of last name.
	// getUserName(&quot;Mister&quot;, &quot;Scarpitta&quot;) ====&gt; misitta
	public static String getUserName(String first, String last) {
		return first.toLowerCase().substring(0, 3) + last.toLowerCase().substring(last.length() - 4, last.length()); 
		
	}
	// 5. This method will parse the first name from a full name separated with
	// a space
	// getFirst(&quot;Mister Scarpitta&quot;) ====&gt; Mister
	public static String getFirst(String fullName) {
		return fullName.substring(0, fullName.indexOf(" ")); 
		
	}
	// 6. This method will parse the last name from a full name separated with a
	// space
	// getLast(&quot;Mister Scarpitta&quot;) ====&gt; Scarpitta
	public static String getLast(String fullName) {
		return fullName.substring((fullName.indexOf(" ") + 1), fullName.length()); 
	}
	
	// 7. This will return a random 4 letter string of letters
	// getRandomWord() ====&gt; CDRT
	public static String getRandomWord() {
		Random rand = new Random(); 
		//Unicode (65 - 90) ALL CAPS
		String y = ""; 
		for (int i = 1; i <= 4; i++) {
			y += (char)(rand.nextInt(26) + 65);
		}
		return y; 
				
	}
	// 8. This will return a new word of every other letter
	// everyOtherLetter(&quot;PIRATES&quot;) ====&gt; PRTS
	public static String everyOtherLetter(String word) {
		char consecutive = ' '; 
		String finale = ""; 
		for (int i = 0; i <= (word.length() - 1); i += 2) {
			consecutive = (word.charAt(i)); 
			finale += consecutive; 
		}
		return finale; 
		
	}
	// 9. This will return a new word that is the reverse.
	// reverse(&quot;PIRATES &quot;) ====&gt; SETARIP
	public static String reverse(String word) { 
		char current = 'x';
		String finall = ""; 
		for (int i = word.length() - 1; i >= 0; i--) {
			current = word.charAt(i); 
			finall += current; 
		}
		return finall;  
		
	}

	// 10. This will return true if the sum of the first digit and the last
	// digit is divisible by 5.
	// checkDigit(&quot;123456789&quot;) ====&gt; TRUE
	// checkDigit(&quot;12345543211&quot;) ====&gt; FALSE
	// checkDigit(&quot;87878787&quot;) ====&gt; TRUE
	public static Boolean checkDigit(String creditCard) {
		int combine = Integer.parseInt(creditCard.substring(0, 1)) + Integer.parseInt(creditCard.substring(creditCard.length() - 1, creditCard.length())); 
		return combine % 5 == 0;
		
	}
	// 11. This will return a string where every other letter is capitalized
	// everyOtherLetterCaps(&quot;misterscarpitta&quot;) ====&gt; mIsTeRsCaRpItIa
	public static String everyOtherLetterCaps(String word) {
		String revisedword = ""; 
		for (int i = 0; i <= word.length() - 1; i++) {
			if (i % 2 != 0 ) { 
				revisedword += word.substring(i, i+1).toUpperCase(); 
			} else {
				revisedword += word.substring(i, i+1); 	
			}
		}
		return revisedword; 
		
	}
	// 12. This will return a string where every i is replaced with an 8
	// replacesIsWith8s(&quot;WilliamScarpitta&quot;) ====&gt; W8ll8amScarp8tta
	public static String replaceIsWith8s(String word){ 
	    String newword = ""; 
		for (int i = 0; i <= word.length() - 1; i++) {
			if (word.charAt(i) == 'i') {
				newword += '8'; 
			} else {
				newword += word.substring(i, i+1); 
			}
				
		}
		return newword; 
	}
				
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("1. Email: " + getEmail("Mister", "Scarpitta"));
	System.out.println("2. Initials: " + getInitials("Mister", "Scarpitta"));
	System.out.println("3. Year: " + getYear("01021916"));
	System.out.println("4. UserName: " + getUserName("Mister", "Scarpitta"));
	System.out.println("5. FirstName: " + getFirst("Mister Scarpitta"));
	System.out.println("6. LastName: " + getLast("Mister Scarpitta"));
	System.out.println("7. RandomWord: " + getRandomWord());
	System.out.println("8. EveryOtherLetter: " + everyOtherLetter("PIRATES"));
	System.out.println("9A. Reverse: " + reverse("Philadelphia"));
	System.out.println("9B. Reverse: " + reverse("JAVA"));
	System.out.println("10A. CheckDigit: " + checkDigit("123456"));
	System.out.println("10B. CheckDigit: " + checkDigit("123456789"));
	System.out.println("11. EveryOtherCaps: " + everyOtherLetterCaps("misterscarpitta"));
	System.out.println("12. Replaces I's with 8's: " + replaceIsWith8s("WilliamScarpitta"));
	}
}

//	OUTPUT
//	1. Email: Mister.Scarpitta@ww-p.org
//	2. Initials: M.S.
//	3. Year: 1916
//	4. UserName: misitta
//	5. FirstName: Mister
//	6. LastName: Scarpitta
//	7. RandomWord: MOCQ
//	8. EveryOtherLetter: eccoeis
//	9A. Reverse: aihpledalihP
//	9B. Reverse: AVAJ
//	10A. CheckDigit: false
//	10B. CheckDigit: true
//	11. EveryOtherCaps: mIsTeRsCaRpItIa
//	12. Replaces I&#39;s with 8&#39;s: W8ll8amScarp8tta


