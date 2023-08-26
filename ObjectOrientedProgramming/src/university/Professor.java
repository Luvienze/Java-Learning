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
	
	/*public void setName (String newName) {
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
	}*/
	public void setName (String name) {
		this.name = name;
	}
	public void getDepartment (Department department) {
		this.department = department;
	}
	public void setStudent (Student[] advisees) {
		this.advisees = advisees;
	}
	public void getStudent (Student advisee) {
		this.advisee = advisee;
	}
	public void setCourse (Course[] courseGiven) {
		this.courseGiven = courseGiven;
	}
	public void getCourse (Course courseTaken) {
		this.courseTaken = courseTaken;
	}

	public void setClassroomHead (Classroom classroomHead) {
		this.classroomHead = classroomHead;
	}
}
