package polymorphism.registirationOffice;
import java.util.Date;
public class UndergraduateStudent extends Student {
	protected String minor;
	public UndergraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
		super(no, name, year, dob, major);
		this.minor = minor;
	}
	@Override
	public void study() {
		System.out.println("Undergraduate student is studying!");
	}
	@Override
	public void register() {
		System.out.println("Undergraduate student is registered!");
	}
	@Override
	public String toString() {
		return "No:" + no + "\nName: " + name + "\nYear: " + year + "\nDate: " + dob + "\nMajor: " + major + "\nMinor: " + minor;
	}
}
