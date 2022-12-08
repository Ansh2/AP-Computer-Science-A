package Arrays;

public class Reservation {
	private String name; // last name of the person reserving the room
	private double rate; // room rate for 1 night&#39;s stay

	public Reservation() {
		name = "Lepold";
		rate = 99.99;
	}

	public Reservation(String myName, double myRate) {
		name = myName; 
		rate = myRate;
		
	}

	public double getRate() {
		return rate;
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getName() {
		return name; 
	}

	public String toString() {
		
		return name + "\t" + rate; 		
	
	}
}