package InheritanceAthleteActivity;

/**
 * Defines an athlete.
 */
public abstract class Athlete {

	private String firstName;
	private String lastName;
	private String sport;
	private double hoursTraining;

	/**
	 * Constructs an athlete with a specified name and sport; hoursTraining is
	 * initialized to 0.
	 * 
	 * @param fname
	 *            first name of athlete
	 * @param lname
	 *            last name of athlete
	 * @param sportPlayed
	 *            sport in which athlete participates
	 */

	public Athlete(String fname, String lname) {
       firstName = fname; 
       lastName = lname; 
       hoursTraining = 0; 
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public double getHoursTraining() {
		return hoursTraining;
	}
	public void setHoursTraining(double hoursTraining) {
		this.hoursTraining = hoursTraining;
	}
	public String toString() {
		
		return "Name: " + firstName + " " + lastName + " is a " + getSport() + " and has trained " + hoursTraining + " hours";

	}

	/**
	 * Increments hours of training.
	 * 
	 * @param hours   number of hours athlete trained
	 */
	public abstract void train(double hours);

	
	/**
	 * Calculates the number of calories burned
	 * based on the number of hours athlete trained
	 * 
	 */
	public abstract int caloriesBurned();   

	public void race(int x) {
		
	}

}
