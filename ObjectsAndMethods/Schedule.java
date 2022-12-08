package ObjectsAndMethods;

public class Schedule {

	String name;
	int period;

	public Schedule(int period, String name) {
		this.name = name;
		this.period = period;

	}

	public String toString() {
		String sentence = "Period: " + this.period + "\t\tClass: " + this.name;
		return sentence;
		
	
	}
	
	
	
	public static void main(String[] args) {
		Schedule FirstClass = new Schedule(1, "AP Computer Science A");
		Schedule SecondClass = new Schedule(2, "Pre-Calculus");
		Schedule ThirdClass = new Schedule(3, "Language Arts");
		Schedule FourthClass = new Schedule(4, "American Studies");
		Schedule FifthClass = new Schedule(5, "Chemistry");
		Schedule SixthClass = new Schedule(6, "Physics");
		Schedule SeventhClass = new Schedule(7, "Geomtry");
		Schedule EighthClass = new Schedule(8, "World Language");

		System.out.println(FirstClass);
		System.out.println(SecondClass);
		System.out.println(ThirdClass);
		System.out.println(FourthClass);
		System.out.println(FifthClass);
		System.out.println(SixthClass);
		System.out.println(SeventhClass);
		System.out.println(EighthClass);

	}

}
