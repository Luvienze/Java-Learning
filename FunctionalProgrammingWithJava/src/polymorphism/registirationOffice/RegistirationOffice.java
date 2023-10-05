package polymorphism.registirationOffice;
import java.util.Date;
public class RegistirationOffice {
	Date date = new Date();
	public RegistirationOffice() {
		
	}
	public Student getAStudent() {
		Student s = null;
		int students = (int)(6*Math.random());
		switch(students) {
		case 0:
			s = new Student(001, "Steve Rogers", 1902, date, "History");
			System.out.println(s);
			break;
		case 1:
			s = new GraduateStudent(002, "Natasha Romanov", 1980, date, "War Crimes", "Eva Green", "Sneaking");
			System.out.println(s);
			break;
		case 2:
			s = new VocationalStudent(003, "Thor Odinson", 0000, date, "Faith");
			System.out.println(s);
			break;
		case 3: 
			s = new UndergraduateStudent(004, "Clint Barton", 1974, date, "Gymnastic", "Archery");
			System.out.println(s);
			break;
		case 4:
			s = new MasterStudent(005, "Tony Stark", 1972, date, "Physic", "Howard Stark", "Arc Reactor");
			System.out.println(s);
			break;
		case 5:
			s = new PhdStudent(006, "Bruce Banner", 1970, date, "Biology", "Peter Parker", "HulkProject", true);
			System.out.println(s);
			break;
		}
		return s;
	
	}
	
	public void registerStudent(Student s) {
		if(s instanceof Student) {
			s.register();
		}
		if(s instanceof GraduateStudent) {
			s.register();
		}
		if(s instanceof VocationalStudent) {
			s.register();
		}
		if(s instanceof UndergraduateStudent) {
			s.register();
		}
		if(s instanceof MasterStudent) {
			s.register();
		}
		if(s instanceof PhdStudent) {
			s.register();
		}
		
	}
}
