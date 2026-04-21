import java.util.Random;

class Rabbit implements Animal {
    private int x; // X-coordinate
    private int y; // Y-coordinate

    public Rabbit(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move() {
        Random rand = new Random();
        int direction = rand.nextInt(8); // 8 possible directions

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
