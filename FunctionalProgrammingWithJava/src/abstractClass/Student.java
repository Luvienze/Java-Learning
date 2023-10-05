package abstractClass;
import java.util.Date;
public abstract class Student {
	protected int no;
	protected String name;
	protected int year;
	protected Date dob;
	protected String major;
	
	public Student(int no, String name, int year, Date dob, String major) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.dob = dob;
		this.major = major;
	}
	abstract void study();
	abstract void register();
	public abstract String toString();
}

