package InheritanceAthleteActivity;

public class Runner extends Athlete {
	private int races; 
	private double milesRaced; 
	


	public Runner(String fname, String lname) {
		super(fname, lname); 
		races = 0; 
		milesRaced = 0; 
		setSport("Runner"); 
		
	}
	
	public int getRaces() {
		return races;
	}

	public void setRaces(int races) {
		this.races = races;
	}

	public double getMilesRaced() {
		return milesRaced;
	}

	public void setMilesRaced(double milesRaced) {
		this.milesRaced = milesRaced;
	}
	
	@Override
	public void train(double hours) {
		setHoursTraining(getHoursTraining() + hours); 		
	}
	
	@Override
	public int caloriesBurned() {  
		return (int) (getHoursTraining() * 400); 
		
	}
	
	public void race(int miles) {
		milesRaced+=miles;
		races++;
	}
	
	@Override
	public String toString() {
		return super.toString() + " expending\n" + caloriesBurned() + " calories"
				+ "\n# OF RACES & TRAINING MILES: " + races + " races / " + milesRaced + " miles\n"; 
	}
	

}
