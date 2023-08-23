package university;

import java.util.Date;

public class Course {
	String code;
	String name;
	Department department;
	Professor teacher;
	Student[] students;
	String[] days;
	Classroom classroom;
	Date time;
	
	public void setCode (String newCode) {
		code = newCode;
	}
	public void setName (String newName) {
		name = newName;
	}
	public void setTeacher(Professor newTeacher) {
		teacher = newTeacher;
	}
	public void setDepartment (Department newDepartment) {
		department = newDepartment;
	}
	public void setClassroom (Classroom newClassroom) {
		classroom = newClassroom;
	}
	public void setStudent (Student[] newStudents)
	{
		students = newStudents;
	}
	/*public void getStudent (Student newStudents) {
		students = newStudents;
	}*/
	public void getDays (String[] newDays) {
		days = newDays;
	}

}
