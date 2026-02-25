public class Library {

    // Variables
    String name;
    int year;

    // Array of books
    Book[] books;

    // Constructor
    Library(String name, int year, Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;

    }

    // Method
    void displayInfo() {
        System.out.println("The " + this.year + " " + this.name);
        System.out.println("Books Available:");
        for (Book book : books) {
            System.out.println(book.displayInfo());
        }
    }
}
