public class SoccerPlayer extends Player {
    private int goalsScored;

    // Constructor
    public SoccerPlayer(String name, int number, double salary, int goalsScored) {
        super(name, number, salary);
        this.goalsScored = goalsScored;
    }

    // Additional method specific to soccer players
    public int getGoalsScored() {
        return goalsScored;
    }
    public String toString() {
    	return "Soccer Player";
    }
}
