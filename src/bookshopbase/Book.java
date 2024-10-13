package bookshopbase;

public class Book {
	private String title;
	private String author;
	private boolean alreadyRead;

	// Constructor 1
	public Book(String t, String a, boolean ar) {
		this.title = t;
		this.author = a;
		this.alreadyRead = ar;
	}

	// Constructor 2
	public Book(String t, String a) {
		this.title = t;
		this.author = a;
		this.alreadyRead = false; // it means the book is not read yet
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isAlreadyRead() {
		return alreadyRead;
	}

	public void setAlreadyRead(boolean alreadyRead) {
		this.alreadyRead = alreadyRead;
	}

	@Override
	public String toString() {
		return "Book [title=" + getTitle() + ", author=" + getAuthor() + ", alreadyRead=" + isAlreadyRead() + "]\n";
	}

}
