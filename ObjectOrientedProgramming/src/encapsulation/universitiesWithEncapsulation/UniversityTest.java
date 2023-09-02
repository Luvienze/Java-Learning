package universitiesWithEncapsulation;

import java.util.Scanner;

public class UniversityTest {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		//Departments
		Department department1 = new Department();
		Department department2 = new Department();
		
		department1.setName("Computer Science");
		department2.setName("Philoshopy");
		
		//Professors
		Professor professor1 = new Professor();
		Professor professor2 = new Professor();
		
		professor1.setName("Ben Affleck");
		professor2.setName("Henry Cavill");
		
		//Courses
		Course course1 = new Course();
		Course course2 = new Course();
		
		course1.setName("Int. to Algorithms");
		course2.setName("Ethic");
		
		//Classrooms
		Classroom classroom1 = new Classroom();
		Classroom classroom2 = new Classroom();
		
		classroom1.setName("B1");
		classroom2.setName("F1");
		
		//Students
		Student student1 = new Student();
		Student student2 = new Student();	
		
		student1.setName("Eren Sonmez");
		student2.setName("Amy Adams");
		
		//Department's Professor
		department1.setProfessor(professor1);
		department2.setProfessor(professor2);
		
		professor1.setDepartment(department1);
		professor2.setDepartment(department2);
		
		//Department's Courses
		department1.setCourse(course1);
		department1.setCourse(course2);
		
		course1.setDepartment(department1);
		course2.setDepartment(department2);
		
		//Department's Classrooms
		department1.setClassroom(classroom1);
		department2.setClassroom(classroom2);
		
		classroom1.setDepartment(department1);
		classroom2.setDepartment(department2);
		
		//Department's students
		department1.setStudent(student1);
		department2.setStudent(student2);
		
		student1.setDepartment(department1);
		student2.setDepartment(department2);
		
		//Professor's Courses
		professor1.setCourse(course1);
		professor2.setCourse(course2);
		
		course1.setTeacher(professor1);
		course2.setTeacher(professor2);
		
		//Professor's Students
		professor1.setStudent(student1);
		professor2.setStudent(student2);
		
		student1.setAdvisor(professor1);
		student2.setAdvisor(professor2);
		
		//Professor's classrooms
		professor1.setClassroomHead(classroom1);
		professor2.setClassroomHead(classroom2);
		
		classroom1.setProfessor(professor1);
		classroom2.setProfessor(professor2);
		
		//Student's courses
		student1.setCourse(course1);
		student2.setCourse(course2);
		
		course1.setStudent(student1);
		course2.setStudent(student2);
		
		//Student's class'
		student1.setClassroom(classroom1);
		student2.setClassroom(classroom2);
		
		classroom1.setStudent(student1);
		classroom2.setStudent(student2);
		
		System.out.println("Department's of University:");
		department1.printDepartmentName();
		System.out.println("***");
		department2.printDepartmentName();
		
		System.out.println("-----------");
		
		System.out.println("Department's Professors:");
		professor1.printProfessorsName();
		System.out.println("***");
		professor2.printProfessorsName();
		
		System.out.println("-----------");
		
		System.out.println("Professor's Courses:");
		professor1.printProfessorCourseGiven();
		System.out.println("***");
		professor2.printProfessorCourseGiven();
		
		System.out.println("-----------");
		
		System.out.println("Professor'S Students:");
		professor1.printProfessorStudents();
		System.out.println("***");
		professor2.printProfessorStudents();
		
		System.out.println("-----------");
		
		System.out.println("Student's Courses:");
		student1.printStudentCourse();
		System.out.println("***");
		student2.printStudentCourse();
		
		System.out.println("-----------");
		
		System.out.println("Student's Classrooms:");
		student1.printStudentClassroom();
		System.out.println("***");
		student2.printStudentClassroom();
		
		System.out.println("-----------");
		System.out.println("Classroom's Heads:");
		classroom1.printClassroomProfessor();
		System.out.println("***");
		classroom2.printClassroomProfessor();
		
	}

}
