public class Player implements SportsPlayer {
    private String name;
    private int number;
    private double salary;

    // Constructor
    public Player(String name, int number, double salary) {
        this.name = name;
        this.number = number;
        this.salary = salary;
    }

    // Implementing methods from SportsPlayer interface
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public double getSalary() {
        return salary;
    }
}