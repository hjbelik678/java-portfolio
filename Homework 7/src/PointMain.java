import java.util.ArrayList;
import java.util.Collections;

public class PointMain {
    public static void main(String[] args) {
    	// Creating two points
        Point point1 = new Point(3, 5);
        Point point2 = new Point(1, 2);

        System.out.println("Are point1 and point2 equal? " + point1.equals(point2));

        point1.translate(2, -3);
        System.out.println("point1 is now at: " + point1);

        System.out.println("Distance= " + point1.distanceTo(point2));


        System.out.println("Point1's coordinates: (" + point1.getx() + ", " + point1.gety() + ")");
        point1.setx(5);
        point1.sety(8);
        System.out.println("point1 is now at: " + point1);
    	
        ArrayList<Point> points = new ArrayList<>();
        points.add(point1);
        points.add(point2);
        points.add(new Point(1,3));
        points.add(new Point(3, 4));
        points.add(new Point(2, 4));
        
        System.out.println("points: " + points);
        Collections.sort(points);
        System.out.println("points: " + points);
    }
}