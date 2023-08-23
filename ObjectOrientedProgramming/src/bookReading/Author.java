package bookReading;

public class Author {
	String name;
	int age;
	char sex;
	boolean isAlive;
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
	boolean setIsAlive (boolean check) {
		
		if (isAlive == check)
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
	void setBook (Book newBook) {
		book = newBook;
	}
	

}
