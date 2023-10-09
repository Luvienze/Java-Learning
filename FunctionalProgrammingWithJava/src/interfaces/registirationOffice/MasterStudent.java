package interfaces.registirationOffice;

import java.util.Date;

public class MasterStudent extends GraduateStudent {

	public MasterStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major, advisor, thesis);
	}
	@Override
	public void study() {
		System.out.println("Master student is studying!");
		writeThesis();
	}
	@Override
	public void register() {
		System.out.println("Master student has registered!");
	}
	public void writeThesis() {
		System.out.println("Master student writing his/her thesis: " + thesis);
	}
	public void meetWithAdvisor() {
		System.out.println("Master student is meeting his/her advisor: " + advisor);
	}
	@Override
	public String toString() {
		return "Master student: \nNo: " + no + " \nName: " + name + " \nYear: " + year + " \nDob: " + dob +
								" \nMajor: " + major + " \nAdvisor: " + advisor + " \nThesis: " + thesis ;
 	}

}
