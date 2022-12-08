package ArrayList;

import java.util.ArrayList;

public class Bank {
	
	private ArrayList<BankAccount> accbank;
	
	public Bank() {
		accbank = new ArrayList<BankAccount>();
	}
	
	public void addAccount(BankAccount a) {
		accbank.add(a);
	}
	
	public int count(double atLeast) {
		
		int count = 0; 
		for (int i = 0; i < accbank.size(); i ++)  {
			if (accbank.get(i).getBalance() >= atLeast) {
				count++; 
			}
			
		}
		return count; 		
	}
	
	public BankAccount find(int accountNumber) {
		
		for (int i = 0; i < accbank.size(); i ++) {
			if (accbank.get(i).getAccountNumber() == accountNumber) {
				return accbank.get(i); 
			}
		}
		return null; 
		
	}

	
	public BankAccount getMaximum() {
		
		double max = accbank.get(0).getBalance(); 
		BankAccount temp = accbank.get(0);  
		for (int i = 1; i < accbank.size(); i ++) {
			if (accbank.get(i).getBalance() > max) {
				temp = accbank.get(i);
				max = accbank.get(i).getBalance(); 
			}
		}
		return temp; 
		
		
	}
	
	public double getTotalBalance() {
		double sum = 0; 
		
		for (BankAccount x: accbank) { 	
			sum += x.getBalance(); 
		}
		
		return sum; 
		
		
	}
	
	
}
