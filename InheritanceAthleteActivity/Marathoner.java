package InheritanceAthleteActivity;

public class Marathoner extends Runner {
	
	public Marathoner(String fname, String lname) {
		super(fname, lname); 
		setSport("Marathoner"); 
	}

	public void train(double hours) {
		setHoursTraining(getHoursTraining() + hours); 		
	}
	
	@Override
	public void race(int miles) {
		if (miles >= 10) {
			 setRaces(getRaces() + 1);
			 setMilesRaced(getMilesRaced() + miles); 
		} else {
			train((miles * 8.5) / 60); 
		}
		
	}
}
