package universitiesWithEncapsulation;

import java.util.Date;

public class Course {
	private int code;
	private String name;
	private Department department;
	private Professor teacher;
	private Student students;
	private String[] days;
	private Classroom classroom;
	Date time;
	
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
	public void setStudent(Student students) {
		this.students = students;
	}
	public void setDays(String[] days) {
		this.days = days;
	}
	
	public void printCode() {
		System.out.println(this.code);
	}
	public void printCourseName() {
		System.out.println(name);
	}
	public void printCourseTeacher() {
		teacher.printProfessorsName();
	}
	public void printCourseDepartment() {
		department.printDepartmentName();
	}
	public void printCourseClassroom() {
		classroom.printClassroomName();
	}
	public void printCourseStudents() {
		students.printStudentName();
	}
	public void printCourseDays() {
		System.out.println(this.days);
	}

}
