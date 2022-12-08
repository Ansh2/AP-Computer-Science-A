package Recursion;
import static java.lang.System.*;

public class Chickens
{
	public static int countChickens(String word)
	{
		
		if (!(word.contains("chicken"))) {
			return 0; 
		}
		return 1 + countChickens(word.substring(0,word.indexOf("chicken")) + word.substring(word.indexOf("chicken") + 7)); 
	}
	
	public static void main(String[] args) {
		System.out.println(countChickens("itatfun"));
		System.out.println(countChickens("itatchickenfun"));
		System.out.println(countChickens("chchickchickenenicken"));
		System.out.println(countChickens("chickchickfun"));
		System.out.println(countChickens("chickenbouncetheballchicken")); 
	}
}