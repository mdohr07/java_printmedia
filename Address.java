package aufgaben.printmedia;

public class Address {
    private String street;
    private String houseNr;
    private String zipCode;
    private String city;

    public Address() { }

    // SETTER
    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNr(String houseNr) {
        this.houseNr = houseNr;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCity(String city) {
        this.city = city;
    }


    // METHODS
    public String toString() {
        return street + " " + houseNr + ", " + zipCode + " " + city;
    }
}
