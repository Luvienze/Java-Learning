package interfaces.registirationOffice;

import java.util.Date;

public class GraduateStudent extends AbstractStudent{
	
	protected String advisor;
	protected String thesis;
	public GraduateStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major);
		this.advisor = advisor;
		this.thesis = thesis;
		
	}
	@Override
	public void study() {
		System.out.println("Graduate student is studying!");
		
	}
	@Override
	public void register() {
		System.out.println("Graduate student has registered!");
		
	}
	public void writeThesis() {
		System.out.println("Graduate student writing his/her thesis:" + thesis);
	}
	public void meetWithAdvisor() {
		System.out.println("Graduate student is meeting with his/her advisor: " + advisor);
	}
	@Override
	public String toString() {
		return "Gradute Student \nNo: " + no + " \nName: " + name + " \nYear: " + year + " \nDob: " + dob + " \nMajor: " + major +
				                 " \nAdvisor: " + advisor + " \nThesis: " + thesis ;
	}

}
