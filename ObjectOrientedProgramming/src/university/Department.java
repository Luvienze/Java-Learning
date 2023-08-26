package university;

public class Department {
	String name;
	Professor head;
	Course[] courses;
	Course course;
	Student[] students;
	Classroom[] classrooms;
	{
		name = "Computer Science";
	}
	
	/*public void setName( String newName) {
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
	}*/
	
	public void setName( String name) {
		this.name = name;
	}
	public void setProfessor (Professor head) {
		this.head = head;
	}
	public void setCourse (Course[] courses) {
		this.courses = courses;
	}
	public void getCourse (Course course) {
		this.course = course;
	}
	public void setStudent (Student[] students) {
		this.students = students;
	}
	public void setClassroom (Classroom[] classrooms) {
		this.classrooms = classrooms;
	}
}
