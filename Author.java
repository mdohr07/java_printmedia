package aufgaben.printmedia;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // METHODS
    public String toString() {
        return "\nAuthor: " + firstName + " " + lastName;
    }
}
