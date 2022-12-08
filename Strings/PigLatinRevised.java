package Strings;

public class PigLatinRevised {

	private String english;

	public PigLatinRevised(String s) {
		english = s;

	}

	public String firstWord() {
		int end = english.indexOf(" ");
		String firstWord = english.substring(0, end + 1);
		english = english.substring(end + 1);

		return firstWord;
	}

	public String translateWord() {
		String vowels = "aeiou";
		String word = firstWord();
		String w = word;
		word = word.toLowerCase();
		String output = "";

		if (vowelLocation(word) == -1) {
			output = word.trim() + "ay";
		} else if (vowels.contains(word.substring(0, 1))) {
			output = word.trim() + "way";
		} else {
			word = word.trim();
			String start = word.substring(0, vowelLocation(word));
			String end = word.substring(vowelLocation(word));
			output = (end + start + "ay").toLowerCase();
			if (w.substring(0, 1).equals(w.substring(0, 1).toUpperCase())) {
				end = end.toUpperCase();
				start = start.toLowerCase();
				output = end + start + "ay";
			}
		}

		return output;

	}

	public static int vowelLocation(String s) {
		String vowels = "aeiouAEIOU";
		for (int i = 0; i < s.length() - 1; i++) {
			if (vowels.contains(s.substring(i, i + 1))) {
				return s.indexOf(s.substring(i, i + 1));
			}
		}

		return -1;
	}

	public String translate() {
		String output = "";
		while (english.contains(" ")) {
			output += translateWord() + " ";
		}
		if (english.length() > 0) {
			String end = english.substring(english.length() - 1, english.length());
			english = english.substring(0, english.length() - 1) + " ";
			output += translateWord() + end;
		}

		return output;
	}

	public static void main(String[] args) {
		PigLatinRevised one = new PigLatinRevised("Meg's socks are stinky ");
		System.out.println(one.translate());
	}

}
