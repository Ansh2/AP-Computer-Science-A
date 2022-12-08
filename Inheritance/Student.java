package Inheritance;

public class Student extends Person {

	private String myIdNum; 
	private double myGPA; 
	
	public Student(String name, int age, String gender, String idNum, double GPA) {
		super(name, age, gender); 
		myIdNum = idNum; 
		myGPA = GPA; 
		
	}

	public String getMyIdNum() {
		return myIdNum;
	}

	public void setMyIdNum(String myIdNum) {
		this.myIdNum = myIdNum;
	}

	public double getMyGPA() {
		return myGPA;
	}

	public void setMyGPA(double myGPA) {
		this.myGPA = myGPA;
	}
	
	
	public String distinction() {
		String OnDiploma = ""; 
		if (getMyGPA() >= 3.0 && getMyGPA() <= 3.5)
			OnDiploma = "honors"; 
		else if (getMyGPA() > 3.5) 
			OnDiploma = "high honors"; 
		
		return OnDiploma;
	}
	
	public String toString() {
		return super.toString() + ", student id: " + myIdNum + ", GPA: " + myGPA; 
	}
	
	
	
}
