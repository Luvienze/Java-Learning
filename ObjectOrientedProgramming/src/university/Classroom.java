package university;

public class Classroom {
	String name;
	int code;
	Course classCourse;
	Professor classProfessor;
	Student[] classStudents;
	Department department;
	
	public void setName (String newName) {
		name = newName;
	}
	public void setCode (int newCode) {
		code = newCode;
	}
	public void getCourse (Course newClassCourse) {
		classCourse = newClassCourse;
	}
	public void getProfessor (Professor newClassProfessor) {
		classProfessor = newClassProfessor;
	}
	public void getStudent (Student[] newClassStudents) {
		classStudents = newClassStudents;
	}
	public void getDepartment (Department newDepartment) {
		department = newDepartment;
	}
	
}
