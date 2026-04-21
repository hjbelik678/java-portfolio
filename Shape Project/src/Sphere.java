class Sphere extends DimensionalShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }
    public String toString() {
    	return "Sphere";
    }
}