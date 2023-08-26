package bookReading;

public class Author {
	String name;
	int age;
	char sex;
	boolean isAlive;
	Book book;
	
	
	/*void setName (String newName) {
		name = newName;
	}
	void setAge (int newAge) {
		age = newAge;
	}
	void setSex (char newSex) {
		sex = newSex;
	}*/
	/*void setBook (Book newBook) {
	book = newBook;
	}*/
	boolean setIsAlive (boolean check) {
		
		if (this.isAlive == check)
		{
			//System.out.println("Alive");
			return true;
		}
		else
		{	
			//System.out.println("Dead");
			return false;
		}
	}
	
	void setName (String name) {
		this.name = name;
	}
	void setAge (int age) {
		this.age = age;
	}
	void setSex (char sex) {
		this.sex = sex;
	}
	void setBook (Book book) {
		this.book = book;
	}
}
