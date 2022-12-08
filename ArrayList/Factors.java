package ArrayList;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Factors
{
	public static ArrayList<Integer> getListOfFactors(int number) {
		ArrayList<Integer> temp = new ArrayList<Integer>(); 
		for (int i = 1; i < number; i++) {
			if (number % i == 0 && i != number && i != 1) {
				temp.add(i); 
			}
		}
		
		return temp; 
	}
	
	public static void keepOnlyCompositeNumbers( List<Integer> nums ) {
		for (int i = 0; i < nums.size(); i ++) {
			while (getListOfFactors(nums.get(i)).size() == 0) {
				nums.remove(i); 
				if (i == nums.size() ) {
					break; 
				}
			}
		}		
	}
}

