package university;

public class Department {
	String name;
	Professor head;
	Course[] courses;
	Course course;
	Student[] students;
	Classroom[] classrooms;
	
	public void setName( String newName) {
		name = newName;
	}
	public void setProfessor (Professor newHead) {
		head = newHead;
	}
	public void setCourse (Course[] newCourses) {
		courses = newCourses;
	}
	public void getCourse (Course newCourse) {
		course = newCourse;
	}
	public void setStudent (Student[] newStudents) {
		students = newStudents;
	}
	public void setClassroom (Classroom[] newClassrooms) {
		classrooms = newClassrooms;
	}

}
