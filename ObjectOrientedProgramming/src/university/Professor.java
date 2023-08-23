package university;

public class Professor {
	String no;
	String name;
	String rank;
	Department department;
	Student[] advisees;
	Student advisee;
	Course[] courseGiven;
	Course courseTaken;
	Classroom classroomHead;
	
	public void setName (String newName) {
		name = newName;
	}
	public void getDepartment (Department newDepartment) {
		department = newDepartment;
	}
	public void setStudent (Student[] newAdvisees) {
		advisees = newAdvisees;
		
	}
	public void getStudent (Student newAdvisee) {
		advisee = newAdvisee;
	}
	public void setCourse (Course[] newCourseGiven) {
		courseGiven = newCourseGiven;
	}
	public void getCourse (Course newCourseTaken) {
		courseTaken = newCourseTaken;
	}

	public void setClassroomHead (Classroom newClassroomHead) {
		classroomHead = newClassroomHead;
	}

}
