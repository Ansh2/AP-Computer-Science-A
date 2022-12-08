package Inheritance;
import java.util.ArrayList;

public class SchoolTester {
	
	public static void main(String[] args) {
		//person is super class and teacher is sub class so you can have a type person, but create a teacher object
		
		Person meg = new Person("Meg", 18, "F");
		
		Teacher bob = new Teacher ("Coach Bob", 27, "M", "Math", 42000.0); 
//		System.out.println(bob);
		Student matt = new Student("Matth D'Rat", 17, "M", "12345", 3.6); 
//		System.out.println(matt);
		//dynamic binding - decides which class to get the method at run time
//		System.out.println(matt.distinction());
//		System.out.println();
		CollegeStudent kelly = new CollegeStudent("Kelly Jelly", 18, "F", "MU141", 3.6, "Economics", "Flatley"); 
//		System.out.println(kelly);
//		System.out.println(kelly.distinction()); //this is polymorphism
		
		ArrayList<Person> list = new ArrayList<Person> (); 
		
		list.add(meg); 
		list.add(bob); 
		list.add(matt); 
		list.add(kelly);
		
		
		//you can do this as teacher and college studnet are derived from person 
		
		
		for (Person p: list)  
			System.out.println(p);
		
		
		for (Person p: list) 
			System.out.println(p.distinction());

		
	}

}
