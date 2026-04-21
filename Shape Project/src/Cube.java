public class Cube extends DimensionalShape {
    private double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getVolume() {
        return Math.pow(sideLength, 3);
    }

    public double getSurfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }
    public String toString() {
    	return "Cube";
    }
}