package bookReading;

public class Book {
	String title;
	int page;
	int currentPage;
	String type;
	boolean isHardCover;
	Author author;
	Reader currentReader;
	int isFinished;
	
	void setTitle (String newTitle) {
		title = newTitle;
	}
	void setPage (int newPage) {
		page = newPage;
	}
	void setType (String newType) {
		type = newType;
	}
	boolean setCoverType (boolean coverType) {
			if(isHardCover = coverType) {
				return true;
			}
			else {
				return false;
			}
	}
	void getAuthor (Author newAuthor) {
		author = newAuthor;
	}
	void getReader (Reader newReader) {
		currentReader = newReader;
	}
	void getPage (int newCurrentPage) {
		currentPage = newCurrentPage;
		System.out.println("Bookmarked " + currentPage);
	}
	void isFinished () {
		if(page == currentPage)
		{
			System.out.println("Book is finished");
		}
		else
		{
			System.out.println("There are " + (page - currentPage) + " pages left to read.");
		}
	}

}
