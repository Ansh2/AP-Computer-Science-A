package ObjectsAndMethods;

public class BankAccount {
	
	private String AccNum; 
	private double Balance; 
	
	
	public BankAccount () {
		this.AccNum = AccNum; 
		this.Balance = Balance; 
	}
	
	public BankAccount (String num, double amount) {
		this.AccNum = num; 
		this.Balance = amount;
		
	}
	
	public String getAccNum() {
		return AccNum;
	}


	public void setAccNum(String accNum) {
		AccNum = accNum;
	}



	public double getBalance() {
		return Balance;
	}



	public void setBalance(double balance) {
		Balance = balance;
	}
	

	public String depositMoney(double value) {
		double totalwithdeposit = Balance + value; 
		return "Total balance with deposit = " + totalwithdeposit; 
		
		
	}
	public String withdrawMoney(double value) {
		double totalwithwithdraw = Balance - value; 
		return "Total balance with the withdraw = " + totalwithwithdraw; 
		
	}
	public String percentage(double value) {
		value /= 100; 
		double realpercent = Balance + (value * Balance); 
		return "Total balance with interest = " + realpercent;
	}

	
    @Override
	public String toString() {
		
		return "This Bank Account has a balance of " + Balance + " and account number" + AccNum;
		
	}
	
	
	
	public static void main(String[] args) {
		BankAccount one = new BankAccount(); 
		BankAccount two = new BankAccount("999", 500 ); 
		System.out.println(one.getAccNum());
		System.out.println(one.getBalance());
		System.out.println(one.toString());
		System.out.println(two);
		System.out.println(two.depositMoney(55));
		System.out.println(two.withdrawMoney(23));
		System.out.println(two.percentage(5));
		
		
	}

}
