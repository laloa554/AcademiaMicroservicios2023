package herencia.Simple;

import java.util.ArrayList;

public class Student extends Person {
	private int idStudent;
	private float gradePointAverage;
	private ArrayList<String> personalBelongings;
	
	public Student(int idStudent, String name, String lastName, String gender,
			int age,float gradePointAverage, ArrayList<String> personalBelongings) {
		super(name, lastName, gender, age);
		this.idStudent = idStudent;
		this.gradePointAverage = gradePointAverage;
		this.personalBelongings = personalBelongings;
	}

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public float getGradePointAverage() {
		return gradePointAverage;
	}

	public void setGradePointAverage(float gradePointAverage) {
		this.gradePointAverage = gradePointAverage;
	}

	public ArrayList<String> getPersonalBelongings() {
		return personalBelongings;
	}

	public void setPersonalBelongings(ArrayList<String> personalBelongings) {
		this.personalBelongings = personalBelongings;
	}
	
	public String toString() {
		return "ID Student: " + idStudent + "\n"
				+ super.toString() 
				+ "Grade Point Average: " + gradePointAverage + "\n"
				+ "Personal Belongings: " + personalBelongings + "\n";
	}
}
