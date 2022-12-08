package Arrays;

import java.util.*; 

public class GuidanceGroup {
	// Array group will store SatStudent objects
	private SatStudent[] group;

	/**
	 * Default Constructor for objects of class GuidanceGroup
	 */
	public GuidanceGroup() {
		group = new SatStudent[12];
		group[0] = (new SatStudent("Ye", 640, 695, 686));
		group[1] = (new SatStudent("Bradley", 778, 768, 780));
		group[2] = (new SatStudent("Chen", 687, 614, 705));
		group[3] = (new SatStudent("Davis", 620, 534, 556));
		group[4] = (new SatStudent("Aarons", 550, 565, 517));
		group[5] = (new SatStudent("Gupta", 687, 720, 640));
		group[6] = (new SatStudent("Park", 722, 721, 745));
		group[7] = (new SatStudent("Kohl", 595, 605, 615));
		group[8] = (new SatStudent("Mehta", 525, 637, 521));
		group[9] = (new SatStudent("Bahl", 611, 607, 610));
		group[10] = (new SatStudent("Smith", 670, 703, 610));
		group[11] = (new SatStudent("Issacs", 670, 690, 710));
	}

	// Constructor with a SatStudent[] array as a parameter
	public GuidanceGroup(SatStudent[] myGroup) {
		group = myGroup;
	}

	// This method displays a chart with 2 columns: Name and Total SAT score
	public void display() {
		for (int i = 0; i < group.length; i ++) {
			System.out.println("\nNAME\tTOTAL\n============\n" + group[i]);
		}
		  		

	}
	
	public static double round(double x) {
		return (int)(x * 100 + 0.5) / 100.0;  
	}

	// This method returns the name of the student with the lowest total SAT
	public String getMin() {
		int min = group[0].getGrade(); 
		String name = group[0].getName(); 
		for (int i = 1; i < group.length; i ++) {
			if (group[i].getGrade() < min) {
				name = group[i].getName(); 
				min = group[i].getGrade(); 
				
			}
		}
	 
		return name +  " " + min;
	}
	
	// This method returns the name of the student with the highest total SAT
	// score
	public String getMax() {
		int max = group[0].getGrade(); 
		String name = group[0].getName(); 
		for (int i = 1; i < group.length; i ++) {
			if (group[i].getGrade() > max ) {
				max = group[i].getGrade(); 
				name = group[i].getName(); 
				
			}
		}
		
		return name +  " " + max;
	}

	// This method returns the average of all SAT scores
	public double average() { //LOOK AT THIS AGAIN!
		double sum = 0;
		for (int i = 0; i < group.length; i++) {
			sum += group[i].getGrade(); 
		}
		double average = sum / (double)(group.length);
		return round(average);
	}

	// This method displays a list of names of students who scored below 1700
	public void below1700List() {
		for (int i = 0; i < group.length; i++) {
			if (group[i].getGrade() < 1700 ) {
				System.out.println(group[i].getName() + ": " + group[i].getGrade());
			}
		}
	
	}
	

	// This method displays a list of names of students who scored above2000
	public void above2000List() {
		
		for (int i = 0; i < group.length; i++) {
			if (group[i].getGrade() > 2000 ) {
				System.out.println(group[i].getName() + ": " + group[i].getGrade());
			}
		}
		
	}

	// this method will return the total score of an inputted name.
	// return -1 if student is not found
	public int getScore(String lookfor) {
		for (int i = 0; i < group.length; i++) {
			if (group[i].getName().equals(lookfor)) {
				System.out.println("Student is found");
				return group[i].getGrade();
			}
		}
		System.out.println("Student not found");
		return -1;
	}

	// returns an array of SatStudents with total scores &gt;1900'
	public SatStudent[] scholarship() { 
		int count = 0; 
		for (int i = 0; i < group.length; i++) {
			if (group[i].getGrade() >= 1900 ) {
				count++;
			}
		}
		SatStudent [] temp = new SatStudent[count];
		int j = 0; 
		for (int i = 0; i < group.length; i ++) {
			if (group[i].getGrade() >= 1900) {
				temp[j]  = group[i]; 
				j++;
			}
		}
		return temp;
	}

	// returns a new GuidanceGroup with the SatStudents of this class combined
	// with the SatStudents of other class
	public GuidanceGroup combineGroups(GuidanceGroup other) {
		
		SatStudent[] temp = new SatStudent[this.group.length + other.group.length]; //implicit
		
		for (int i = 0;  i < this.group.length; i++) {
			temp[i] = this.group[i]; 
		}
		int j = 0; 
		for (int i = this.group.length; i < temp.length; i ++) {
			temp[i] = other.group[j]; 
			j++; 
		}
		
		GuidanceGroup x = new GuidanceGroup(temp);
		
		
		//group.length + other.group.length
		
		
//		temp = group; 
		
//		GuidanceGroup temp = new GuidanceGroup(); 
		
		return x;
	}

	// Sorts the array of the GuidanceGroup by total score (descending)
	public void sortByTotalScore() { //not working 
		
		int n = group.length; 
		
		for (int i = 0; i < n - 1; i ++) 
			for (int j = 0; j < n - i - 1; j++) 
				if (group[j].getGrade() < group[j + 1].getGrade()) {
					SatStudent temp = group[j];
					group[j] = group[j + 1]; 
					group[j+1] = temp; 
	
				}
//		
//		this.display(); 	
		
	}

	// Sorts the array of the GuidanceGroup by Name (ascending (alphabetically))
	public void sortByName() {
				
		int n = group.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (group[j].getName().compareTo(group[j + 1].getName()) > 0)
				{
					SatStudent temp = group[j]; 
					group[j] = group[j+1];
					group[j+1] = temp;
				}
			}
		}
		
	}
		
	

	// this method will return the average of all of the students in the
	// Scholarship category
	public double getScholarShipAverage() {
		
		GuidanceGroup temp = new GuidanceGroup(); 
		
		SatStudent[] x = temp.scholarship(); 
		
		int sum = 0; 
		for (int i = 0; i < x.length; i ++) {
			sum += x[i].getGrade(); 
		}
		double average = (sum / (double)x.length);
		return round(average); 
	}

	
}