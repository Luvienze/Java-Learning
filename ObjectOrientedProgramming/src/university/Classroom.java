package university;

public class Classroom {
	String name;
	int code;
	Course classCourse;
	Professor classProfessor;
	Student[] classStudents;
	Department department;
	{
		name = "ClassRoom B1";
		code = 1;
		
	}
	/*public void setName (String newName) {
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
	}*/
	public void setName (String name) {
		this.name = name;
	}
	public void setCode (int code) {
		this.code = code;
	}
	public void getCoure (Course classCourse) {
		this.classCourse = classCourse;
	}
	public void getProfessor (Professor classProfessor) {
		this.classProfessor = classProfessor;
	}
	public void getStudent(Student[] classStudents) {
		this.classStudents = classStudents;
	}
	public void getDepartment (Department department) {
		this.department = department;
	}
	
}
