package Inheritance;

public class AnimalTester {

	public static void main(String[] args) {
		Animal one = new Dog(); //you cannot do this  
		System.out.println(one.communicate());
		
		Animal two = new Cat(); 
		System.out.println(two.communicate());
		
		Animal three = new Cat(); 
		System.out.println(three.communicate());
		
	}
}
