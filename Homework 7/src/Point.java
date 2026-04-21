public class Point implements Comparable<Point>{
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point other = (Point) o;
            return x == other.x && y == other.y;
        } else {
            return false;
        }
    }

    public int getx() {
        return x;
    }

    public int gety() {
        return y;
    }

    public void setx(int newx) {
        x = newx;
    }

    public void sety(int newy) {
        y = newy;
    }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public double distanceTo(Point other) {
        int dx = x - other.x;
        int dy = y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public int compareTo(Point other) {
        if (y != other.y) {
        	// Compare y-coordinates
            return Integer.compare(y, other.y); 
        } else {
        	 // If y-coordinates are equal, compare x-coordinates
            return Integer.compare(x, other.x);
        }
    }
}