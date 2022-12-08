package Arrays;
import java.util.*;

public class Scramble {

	public static String scrambleWord(String word) {
		  String temp = "";
		  if (word.length() > 1) {
		    for (int i = 0; i < word.length() - 1; i++) {
		          if (word.substring(i, i+1).equals("A") && !(word.substring(i + 1, i+2)).equals("A")) {
		                 temp = word.substring(0, i) + word.substring(i + 1, i +2) + word.substring(i, i +1); 
		             } 
		     } 
		   }

		return temp; 
		}

		public static void scrambleOrRemove(List <String> wordList) {
		     for (int i = wordList.size() - 1; i >= 0;  i++) {
		           if (scrambleWord(wordList.get(i)).equals(wordList.get(i))) {
		                wordList.remove(i); 
		           } else {
		                wordList.set(i, scrambleWord(wordList.get(i))); 
		           } 
		    } 
		} 

	
	public static void main(String[] args) {
		
	String[] words = {"TAN", "ABRACADABRA", "WHOA", "AARDVARK", "EGGS", "A", ""};
	for (int i = 0; i < words.length; i++)
		System.out.println(scrambleWord(words[i]));
	
	String[] words2 = {"TAN", "ABRACADABRA", "WHOA", "APPLE", "EGGS",};
	List <String> list = new ArrayList<String>(Arrays.asList(words2));
	System.out.println(list);
	scrambleOrRemove(list);
	System.out.println(list);

	}

}