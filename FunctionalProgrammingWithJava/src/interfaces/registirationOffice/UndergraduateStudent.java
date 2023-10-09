package interfaces.registirationOffice;

import java.util.Date;

public class UndergraduateStudent extends AbstractStudent {
	protected String minor;
	public UndergraduateStudent(int no, String name, int year, Date dob, String major,String minor) {
		super(no, name, year, dob, major);
		this.minor = minor;
	}
	@Override
	public void study() {
		System.out.println("Undergradute student is studying!");
	}
	@Override
	public void register() {
		System.out.println("Undergradute student has registered!");
	}
	public String toString() {
		return "Undergradute Student: \nNo: " + no + " \nName: " + name + " \nYear: " + year + " \nDob: " + dob + 
									 " \nMajor: " + major + " \nMinor: " + minor;	
	}

}
