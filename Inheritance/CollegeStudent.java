package Inheritance;

public class CollegeStudent extends Student {

	private String major; 
	private String dorm; 
	
	
	public CollegeStudent(String name, int age, String gender, String idNum, double GPA, String major, String dorm) {
		super(name, age, gender, idNum, GPA); //super has to be first line
		this.major = major; 
		this.dorm = dorm; 
		
	}
	
	public String toString() {
		return super.toString() + ", major: " + major + ", dorm: " + dorm; 
	}
	//this is a check that helps coders that lets coders now that there is another method of the same parameter list in the superclass. 
	@Override	
	public String distinction() {
		String OnDiploma = ""; 
		if (getMyGPA() >= 3.5 && getMyGPA() <= 3.8)
//			OnDiploma = "cum "; 
		    OnDiploma = "honors"; 
		else if (getMyGPA() > 3.8) 
//			OnDiploma = "magna cum laude"; 
		    OnDiploma = "high honors"; 
		
		return OnDiploma;
	}

	//polymorphisms - ability to have multiple things to do someting 
	//poly - means multiple 
	//morphoism - change 

}
