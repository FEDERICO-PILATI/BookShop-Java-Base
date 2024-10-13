package bookshopbase;

public class TestBookshop {

	public static void main(String[] args) {

		Shelf fantasy = new Shelf("fantasy", 3);

		Book book1 = new Book("Eragon", "Cristopher Paolini");
		Book book2 = new Book("Harry Potter", "J.K. Rowling");
		Book book3 = new Book("Artemis Fowl", "Eoin Colfer");
		Book book4 = new Book("Percy Jackson", "Rick Riordan");

		fantasy.addBook(book1);
		fantasy.addBook(book2);
		fantasy.addBook(book3);
		System.out.println();
		System.out.println(); // add some space in console

		System.out.println(fantasy);
		System.out.println();
		System.out.println(); // add some space in console

		fantasy.addBook(book4);
		System.out.println();
		System.out.println(); // add some space in console

		System.out.println(fantasy);
		System.out.println();
		System.out.println(); // add some space in console

		Bookshelf bookshelf = new Bookshelf();

		bookshelf.addShelf(fantasy);
		System.out.println();
		System.out.println(); // add some space in console

		System.out.println(bookshelf);

	}

}
