package aufgaben.printmedia;

public abstract class PrintMedia {
    private String title;
    private double price;
    private Publisher publisher;

    public PrintMedia() { }

    // SETTER
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    // GETTER
    public String getTitle() {
        return title;
    }

    // METHODS
    public String toString() {
        return title + "\n" + "Price: " + price;
    }

}
