package Strings;

import java.util.*;

public class Word {

		private String original;
		/**
		* constructs a Word with String value s
		* @param s is string value of Word
		*/
		public Word(String s)
		{
		original = s;
		}
		/**
		* reverses letters in original string
		* @return a string that is a reverse of original
		*/
		public String reverse() {  //Correct
			
			String reversed = ""; 
			for (int i = original.length() -1; i >= 0; i--) {
				reversed += original.substring(i, i+1); 
			}
			return reversed; 
			
		}
		/**
		* returns the number of non-space symbols/characters of a String
		*/
		public int getNonSpaceLength() {  //Correct
		
			int count = 0; 
			for (int i = 0; i <= original.length() - 1; i++) {
				if (original.substring(i, i+1).equalsIgnoreCase(" ")) {
					
				} else {
					count++; 
				}
			}
			return count; 
		}
		/**
		* determines is word is a palindrome
		* @return true if word is a palindrome, false otherwise
		*/
		public boolean isPalindrome() { //Correct
			if (reverse().equals(original)) 
				return true;
			return false; 
		}
		/**
		* Alternate method to determine if word is a palindrome
		* @return true if word is a palindrome, false otherwise
		*/
		public boolean isPalindrome2() {  //working
			boolean value = true; 
			int j = original.length() - 1; 
			for (int i = 0; i <= original.length() -1; i++) {
				if (original.substring(i, i+1).equals(original.substring(j, j+1))) {
					j--;  
				} else {
					value = false; 
				}
			}
			return value; 

		}
		/**
		* removes vowels in original string
		* @return a string that removes all of the vowels
		*/
		public String removeVowels() { //working
			String vowels = "aeiouAEIOU"; 
			String revised = ""; 
			for (int i = 0; i<= original.length() -1; i++) {
				if (vowels.contains(original.substring(i, i+1)) != true) {
					revised += original.substring(i, i+1); 
				}
			}
			return revised; 
		}

		/**
		* creates an anagram
		* @return a string that is a random anagram of the original word
		*/
		public String anagram()  { //working
			Random r = new Random(); 
			int shuffleint;   
			String revised = "";  
			String copy = original; 
			for (int i = 0; i < original.length(); i++) {
				shuffleint = r.nextInt(copy.length());
				revised += copy.substring(shuffleint, shuffleint + 1); 
				copy = copy.substring(0, shuffleint) + copy.substring(shuffleint + 1);
		
			} 
			return revised;
		}

		
		public static void main(String [] args) {
			
			Word one = new Word("abcd");  
			 
			System.out.println(one.reverse());
			System.out.println(one.getNonSpaceLength());
			System.out.println(one.isPalindrome()); 
			System.out.println(one.isPalindrome2());
			System.out.println(one.removeVowels());
			System.out.println(one.anagram());

			
		}

}

