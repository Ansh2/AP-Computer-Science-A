package InheritanceAthleteActivity;

public class Wrestler extends Athlete {
	
	public Wrestler(String fname, String lname) {
		super(fname, lname);
		setSport("Wrestler"); 
		
	}
	
	@Override
	public void train(double hours) {
		setHoursTraining(getHoursTraining() + hours); 	
	}
	@Override
	public int caloriesBurned() {  
		return (int) (getHoursTraining() * 600); 
		
	}
	
	@Override
	public String toString() {
		return super.toString() + " expending\n" + caloriesBurned() + " calories\n"; 
	}
	

	
	
	
	
	
	

	
	
	
}
