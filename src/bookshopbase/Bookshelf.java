package bookshopbase;

import java.util.ArrayList;

public class Bookshelf {
	private ArrayList<Shelf> shelves;

	// Constructor
	public Bookshelf() {
		this.shelves = new ArrayList<Shelf>();
	}

	public void addShelf(Shelf shelf) {
		shelves.add(shelf);
		System.out.println("Shelf succesfully added to this Bookshelf");
	}

	public void removeShelf(Shelf shelf) {
		shelves.remove(shelf);
		System.out.println("Shelf succesfully removed from this bookshelf");
	}

	@Override
	public String toString() {
		return "Bookshelf [contained shelves:" + shelves + "]";
	}

}
