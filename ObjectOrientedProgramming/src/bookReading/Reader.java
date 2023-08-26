package bookReading;

public class Reader {
	String name;
	int age;
	char sex;
	Book book;
	{
		name = "Undefined User";
		age = 20;
		sex = 'F';
	}
	
	
	/*void setName (String newName) {
		name = newName;
	}
	void setAge (int newAge) {
		age = newAge;
	}
	void setSex (char newSex) {
		sex = newSex;
	}
	void read (Book newBook) {
		book = newBook;
	}*/
	void setName (String name) {
		this.name = name;
	}
	void setAge (int age) {
		this.age = age;
	}
	void setSex (char sex) {
		this.sex = sex;
	}
	void read (Book book) {
		this.book = book;
	}
	

}
