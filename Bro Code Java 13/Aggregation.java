public class Aggregation {
    public static void main(String[] args) {

        // Aggregation = Represents a "has-a" relationship between objects
        // One object contains another object as part of its structure,
        // but the conatined object/s can exists independently

        // object can contain another object , but those objects can exist independently
        // book objects , library objects to contain book objects
        // the books and the library can exist independently
        // thats aggregation
        // the library object will have has-a relationship with book objects
        // Our library object has book objects within it

        // Three book objects
        Book book1 = new Book("The Fellow of the Ring", 423);
        Book book2 = new Book("The Two Tower", 352);
        Book book3 = new Book("The Return of the King", 416);

        // Array of Book Objects
        Book[] books = { book1, book2, book3 };

        for (Book book : books) {
            System.out.println(book.displayInfo());
        }
        System.out.println("------------");
        // Library object
        // Aggregation
        Library library = new Library("NYC Public Library", 1897, books);

        library.displayInfo();
    }
}
