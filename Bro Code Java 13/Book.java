public class Book {

    // Variables
    String title;
    int pages;

    // Book constructor
    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    // Method
    String displayInfo() {
        return this.title + " (" + this.pages + " pages)";
    }

}
