package interfaces.registirationOffice;

import java.util.Date;

public class VocationalStudent extends AbstractStudent {

	public VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
	}@Override
	public void study() {
		System.out.println("Vocational student is studying!");
	}
	@Override
	public void register() {
		System.out.println("Vocational student has registered!");
	}
	@Override
	public String toString() {
		return "Vocational Student: \nNo: " + no + " \nName: " + name + " \nYear: " + year + " \nDob: " + dob +
									" \nMajor: " + major ;	
	}
	
	
}
