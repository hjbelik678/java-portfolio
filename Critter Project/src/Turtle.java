import java.util.Random;

class Turtle implements Animal {
    private int x; // X-coordinate
    private int y; // Y-coordinate

    public Turtle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move() {
        Random rand = new Random();
        int direction = rand.nextInt(4); // 4 possible directions

        if (direction == 0) {
            x += 1; // Move right
        } else if (direction == 1) {
            x -= 1; // Move left
        } else if (direction == 2) {
            y += 1; // Move up
        } else if (direction == 3) {
            y -= 1; // Move down
        }
    }
}
