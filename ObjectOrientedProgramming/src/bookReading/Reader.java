package bookReading;

public class Reader {
	String name;
	int age;
	char sex;
	Book book;
	
	
	void setName (String newName) {
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
	}

}
