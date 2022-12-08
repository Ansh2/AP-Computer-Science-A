package ArrayList;

public class College {
	String institution,  nickname;
	int undergraduates, graduates, faculty;

	// complete this constructor+
	public College(String inst, String nick, int ugStu, int gradStu, int fac) {
		this.institution = inst; 
		this.nickname = nick; 
		this.undergraduates = ugStu; 
		this.graduates = gradStu; 
		this.faculty = fac; 
	}
	
	public String getInstitution() {
		return institution; 
	}

	public String getNickname() {
		return nickname;
	}

	public int getUndergraduates() {
		return undergraduates;
	}

	public int getGraduates() {
		return graduates;
	}

	public int getFaculty() {
		return faculty;
	}
	
	public String toString() {
		return institution + "\t" + nickname + "\n" + undergraduates + "\t" + graduates + "\n" + faculty;  
	}
	
	// you can use this tester to make sure your toString and constructor works
	public static void main(String[] args) {
		College one = new College("Brown University","Bears",6670,3061,736);
		System.out.println(one);	
		
	
	}
}