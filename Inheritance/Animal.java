package Inheritance;

public abstract class Animal { //
	
	private double weight; 
	
	public Animal() { //you can never isntaitiate an abstract class, not allowed 
		//you can inherit the animal though 
		
	}


	public abstract String communicate(); //this makes it an abstract method. //I am forcing you to have your own communicate  
	
	
	public String toString() {
		return weight + ""; 
	}

}
