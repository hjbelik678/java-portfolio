import java.util.Random;

class Frog implements Animal {
    private int x; // X-coordinate
    private int y; // Y-coordinate

    public Frog(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move() {
        Random rand = new Random();
        int direction = rand.nextInt(4); // 4 possible directions

        if (direction == 0) {
            x += 2; // Move horizontally 2 units
        } else if (direction == 1) {
            y += 2; // Move vertically 2 units
        } else if (direction == 2) {
            x -= 2; // Move diagonally left-down 2 units
            y -= 2;
        } else if (direction == 3) {
            x += 2; // Move diagonally right-down 2 units
            y -= 2;
        }
    }
}

