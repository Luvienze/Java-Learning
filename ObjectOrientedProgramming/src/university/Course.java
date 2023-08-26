package university;

import java.util.Date;

public class Course {
	int code;
	String name;
	Department department;
	Professor teacher;
	Student[] students;
	String[] days;
	Classroom classroom;
	Date time;
	{
		name = "Algorithms";
		code = 101;
	}
	
	/*public void setCode (String newCode) {
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
	/*public void getDays (String[] newDays) {
		days = newDays;
	}*/
	public void setCode (int code) {
		this.code = code;
	}
	public void setName (String name) {
		this.name = name;
	}
	public void setTeacher (Professor teacher) {
		this.teacher = teacher;
	}
	public void setDepartment (Department department) {
		this.department = department;
	}
	public void setClassroom (Classroom classroom) {
		this.classroom = classroom;
	}
	public void setStudent(Student[] students) {
		this.students = students;
	}
	public void getDays(String[] days) {
		this.days = days;
	}
}
