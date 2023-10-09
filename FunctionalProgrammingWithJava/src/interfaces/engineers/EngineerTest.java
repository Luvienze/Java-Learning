package interfaces.engineers;

public class EngineerTest {
	public static void main(String[] args) {
		Engineers eng = new JavaEnthBlogger("Frodo Baggins", 35,"Computer Science" );
		if(eng instanceof JavaEnthBlogger java) {
			java.openIDE("eclipse");
			java.buildAppWithJava("Banking App");
			java.commitCode();
			java.read("Last Summer");
			java.printInfo();
		}
	}
}
