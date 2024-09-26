package aufgaben.printmedia;

public class Book extends PrintMedia {
    private Author author;
    private String isbn;

    public Book() {
    }

    // SETTER
    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // GETTER
    public Author getAuthor(Author author) {
        return this.author;
    }

    // METHODS
    public String toString() {
        return "\n" + getTitle() + author.toString() + "\nISBN: " + isbn;
    }

}
