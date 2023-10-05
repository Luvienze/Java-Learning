package polymorphism.registirationOffice;
import java.util.Date;
public class VocationalStudent extends Student {
	
	public VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
	}
	@Override
	public void study() {
		System.out.println("Vocational student is studying!");
	}
	@Override
	public void register() {
		System.out.println("Vocational student is registered!");
	}
	@Override
	public String toString() {
		return "No:" + no + "\nName: " + name + "\nYear: " + year + "\nDate: " + dob + "\nMajor: " + major;
	}
}
