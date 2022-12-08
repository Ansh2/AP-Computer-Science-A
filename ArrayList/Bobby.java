package ArrayList;

import java.util.*; 

public class Bobby {
	
	public static void removeWords(ArrayList<String> list) {
		System.out.println("Old List: " + list + "\n\n");		
		int counter = 0; 
		//use the minus strucutre when removing things from an array list to not miss any elements
		for (int i = list.size() - 1; i > 0; i--) {
			 if (list.get(i - 1).compareTo(list.get(i)) > 0) {
				System.out.println("Bobby added " + list.get(i - 1));
				list.remove(i - 1);
				counter++;
			 }
		 }
		 if (counter == 0) 
			 System.out.println("The list is still in alphabetical order – I don’t know which word(s)\nBobby put in!");

		 
		 System.out.println("\n\nNew List: " + list);
		
	}
	
	
	public static void main(String[] args) {
//		String[] x = {"apple", "bob", "create", "monkey", "donut", "trunk", "elon"};
		String[] x = {"apple", "bob", "create",  "donut"};
		ArrayList<String> temp = new ArrayList<String>(Arrays.asList(x));
		removeWords(temp);
				

	}

}
