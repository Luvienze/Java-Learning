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
	
	/*public void setName (String newName) {
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
	}*/
	public void setName (String name) {
		this.name = name;
	}
	public void setNo (String no) {
		this.no = no;
	}
	public void getDepartment (Department department) {
		this.department = department;
	}
	public void setAdvisor (Professor advisor) {
		this.advisor = advisor;
	}
	public void setCourse(Course[] courseTaken) {
		this.coursesTaken = courseTaken;
	}
	public void getCourse (Course courseTaken) {
		this.courseTaken = courseTaken;
	}
	public void getClassroom (Classroom classroom) {
		this.classroom = classroom;
	}
}
