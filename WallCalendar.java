package aufgaben.printmedia;

public class WallCalendar extends PrintMedia {
    private String title;
    private Measurements measurements;

    public WallCalendar() {
    }

    // SETTER
    public void setMeasurements(Measurements measurements) {
        this.measurements = measurements;
    }

    // METHODS
    public String toString() {
        return "\n" + getTitle() + "\nMeasurements: " + measurements.toString();
    }

}
