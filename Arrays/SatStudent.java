package Arrays;

public class SatStudent {
	
	public String name;
	public int math;
	public int verbal;
	public int writing;
	public int grade;

	public SatStudent(String name, int math, int verbal, int writing) {
		this.name = name; 
		this.math = math; 
		this.verbal = verbal;
		this.writing = writing; 
		this.grade = math + verbal + writing;  
	
		
//		this("Andersson", , 680, 700);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getVerbal() {
		return verbal;
	}

	public void setVerbal(int verbal) {
		this.verbal = verbal;
	}

	public int getWriting() {
		return writing;
	}

	public void setWriting(int writing) {
		this.writing = writing;
	}

	public int getGrade() {
		return math + verbal + writing;
	}

	
	public String toString() {
		return name + ", " + grade; 
	}
	
	
	
}
