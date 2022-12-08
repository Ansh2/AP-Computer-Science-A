package Inheritance;
public class Person {

	private String myName; // name of the person
	private int myAge; // person's age
	private String myGender; // your gender 
	
	//constructor
	//no-arg constructor (not defualt constructor)
	public Person() { 
		// all default values will be assigned to myName, myAge, myGender; 
		this.myName = myName; 
		this.myAge = myAge; 
		this.myGender = myGender; 
		
	}
	// the default constructor is if you do not have a consturctor, then the superclass no args view takes. 
	
	public Person(String name, int age, String gender) {
		myName = name; //you don't have to include this because you have different parameter names  
		myAge = age; 
		myGender = gender; 	
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public int getMyAge() {
		return myAge;
	}

	public void setMyAge(int myAge) {
		this.myAge = myAge;
	}

	public String getMyGender() {
		return myGender;
	}

	public void setMyGender(String myGender) {
		this.myGender = myGender;
	}
	
	
	public String toString() {
		return "Name: " + myName + ", Age: " + myAge + ", gender: " + myGender;
	}

	public String distinction() {
		return "who cares"; 
	}
	
	
	
	
}
