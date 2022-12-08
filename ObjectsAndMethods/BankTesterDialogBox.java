package ObjectsAndMethods;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;



public class BankTesterDialogBox {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("InputDialog Example #1");
		
		String pennies = JOptionPane.showInputDialog("Enter pennies for Bank #1:");
		String nickels = JOptionPane.showInputDialog("Enter nickels for Bank #1:"); 
		String dimes = JOptionPane.showInputDialog("Enter dimes for Bank #1:"); 
		String quarters = JOptionPane.showInputDialog("Enter quarters for Bank #1: "); 
		
		int p = Integer.parseInt(pennies); 
		int n = Integer.parseInt(nickels); 
		int d = Integer.parseInt(dimes); 
		int q = Integer.parseInt(quarters); 
		
		PiggyBank one = new PiggyBank(p, n, d, q); 
		
		
		String pennies2 = JOptionPane.showInputDialog("Enter pennies for Bank #2:");
		String nickels2 = JOptionPane.showInputDialog("Enter nickels for Bank #2:"); 
		String dimes2 = JOptionPane.showInputDialog("Enter dimes for Bank #2:"); 
		String quarters2 = JOptionPane.showInputDialog("Enter quarters for Bank #2:"); 
		
		int p2 = Integer.parseInt(pennies2); 
		int n2 = Integer.parseInt(nickels2); 
		int d2 = Integer.parseInt(dimes2); 
		int q2 = Integer.parseInt(quarters2); 
		
		PiggyBank two = new PiggyBank(p2, n2, d2, q2); 
		

		JOptionPane.showMessageDialog(null, "Total Before Combine (Bank #1) = " + one , "PiggyBank", 1);
		JOptionPane.showMessageDialog(null, "Total Before Combine (Bank #2) = " + two, "PiggyBank", 1);
	
		one.combinePiggy(two); 
		

		JOptionPane.showMessageDialog(null, "Total After Combine (Bank #1) = " + one , "PiggyBank", 1);
		JOptionPane.showMessageDialog(null, "Total After Combine (Bank #2) = " + two, "PiggyBank", 1);
		
	
		
		
		
	}	
	
	

}
