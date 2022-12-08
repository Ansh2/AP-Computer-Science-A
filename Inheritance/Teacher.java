package Inheritance;
public class Teacher extends Person {
	//teacher has five fields, but three are of them are on the person class. 
	//THIS IS THE SUB CLASS. 
	private double salary; 
	private String subject; 
	
	
	public Teacher(String name, int age, String gender, String subj, double sal) {
		// use the super class constructor 
		super(name, age, gender);  //it will go to the person class; it doens't care about the local variables it just searches for string int string. 
		//you basically call the constructor in the person class as you are extending teache rto person. like i said before, extend gives person the superclass. 
		salary = sal; 
		subject = subj; 
	}

	//you do not need setters and getters for the instance variables in the person class as those getters/setters are ineherited, so you can call them 

	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String toString() {
		return super.toString() + ", subject: " + subject + ", salary: " + salary; 
     //this will insert the toString from the person class when you say super.toString(). 
	}
	
	//can you extend more than one class? no
	//extends speaks to inheritance and this makes a superclass class person and therefore the teacher is the sub class. If you don't say extend, you extend an object class. 
	//What it means to have a superclas besides object 
	//extends means that I am going to recieve besides those facts are going to recieve 
	//compared to students 
	
	
	
}
