package ObjectsAndMethods;

public class Car {

	private int yearModel;
	private String make;
	private int speed;

	public Car(int ym) {
		this.yearModel = ym;
	}

	public int getYearModel() {
		return yearModel;
	}

	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int accelerate() {
		speed += 5;
		return speed;
	}

	public int brake() {
		speed -= 5;
		return speed;
	}

	public String toString() {
		return "Current speed = " + speed;
	}

	public static void main(String[] args) {

		System.out.println("This is when the car accelerates - ");
		System.out.println();
		
		Car one = new Car(0);
		System.out.println(one.toString());
		one.accelerate();
		System.out.println(one);
		one.accelerate();
		System.out.println(one);
		one.accelerate();
		System.out.println(one);
		one.accelerate();
		System.out.println(one);
		one.accelerate();
		System.out.println(one);

		System.out.println();
		System.out.println("This is when the brake is applied - ");
		System.out.println();
		
		one.brake();
		System.out.println(one);
		one.brake();
		System.out.println(one);
		one.brake();
		System.out.println(one);
		one.brake();
		System.out.println(one);
		one.brake();
		System.out.println(one);

	}

}
