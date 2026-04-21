import java.util.Random;

class Mouse implements Animal {
    private int x; // X-coordinate
    private int y; // Y-coordinate

    public Mouse(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move() {
        Random rand = new Random();
        int direction = rand.nextInt(8); // 8 possible directions

        if (direction == 0) {
            x += 1; // Move right
        } else if (direction == 1) {
            x -= 1; // Move left
        } else if (direction == 2) {
            y += 1; // Move up
        } else if (direction == 3) {
            y -= 1; // Move down
        } else if (direction == 4) {
            x += 1; // Move diagonally up-right
            y += 1;
        } else if (direction == 5) {
            x += 1; // Move diagonally down-right
            y -= 1;
        } else if (direction == 6) {
            x -= 1; // Move diagonally up-left
            y += 1;
        } else if (direction == 7) {
            x -= 1; // Move diagonally down-left
            y -= 1;
        }
    }
}
