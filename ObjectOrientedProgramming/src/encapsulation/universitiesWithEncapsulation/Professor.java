package universitiesWithEncapsulation;

public class Professor {
	private  String no;
	private String name;
	private String rank;
	private Department department;
	private Student advisees;
	private Student advisee;
	private Course courseGiven;
	private Classroom classroomHead;
	
	public void setName (String name) {
		this.name = name;
	}
	public void setDepartment (Department department) {
		this.department = department;
	}
	public void setStudent (Student advisee) {
		this.advisee = advisee;
	}
	public void setCourse (Course courseGiven) {
		this.courseGiven = courseGiven;
	}
	public void setClassroomHead (Classroom classroomHead) {
		this.classroomHead = classroomHead;
	}
	
	public void printProfessorsName () {
		System.out.println(name);
	}
	public void printProfessorDepartment () {
		department.printDepartmentName();
	}
	public void printProfessorStudents () {
		advisee.printStudentName();
	}
	public void printProfessorCourseGiven () {
		courseGiven.printCourseName();
	}

	public void getProfessorClassroomHead () {
		classroomHead.printClassroomName();
	}

}