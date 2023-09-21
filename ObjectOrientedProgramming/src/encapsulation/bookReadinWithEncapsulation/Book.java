ppackage bookReadinWithEncapsulation;

public class Book {
	private String title;
	private int page;
	private int currentPage;
	private BookType bookType;
	private boolean isHardCover;
	private Author author;
	private Reader currentReader;
	private int isFinished;
	
	public void setBookTitle(String title) {
		this.title = title;
	}
	public void setBookAuthor(Author author) {
		this.author = author;
	}
	public void setBookPage(int page) {
		this.page = page;
	}
	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}
	public boolean setCoverType(boolean coverType) {
		if(this.isHardCover = coverType) {
			return true;
		}
		else
		{
			return false;
		}
	}
	public void setReader (Reader currentReader) {
		this.currentReader = currentReader;
	}

	
	public void printBookTitle() {
		System.out.println("Title: " + title);
	}
	public void printBookType() {
		System.out.println("Book type: " + bookType);
	}
	public void printBookPage() {
		System.out.println("Pages: " + page);
	}
	public void printBookCover() {
		if(isHardCover = true) {
			System.out.println("Cover: Hardcovered");
		}
		else
		{
			System.out.println("Cover: Softcovered");
		}
	}
	public void printBookInfo() {
		this.printBookTitle();
		this.printBookType();
		this.printBookPage();
		this.printBookAuthorInfo();
	}
	
	public void printReadingPage(int currentPage) {
		this.currentPage = currentPage;
		System.out.println("Bookmarked " + currentPage);
	}
	public void printBookAuthorInfo() {
		author.printAuthorName();
		author.printAuthorAge();
		author.printAuthorSex();
	}
	public void printBookReaderInfo() {
		currentReader.printReaderInfo();
	}
	public void isFinished() {
		if(this.page == this.currentPage) {
			System.out.println("Book is finished");
		}
		else {
			System.out.println("There are " + (page - currentPage) + " pages left to read.");
		}
	}
	
}
