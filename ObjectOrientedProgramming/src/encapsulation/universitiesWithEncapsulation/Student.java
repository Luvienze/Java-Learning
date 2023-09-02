package universitiesWithEncapsulation;

public class Student {
	private String name;
	private String no;
	private String dob;
	private Department department;
	private Professor advisor;
	private Course courseTaken;
	private Classroom classroom;
	
	public void setName (String name) {
		this.name = name;
	}
	public void setNo (String no) {
		this.no = no;
	}
	public void setDepartment (Department department) {
		this.department = department;
	}
	public void setAdvisor (Professor advisor) {
		this.advisor = advisor;
	}
	public void setCourse (Course courseTaken) {
		this.courseTaken = courseTaken;
	}
	public void setClassroom (Classroom classroom) {
		this.classroom = classroom;
	}

	public void printStudentName() {
		System.out.println(this.name);
	}
	public void printStudentNo() {
		System.out.println(this.no);
	}
	public void printStudentDepartment() {
		department.printDepartmentName();
	}
	public void printStudentAdvisor() {
		advisor.printProfessorsName();
	}
	public void printStudentCourse() {
		courseTaken.printCourseName();
	}
	public void printStudentClassroom() {
		classroom.printClassroomName();
	}
}

