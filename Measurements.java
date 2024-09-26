package aufgaben.printmedia;

public class Measurements {
    private int width;
    private int height;

    public Measurements(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // METHODS
    public String toString() {
        return width + " cm" + " x " + height + " cm";
    }

}
