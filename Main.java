package aufgaben.printmedia;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {


// MAGAZINES
        // CT
        Magazine ctMagazine = new Magazine();
        ctMagazine.setTitle("c't magazin für computer technik");
        ctMagazine.setPublisher(new Publisher("Heise Medien GmbH"));
        ctMagazine.setPublicationFrequency("Biweekly");
        ctMagazine.setIssn("0724-8679");
        ctMagazine.setPrice(4.90);

        // PUBLISHER-ADDRESS (CT)
        Address heiseAddress = new Address();
        heiseAddress.setStreet("Karl-Wiechert-Allee");
        heiseAddress.setHouseNr("10");
        heiseAddress.setZipCode("30625");
        heiseAddress.setCity("Hannover");

        // Spektrum
        Magazine spektrum = new Magazine();
        spektrum.setTitle("Spektrum");
        spektrum.setPublisher(new Publisher("Spektrum der Wissenschaft Verlagsgesellschaft mbH"));
        spektrum.setPublicationFrequency("Monthly");
        spektrum.setIssn("0170-2971");
        spektrum.setPrice(8.50);

        System.out.println("MAGAZINES\n--------------------");
        System.out.println(ctMagazine.toString());
        System.out.println();

        System.out.println(spektrum.toString());
        System.out.println();

// BOOKS
        // Clean Code
        Book cleanCode = new Book();
        cleanCode.setTitle("Clean Code");
        cleanCode.setAuthor(new Author("Robert C.","Martin"));
        cleanCode.setPublisher(new Publisher("mitp Verlags GmbH & Co. KG"));
        cleanCode.setIsbn("978-3826655487");
        cleanCode.setPrice(39.95);

        // PUBLISHER-ADDRESS (Clean Code)
        Address mitpAddress = new Address();
        mitpAddress.setStreet("Augustinusstraße");
        mitpAddress.setHouseNr("9a");
        mitpAddress.setZipCode("50226");
        mitpAddress.setCity("Frechen");

        System.out.println("BOOKS\n--------------------");
        System.out.println(cleanCode.toString());
        System.out.println();

// CALENDARS
        WallCalendar natGeo = new WallCalendar();
        natGeo.setTitle("National Geographic \"Der Kalender 2019\"");
        natGeo.setPublisher(new Publisher("teNeues Calendars & Stationery GmbH & Co. KG"));
        natGeo.setMeasurements(new Measurements(64, 48));
        // PUBLISHER-ADDRESS (natGeo Calendar) nicht angegeben

        System.out.println("CALENDARS\n--------------------");
        System.out.println(natGeo.toString());

    }
}
