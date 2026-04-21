public class BasketballPlayer extends Player {
    private double verticalJumpHeight;

    // Constructor
    public BasketballPlayer(String name, int number, double salary, double verticalJumpHeight) {
        super(name, number, salary);
        this.verticalJumpHeight = verticalJumpHeight;
    }

    // Additional method specific to basketball players
    public double getVerticalJumpHeight() {
        return verticalJumpHeight;
    }
    public String toString() {
    	return "Basketball Player";
    }
}