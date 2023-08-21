package university;

public class Test {
	public static void main(String[] args) {
		//New Department
		Department department1 = new Department();
		Department department2 = new Department();
		department1.name = "Software Engineering";
		department1.name = "Philosophy";
		
		//New Professor
		Professor professor1 = new Professor();
		Professor professor2 = new Professor();
		Professor professor3 = new Professor();
		professor1.name = "Ahmet Arslan";
		professor2.name = "Ali Veli";
		professor3.name = "Ayşe Fatma";
		
		//New Courses
		Course course1 = new Course();
		Course course2 = new Course();
		Course course3 = new Course();
		course1.name = "Int. to Software Engineering";
		course2.name = "Ethics";
		course3.name = "Algebra";
		
		//New Students
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student student4 = new Student();
		
		student1.name = "Akin Kaldiroglu";
		student2.name = "Zeynep Gül";
		student3.name = "Metin Saglam";
		student4.name = "Murat Atılgan";
		
		//Head of the Departments
		department1.head = professor1;
		professor1.department = department1;
		
		department2.head = professor2;
		professor2.department = department2;
		
		//Department's courses
		course1.department = department1;
		department1.courses = new Course[100];
		department1.courses[0] = course1;
		
		course2.department = department2;
		department2.courses = new Course[50];
		department2.courses[0] = course2;
		
		course3.department = department1;
		department1.courses = new Course[100];
		department2.courses[1] = course3;
		
		//Professor's courses
		course1.teacher = professor1;
		professor1.courseGiven = new Course[5];
		professor1.courseGiven[0] = course1;
		
		course2.teacher = professor2;
		professor2.courseGiven = new Course[5];
		professor2.courseGiven[0] = course2;
		
		course3.teacher = professor3;
		professor3.courseGiven= new Course[5];
		professor3.courseGiven[0] = course3;
		
		//Professor's students
		professor1.advisee = new Student[10];
		professor1.advisee[0] = student1;
		student1.advisor = professor1;
		
		//Student's courses
		student1.courseTaken = new Course[7];
		student1.courseTaken[0] = course1;
		
		student2.courseTaken = new Course[7];
		student2.courseTaken[0] = course1;
		student2.courseTaken[1] = course3;
		
		student3.courseTaken = new Course[7];
		student3.courseTaken[0] = course2;
		
		student4.courseTaken = new Course[7];
		student4.courseTaken[0] = course1;
		
		//Number of students of courses
		course1.students = new Student[100];
		course1.students[0] = student1;
		course1.students[1] = student2;
		course1.students[2] = student4;
		
		course2.students = new Student[50];
		course2.students[0] = student3;
	
		System.out.println("Name of student student1's first course is " + student1.courseTaken[0].name);
		System.out.println("Name of student student1's first course's professor is " + student1.courseTaken[0].teacher.name );
		System.out.println("Name of student student1's first course's professor's department is " + student1.courseTaken[0].teacher.department.name);
		System.out.println("Name of student which took the course2 is " + course2.students[0].name);
	}
}
