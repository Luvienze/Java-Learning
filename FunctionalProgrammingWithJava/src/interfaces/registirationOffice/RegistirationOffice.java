package interfaces.registirationOffice;

import java.util.Date;
public class RegistirationOffice{
	
	public AbstractStudent getAStudent() {
		AbstractStudent s = null;
		Date date = new Date();
		int students = (int)(5*Math.random());
		switch(students) {
		case 0:
			s = new GraduateStudent(001, "Natasha Romanov", 1980, date, "War Crimes", "Eva Green", "Sneaking");
			System.out.println(s);
			break;
		case 1:
			s= new VocationalStudent(002, "Thor Odinson", 0000, date, "Faith");
			System.out.println(s);
			break;
		case 2: 
			s= new UndergraduateStudent(003, "Clint Barton", 1974, date, "Gymnastic", "Archery");
			System.out.println(s);
			break;
		case 3:
			s = new MasterStudent(004, "Tony Stark", 1972, date, "Physic", "Howard Stark", "Arc Reactor");
			System.out.println(s);
			break;
		case 4:
			s = new PhdStudent(005, "Bruce Banner", 1970, date, "Biology", "Peter Parker", "HulkProject", true);
			System.out.println(s);
			break;
		}
		return s;
		}
	public void registerStudent(AbstractStudent s ) {
		if(s instanceof GraduateStudent) {
			s.register();
		}
		if(s instanceof MasterStudent) {
			s.register();
		}
		if(s instanceof PhdStudent) {
			s.register();
		}
		if(s instanceof UndergraduateStudent) {
			s.register();
		}
		if(s instanceof VocationalStudent) {
			s.register();
		}
	
	}
	
}

	


