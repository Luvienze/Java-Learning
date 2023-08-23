package university;
import java.util.Scanner;

public class Test2 {
	public static void main (String[] args) {
		//Gettin input for courses and students number
		Scanner getNumber = new Scanner(System.in);
		
		//New Department
		Department department1 = new Department();
		department1.setName("Computer Science");
		
		//New Professor
		Professor professor1 = new Professor();
		professor1.setName("Ahmet Arslan");
		
		//New Courses
		System.out.println("Enter the number of courses: ");
		Course[] course = new Course[getNumber.nextInt()];
		Course course1 = new Course ();
		course[0] = course1;
		course1.setName("Int. to Algorithms");
		
		//New Students
		System.out.println("Enter the number of students: ");
		Student[] students = new Student[getNumber.nextInt()];
		Student student1 = new Student();
		students[0] = student1;
		student1.setName("Akin Kaldiroglu");
		
		//Classroom
		System.out.println("Enter the number of classrooms: ");
		Classroom[] classrooms = new Classroom[getNumber.nextInt()];
		Classroom classroom1 = new Classroom();
		classrooms[0] = classroom1;
		classroom1.setName("B1");
		classroom1.setCode(1);
		
		//Head of Departments
		department1.setProfessor(professor1);
		professor1.getDepartment(department1);
		
		//Department's Courses 
		course1.setDepartment(department1);
		department1.setCourse(course);
		department1.getCourse(course1);
		
		//Professor's Courses 
		course1.setTeacher(professor1);
		professor1.setCourse(course);
		professor1.getCourse(course1);
		
		//Professor's Students 
		professor1.setStudent(students);
		professor1.getStudent(student1);
		student1.setAdvisor(professor1);
		
		
		//Student's courses
		student1.setCourse(course);
		student1.getCourse(course1);
		
		//NUmber of students of courses
		course1.setStudent(students);
		course1.students[0] = student1;
		
		//Course's classroom
		course1.setClassroom(classroom1);
		classroom1.getCourse(course1);
		
		//Classroom's head
		professor1.setClassroomHead(classroom1);
		classroom1.getProfessor(professor1);
		
		//Classroom's Department
		department1.setClassroom(null);
		classroom1.getDepartment(department1);
		
		//Classroom's Students
		classroom1.getStudent(students);
		student1.getClassroom(classroom1);
		
		System.out.println("Department of University: " + department1.name);
		System.out.println("Department's course: " + department1.course.name);
		System.out.println("Head of the department: " + department1.head.name);
		System.out.println("Course of the head of departmen: " + department1.head.courseTaken.name );
		System.out.println("Students of the courses from the head of department : " + professor1.advisees.length);
		System.out.println("Classrooms: " + classroom1.classProfessor.name);
		System.out.println("Classrooms' students: " + classroom1.classStudents.length);
		System.out.println("Classrooms's student's name: " + classroom1.classStudents[0].name );
	
	}

}
