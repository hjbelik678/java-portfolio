class TriangularPrism extends DimensionalShape {
    private double baseLength;
    private double height;
    private double sideLength;

    public TriangularPrism(double baseLength, double height, double sideLength) {
        this.baseLength = baseLength;
        this.height = height;
        this.sideLength = sideLength;
    }

    public double getVolume() {
        return (baseLength * height * sideLength) / 2;
    }

    public double getSurfaceArea() {
        return (baseLength * sideLength) + (baseLength * height) + (sideLength * Math.sqrt(Math.pow(baseLength / 2, 2) + Math.pow(height, 2))) * 2;
    }
    public String toString() {
    	return "Triangular Prism";
    }
}