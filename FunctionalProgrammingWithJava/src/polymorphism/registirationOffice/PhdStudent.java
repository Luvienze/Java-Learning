package polymorphism.registirationOffice;
import java.util.Date;
public class PhdStudent extends GraduateStudent {
	
	protected boolean qualifyingExamTaken;
	public PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis, boolean qualifyingExamTaken) {
		super(no, name, year, dob, major, advisor, thesis);
		this.qualifyingExamTaken = qualifyingExamTaken;
	}
	@Override
	public void study() {
		System.out.println("Phd student is studying!");
	}
	@Override
	public void register() {
		System.out.println("Phd student is registered!");
	}
	@Override
	public void writeThesis() {
		System.out.println("Phd student writes thesis: " + thesis);
	}
	@Override
	public void meetWithAdvisor() {
		System.out.println("Phd student met with advisor!");
	}
	public void writePaper() {
		System.out.println("Phd student writes paper!");
	}
	
}
