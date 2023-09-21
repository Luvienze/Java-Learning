package bookReadinWithEncapsulation;


public class ReaderTest {
	public static void main(String[] args) {
		
		//Author
		Author author1 = new Author();
		Author author2 = new Author();
		
		author1.setAuthorName("Frank Herbert");
		author1.setAuthorAge(66);
		author1.setAuthorSex('M');
		author1.setIsAlive(false);
		
		author2.setAuthorName("Emily Bronte");
		author2.setAuthorAge(30);
		author2.setAuthorSex('F');
		author2.setIsAlive(false);
		
		//Book
		Book book1 = new Book();	
		Book book2 = new Book();	
		book1.setBookTitle("Dune");
		book1.setBookType(BookType.Sci_Fi);
		book1.setBookPage(659);
		book1.setCoverType(true);
		book1.setBookAuthor(author1);
		
		book2.setBookTitle("Wuthering Heights");
		book2.setBookType(BookType.Drama);
		book2.setBookType(BookType.Romance);
		book2.setBookPage(408);
		book1.setCoverType(false);
		book2.setBookAuthor(author2);
		
		//Reader
		Reader reader1 = new Reader();
		Reader reader2 = new Reader();
		
		reader1.setReaderName("Eren Sonmez");
		reader1.setReaderAge(21);
		reader1.setReaderSex('M');
		
		reader2.setReaderName("Emma Stone");
		reader2.setReaderAge(34);
		reader2.setReaderSex('F');
		
		//Author's Book
		author1.setAuthorBook(book1);
		author2.setAuthorBook(book2);
		
		book1.setBookAuthor(author1);
		book2.setBookAuthor(author2);
		
		//Readers's Book
		reader1.setReaderBook(book1);
		reader2.setReaderBook(book2);
		
		book1.setReader(reader1);
		book2.setReader(reader2);
		
		//------
		System.out.println("Author's Informations:");
		author1.printAuthorName();
		author1.printAuthorAge();
		author1.printAuthorSex();
		author1.printIsAlive();
		System.out.println("-----");
	
		author2.printAuthorInfo();
		System.out.println("................");
		
		System.out.println("Book's Informations");
		book1.printBookTitle();
		book1.printBookPage();
		book1.printBookType();
		book1.printBookCover();
		book1.printBookAuthorInfo();
		
		System.out.println("................");

		book2.printBookInfo();
		book2.printBookReaderInfo();
		
		System.out.println("................");
		System.out.println("Reader's Informations");
		
		reader1.printReaderName();
		reader1.printReaderAge();
		reader1.printReaderSex();
		reader1.printReaderBook();
		System.out.println("-----");
		
		reader2.printReaderInfo();
		System.out.println("................");
		System.out.println("Reading the book");
		
		reader1.Read(180);
		book1.isFinished();
		
	}

}
