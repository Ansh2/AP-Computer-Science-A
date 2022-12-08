package Arrays;

/**
 * A city object holds the name and population of a city.
 */

public class City {
	/**
	 * instance variables
	 */
	String name;
	int population;
		
	public City(int p, String n) {
		name = n; 
		population = p; 
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	public String toString() {
		return "City: " + name + "\t\t" + "Population: " +  population;
	}
	
	
	
	
}
//{methods needed are not shown}
