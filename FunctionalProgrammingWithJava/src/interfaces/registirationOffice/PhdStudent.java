package interfaces.registirationOffice;

import java.util.Date;

public class PhdStudent extends GraduateStudent {
	protected boolean qualifyingExamTaken;
	public PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis, boolean qualifyingExamTaken) {
		super(no, name, year, dob, major, advisor, thesis);
		this.qualifyingExamTaken = qualifyingExamTaken;
	}@Override
	public void study() {
		System.out.println("Phd student is studying!");
		writeThesis();
		writePaper();
	}@Override
	public void register() {
		System.out.println("Phd student has registered!");
	}
	public void writeThesis() {
		System.out.println("Phd student writing his/her thesis: " + thesis);
	}
	public void meetWithAdvisor() {
		System.out.println("Phd student is meeting his/her advisor: " + advisor);
	}
	public void writePaper() {
		System.out.println("Phd student writing paper!");
	}
	@Override
	public String toString() {
		return "Phd student: \nNo: " + no + " \nName: " + name + " \nYear: " + year + " \nDob: " + dob +
		" \nMajor: " + major + " \nAdvisor: " + advisor + " \nThesis: " + thesis + " \nQualifying exam taken: " + qualifyingExamTaken;
 	}
	
}
