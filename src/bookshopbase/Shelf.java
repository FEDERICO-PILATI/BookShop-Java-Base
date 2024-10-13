package bookshopbase;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
	private final int capacity;
	private ArrayList<Book> books;
	private final String shelfName;

	// Constructor
	public Shelf(String shelfName, int cap) {
		this.shelfName = shelfName;
		this.capacity = cap;
		this.books = new ArrayList<>();
	}

	// adds the book only if its maximum capacity is not exceeded
	public void addBook(Book book) {
		if (books.size() < capacity) {
			books.add(book);
			System.out.println("Book added to the shelf");
		} else {
			System.out.println("The shelf is full, cannot add more books");
		}
	}

	// deletes the book only if it is contained in the shelf
	public void removeBook(Book book) {
		if (books.contains(book)) {
			books.remove(book);
			System.out.println("Book succesfully removed from this shelf");
		} else {
			System.out.println("Book is not contained in this shelf");
		}
	}

	// given the title it finds the index of the book
	private int findIndexByTitle(String title) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getTitle().equals(title)) {
				return i;
			}
		}
		return -1; // -1 means not found
	}

	// removes the book by index
	public Book removeBookByTitle(String title) throws Exception {
		int index = findIndexByTitle(title);
		// if index >= 0 means that the index exists
		if (index >= 0) {
			return books.remove(index);
		} else {
			throw new Exception(title);
		}
	}

	// finds the book by index
	public Book findBookByTitle(String title) throws Exception {
		int index = findIndexByTitle(title);
		// if index >= 0 means that the index exists
		if (index >= 0) {
			return books.get(index);
		} else {
			throw new Exception(title);
		}
	}

	// shows all the not-read books
	public List<Book> findNotReadBooks() {
		List<Book> notRead = new ArrayList<>();
		for (int i = 0; i < books.size(); i++) {
			// if the book has never been read
			if (books.get(i).isAlreadyRead() == false) {
				notRead.add(books.get(i));
			}
		}
		return notRead; // not read yet books
	}

	@Override
	public String toString() {
		return "[Name of the shelf: " + shelfName + ", with capacity of: " + capacity
				+ " books, containing these books:\n" + books + "]";
	}

}
