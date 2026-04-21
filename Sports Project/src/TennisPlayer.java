public class TennisPlayer extends Player {
    private int ranking;

    // Constructor
    public TennisPlayer(String name, int number, double salary, int ranking) {
        super(name, number, salary);
        this.ranking = ranking;
    }

    // Additional method specific to tennis players
    public int getRanking() {
        return ranking;
    }
    public String toString() {
    	return "Tennis Player";
    }
}