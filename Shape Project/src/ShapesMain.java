public class ShapesMain {
    public static void main(String[] args) {
        ThreeDimensionalShape Sphere = new Sphere(1.5);
        ThreeDimensionalShape TriangularPrism = new TriangularPrism(1.0, 1.5, 2);
        ThreeDimensionalShape Cylinder = new Cylinder(1.5, 2);
        ThreeDimensionalShape Cube = new Cube(2);
        ThreeDimensionalShape Cone = new Cone(1.5, 2);

        displayinfo(Sphere);
        displayinfo(TriangularPrism);
        displayinfo(Cylinder);
        displayinfo(Cube);
        displayinfo(Cone);
    }

    public static void displayinfo(ThreeDimensionalShape n) {
        System.out.println(n.toString() + " has a volume of " + n.getVolume() + "cubic units, and a surface area of " + n.getSurfaceArea() + "square units.");
    }
}