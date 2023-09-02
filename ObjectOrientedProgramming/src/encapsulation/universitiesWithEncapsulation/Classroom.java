package universitiesWithEncapsulation;

public class Classroom {
	private String name;
	private int code;
	private Course classCourse;
	private Professor classProfessor;
	private Student classStudents;
	private Department department;

	public void setName (String name) {
		this.name = name;
	}
	public void setCode (int code) {
		this.code = code;
	}
	public void setCoure (Course classCourse) {
		this.classCourse = classCourse;
	}
	public void setProfessor (Professor classProfessor) {
		this.classProfessor = classProfessor;
	}
	public void setStudent(Student classStudents) {
		this.classStudents = classStudents;
	}
	public void setDepartment (Department department) {
		this.department = department;
	}
	
	public void  printClassroomName() {
		System.out.println(this.name);
	}
	public void  printClassroomCode() {
		System.out.println(this.code);
	}
	public void  printClassroomCourse() {
		classCourse.printCourseName();
	}
	public void  printClassroomProfessor() {
		classProfessor.printProfessorsName();
	}
	public void  printClassroomStudents() {
		classStudents.printStudentName();
	}
	public void  printClassroomDepartment() {
		department.printDepartmentName();
	}
}

