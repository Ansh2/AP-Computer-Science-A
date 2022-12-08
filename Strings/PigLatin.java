package Strings;

public class PigLatin {
	
	private String englishPhrase;  

	public PigLatin() {
		this.englishPhrase = "I like my apples, bananas, and ice cream "; 
	}						
	
		
	public String getWord(int start, int end, String copy) {
		
		return copy.substring(start, end);
		
	}
	
	public void trimPunctuation() {
		String punctuation = ".,/;:_-+=?!@'#$%^&*()\"";
		for (int i = 0; i < englishPhrase.length(); i++) {
			if (punctuation.contains(englishPhrase.substring(i, i + 1))) {
				englishPhrase = englishPhrase.substring(0, i) + englishPhrase.substring(i + 1); 
			}
		}
		
	}
	
	
	
	public String translate() {
		trimPunctuation(); 
		String vowels = "aeiouAEIOU";
		String copy = englishPhrase;
		String finall = ""; 
		int locationofspace = 0; 
		String word = "";
		

		while (copy.length() > 0) {
			
			locationofspace = copy.indexOf(" "); 

			word = getWord(0, locationofspace, copy); 

			if (vowelLocation(word) == -1) {  //Part 1
				finall += noVowel(word) + " "; 
			
	
			} else if(vowelLocation(word) == 0) { //Part 2
				finall += yesVowel(word) + " "; 
				
			} else { //Part 3
				finall += betweenVowel(word, vowels) + " "; 
				
				
			}
			copy = copy.substring(copy.indexOf(" ") + 1, copy.length());
			}
			
		
		return finall; 
		

	}
	
	public int vowelLocation(String word) { 
		
		String vowels = "aeiouAEIOU";
		
		for (int i = 0; i < word.length(); i++) {
			String temp = word.substring(i, i +1); 
			if (vowels.indexOf(temp) > -1) {
				return i; 
			} 
			
		}
		return -1; 
		
	}
	
	public String noVowel(String word1) {

		word1 = word1.trim() + "ay";
		return word1; 
			
		
	}
	
	public String yesVowel(String word1) {
		
		word1 = word1.trim() + "way";
		return word1; 
	}
	
	public String betweenVowel(String word1, String vowels) {
		
		String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
		boolean wordIsUpperCase = capital.contains(word1.substring(0, 1)); 
		word1 = word1.toLowerCase().trim();
		
		String specificvowel = ""; 
			
		for (int i = 0; i < word1.length(); i++) {
			if (vowels.contains(word1.substring(i, i+1))) {
				specificvowel = word1.substring(i , i+1); 
				break; 
			}
		}
		String start = word1.substring(0, word1.indexOf(specificvowel));
		String end = word1.substring(word1.indexOf(specificvowel));
		String together = end + start + "ay"; 
		
		if (wordIsUpperCase == false) {
			return together; 
		} else {
			return end.toUpperCase() + start.toLowerCase() + "ay";
		}
		
			
	}


	public static void main(String[] args) {
		PigLatin one = new PigLatin(); 
		System.out.println(one.translate());

		
	}
	

}
