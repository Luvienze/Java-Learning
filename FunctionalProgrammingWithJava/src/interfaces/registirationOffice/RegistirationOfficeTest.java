package interfaces.registirationOffice;
import java.util.Date;
public class RegistirationOfficeTest {

	public static void main(String[] args) {
		RegistirationOffice reg = new RegistirationOffice();
		Date date = new Date();
		reg.getAStudent();
		System.out.println();
		reg.registerStudent(reg.getAStudent());
//		PhdStudent phdStudent = new PhdStudent(005, "Bruce Banner", 1970, date, "Biology", "Peter Parker", "HulkProject", true);
//		reg.registerStudent(phdStudent);
	}

}
