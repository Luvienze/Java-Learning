package bookReadinWithEncapsulation;
public class Reader {
	private String name;
	private int age;
	private char sex;
	private Book book;
	private int read;
	
	public void setReaderName(String name) {
		this.name = name;
	}
	public void setReaderAge(int age) {
		this.age = age;
	}
	public void setReaderSex(char sex) {
		this.sex = sex;
	}
	public void setReaderBook(Book book) {
		this.book = book;
	}
	
	public void printReaderName() {
		System.out.println(name);
	}
	public void printReaderAge() {
		System.out.println(age);
	}
	public void printReaderSex() {
		System.out.println(sex);
	}
	public void printReaderBook() {
		book.printBookTitle();
	}
	
	public void printReaderInfo() {
		this.printReaderName();
		this.printReaderAge();
		this.printReaderSex();
	}
	public void Read(int read) {
		book.printReadingPage(read);
	}
	
}