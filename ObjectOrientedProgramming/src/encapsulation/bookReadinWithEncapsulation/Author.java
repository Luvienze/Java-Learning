package bookReadinWithEncapsulation;

public class Author {
	private String name;
	private int age;
	private char sex;
	private boolean isAlive;
	private Book book;

	public void setAuthorName(String name) {
		this.name = name;
	}
	public void setAuthorAge(int age) {
		this.age = age;
	}
	public void setAuthorSex(char sex) {
		this.sex = sex;
	}
	public boolean setIsAlive(boolean check) {
		if(this.isAlive == check) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public void setAuthorBook(Book book) {
		this.book = book;
	}

	public void printAuthorName() {
		System.out.println("Author's name: " + name);
	}
	public void printAuthorAge() {
		System.out.println("Author's age: " + age);
	}
	public void printAuthorSex() {
		System.out.println("Author's sex: " + sex);
	}
	public void printAuthorBook() {
		book.printBookInfo();
	}
	public void printIsAlive() {
		if(isAlive = true)
		{
			System.out.println("Alive");
		}
		else 
		{
			System.out.println("Rest in peace...");
		}
	}
	public void printAuthorInfo() {
		this.printAuthorName();
		this.printAuthorAge();
		this.printAuthorSex();
		this.printIsAlive();
		this.printAuthorBook();
	}
}
