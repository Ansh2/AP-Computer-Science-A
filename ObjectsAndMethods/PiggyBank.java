package ObjectsAndMethods;

public class PiggyBank {
	
	private int pennies; 
	private int nickels; 
	private int dimes; 
	private int quarters; 
	
	public PiggyBank(int p, int n, int d, int q) {
		this.pennies =  p; 
		this.nickels = n; 
		this.dimes = d; 
		this.quarters = q;
	}

	public int getPennies() {
		return pennies;
	}

	public void setPennies(int pennies) {
		this.pennies = pennies;
	}

	public int getNickels() {
		return nickels;
	}

	public void setNickels(int nickels) {
		this.nickels = nickels;
	}

	public int getDimes() {
		return dimes;
	}

	public void setDimes(int dimes) {
		this.dimes = dimes;
	}

	public int getQuarters() {
		return quarters;
	}

	public void setQuarters(int quarters) {
		this.quarters = quarters;
	}
	
	
	public double conversion() {
		double total = (0.01 * pennies) + (0.05 * nickels) + (0.10 * dimes) + (0.25 * quarters);
		return total; 
	}
	
	public void combinePiggy(PiggyBank two) {
		this.pennies += two.getPennies();
		two.pennies = 0;
		this.nickels += two.getNickels(); 
		two.nickels = 0; 
		this.dimes += two.getDimes(); 
		two.dimes = 0; 
		this.quarters += two.getQuarters(); 
		two.quarters = 0; 
		
	}

	public String toString() {
		return getPennies() + " pennies " + getNickels() + " nickels " + getDimes() + " dimes "  + getQuarters() + " quarters \nTotal = $" + conversion(); 
		
	}
	

}
