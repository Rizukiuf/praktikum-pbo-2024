interface Book {
	void displayInfo();
}

abstract class AbstractBook implements Book {
	protected String title;
	protected String author;
	protected int year;

	public AbstractBook(String title, String author, int year) {
			this.title = title;
			this.author = author;
			this.year = year;
	}
}

class RegularBook extends AbstractBook {
	private int publicationYear;

	public RegularBook(String title, String author, int year, int publicationYear) {
			super(title, author, year);
			this.publicationYear = publicationYear;
	}

	@Override
	public void displayInfo() {
			System.out.println("Title: " + title);
			System.out.println("Author: " + author);
			System.out.println("Year: " + year);
			System.out.println("Publication Year: " + publicationYear);
	}
}

class ReferenceBook extends AbstractBook {
	private String isbn;

	public ReferenceBook(String title, String author, int year, String isbn) {
			super(title, author, year);
			this.isbn = isbn;
	}

	@Override
	public void displayInfo() {
			System.out.println("Title: " + title);
			System.out.println("Author: " + author);
			System.out.println("Year: " + year);
			System.out.println("ISBN: " + isbn);
	}
}

public class Library {
	public static void main(String[] args) {
			RegularBook regularBook = new RegularBook("Java Programming", "John Doe", 2020, 2020);
			ReferenceBook referenceBook = new ReferenceBook("Design Patterns", "Gang of Four", 1994, "978-0201633610");

			System.out.println("Regular Book Info:");
			regularBook.displayInfo();
			System.out.println();

			System.out.println("Reference Book Info:");
			referenceBook.displayInfo();
	}
}
