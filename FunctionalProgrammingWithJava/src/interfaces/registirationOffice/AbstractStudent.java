package interfaces.registirationOffice;
import java.util.Date;
public abstract class AbstractStudent implements Student {
	
	protected int no;
	protected String name;
	protected int year;
	protected Date dob;
	protected String major;
	
	public AbstractStudent(int no, String name, int year, Date dob, String major) {
		this.name = name;
		this.no = no;
		this.year = year;
		this.dob = dob;
		this.major = major;
	}
	@Override
	public String toString() {
		return "Student \nNo: " + no + ",\nName: " + name + ", \nYear: " + year + ", \nDob: " + dob + ", \nMajor: " + major + "]";
	}

	

}
