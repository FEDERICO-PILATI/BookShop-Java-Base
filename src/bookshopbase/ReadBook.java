package bookshopbase;

public class ReadBook extends Book {

	public ReadBook(String t, String a) {
		super(t, a, true); // the book has already been read
	}

	@Override
	public String toString() {
		return "Book [title=" + getTitle() + ", author=" + getAuthor() + ", alreadyRead=" + isAlreadyRead() + "]\n";
	}

}
