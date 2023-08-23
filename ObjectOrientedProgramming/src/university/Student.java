package university;

public class Student {
	String name;
	String no;
	String dob;
	Department department;
	Professor advisor;
	Course[] coursesTaken;
	Course courseTaken;
	Classroom classroom;
	
	public void setName (String newName) {
		name = newName;
	}
	public void setNo (String newNo) {
		no = newNo;
	}
	public void getDepartment (Department newDepartment) {
		department = newDepartment;
	}
	public void setAdvisor (Professor newAdvisor) {
		advisor = newAdvisor;
	}
	public void setCourse(Course[] newCourseTaken) {
		coursesTaken = newCourseTaken;
	}
	public void getCourse (Course newCourseTaken) {
		courseTaken = newCourseTaken;
	}
	public void getClassroom (Classroom newClassroom) {
		classroom = newClassroom;
	}
}
