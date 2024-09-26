package aufgaben.printmedia;

public class Magazine extends PrintMedia {
    private Publisher publisher;
    private String issn;
    private String publicationFrequency;

    public Magazine() {
    }

    // SETTER
    public void setIssn(String issn) {
        this.issn = issn;
    }

    public void setPublicationFrequency(String publicationFrequency) {
        this.publicationFrequency = publicationFrequency;
    }

    // METHODS
    public String toString() {
        return "\n" + getTitle()
                + "\nPublisher: " + null
                + "\nISSN: " + issn + "\n"
                + "Publication frequency: "
                + publicationFrequency;
    }
}
