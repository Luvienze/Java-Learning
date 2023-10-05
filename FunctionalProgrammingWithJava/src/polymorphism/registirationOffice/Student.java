package polymorphism.registirationOffice;
import java.util.Date;
public class Student {
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
	public void study() {
		System.out.println("Student is studying!");
	}
	public void register() {
		System.out.println("Student is registered!");
	}
	public String toString() {
		return "No:" + no + "\nName: " + name + "\nYear: " + year + "\nDate: " + dob + "\nMajor: " + major;
	}
	
}
