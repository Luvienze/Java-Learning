package bookReading;

public class ReaderTest {

	public static void main(String[] args) {
		//Adding author
		Author author1 = new Author();
		author1.setName("Frank Herbert");
		author1.setAge(78);
		author1.setSex('m');
		author1.setIsAlive(false);
		
		//Writing book
		Book book1 = new Book();
		book1.setTitle("Dune");
		book1.setType("Sci-Fi");
		book1.setPage(600);
		book1.setCoverType(false);
		
		author1.setBook(book1);
		book1.getAuthor(author1);
		
		//Adding Reader
		Reader reader1 = new Reader();
		reader1.setName("Eren");
		reader1.setAge(22);
		reader1.setSex('m');
		reader1.read(book1);
		
		//Reading the book
		reader1.book.getPage(50);
	
		System.out.println("The name of the book is " + book1.title);
		System.out.println("Reader's name is " + reader1.name);
		System.out.println("Name and age of the writer's of the reader's book is " + reader1.book.author.name);
		System.out.println("Is reader's book hardcovered or softcovered ? " + reader1.book.isHardCover);
		reader1.book.isFinished();
		
	}

}
