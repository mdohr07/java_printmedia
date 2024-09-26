package aufgaben.printmedia;

public class Publisher {
    private String name;
    private Address address;

    public Publisher(String name) {
        this.name = name;
    }

    // SETTER
    public void setAddress(Address address) {
        this.address = address;
    }

    // GETTER
    public String getName() {
        return name;
    }

    public Address getAddress() {
        return this.address;
    }

    // METHODS
    public String toString() {
        return "Publisher: " + name + "\nAddress: " + address;
    }
}
