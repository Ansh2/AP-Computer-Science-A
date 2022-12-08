package Inheritance;

public class Pet extends Animal {

	
	@Override
	public String communicate() {
		// TODO Auto-generated method stub
		return this.speak();
	}
	
	
	public String speak() {
		return "murp"; 
	}

}
