package universitiesWithEncapsulation;

public class Department {
	private  String name;
	private  Professor head;
	private  Course courses;
	private  Student students;
	private  Classroom classrooms;
	
	public void setName (String name) {
		this.name = name;
	}
	public void setProfessor (Professor head) {
		this.head = head;
	}
	public void setCourse (Course courses) {
		this.courses = courses;
	}
	public void setStudent (Student students) {
		this.students = students;
	}
	public void setClassroom (Classroom classrooms) {
		this.classrooms = classrooms;
	}
	
	public void printDepartmentName () {
		System.out.println(name);
	}
	public void printProfessor () {
		head.printProfessorsName();
	}
	public void printCourse () {
		courses.printCourseName();
	}
	public void printStudent () {
		students.printStudentName();
	}
	public void printClassrooms () {
		classrooms.printClassroomName();
	}
}

