public class Cylinder extends DimensionalShape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
    public String toString() {
    	return "Cylinder";
    }
}