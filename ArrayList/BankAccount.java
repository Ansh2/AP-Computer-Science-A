package ArrayList;

public class BankAccount {
	
	private int accountNumber; 
	private double balance; 
	
	
	public BankAccount(int anAccountNumber) {
		this.accountNumber = anAccountNumber; 
		balance = 0; 
		
	}
	public BankAccount(int anAccountNumber, double initialBalance) {
		accountNumber = anAccountNumber; 
		this.balance = initialBalance; 
		
	}

	public int getAccountNumber() {
		return this.accountNumber; 
	}
	
	public double getBalance() {
		return this.balance; 
	}
	
	public void deposit(double amount) {
		balance += amount; 
		
	}
	
	public void withdraw(double amount) {
		balance -= amount; 
	}
	
	public String toString() {
		return "Account Number: " + accountNumber + "\t\tBalance: " + balance;
	}
	
	
	
	
	
}
