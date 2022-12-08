package ObjectsAndMethods;

public class RetailItem {

	private String description;
	private int unitsOnHand;
	private double price;

	public RetailItem(String desc, int units, double pri) {
		this.description = desc;
		this.unitsOnHand = units;
		this.price = pri;

	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUnitsOnHand() {
		return unitsOnHand;
	}

	public void setUnitsOnHand(int unitsOnHand) {
		this.unitsOnHand = unitsOnHand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {

		return "\t" + description + "\t\t" + unitsOnHand + "\t\t" + price;
	}

	public String toString2() {

		return "\t" + description + "\t" + unitsOnHand + "\t\t" + price;
	}

	public String toString3() {

		return "\t" + description + "\t\t" + unitsOnHand + "\t\t" + price;
	}

	public static void main(String[] args) {
		RetailItem one = new RetailItem("Jacket", 12, 59.95);
		RetailItem two = new RetailItem("Designer Jeans", 40, 34.95);
		RetailItem three = new RetailItem("Shirt", 20, 24.95);

		System.out.println("\t\tDescription\tUnits On Hand\tPrice");
		System.out.println();
		System.out.println("Item #1\t" + one.toString());
		System.out.println();
		System.out.println("Item #2\t" + two.toString2());
		System.out.println();
		System.out.println("Item #3\t" + three.toString3());

	}
}