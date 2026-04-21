public class SportsMain {
    public static void main(String[] args) {
        BasketballPlayer basketballPlayer = new BasketballPlayer("Michael Jordan", 23, 94000000, 45.5);
        SoccerPlayer soccerPlayer = new SoccerPlayer("Messi", 10, 45000000, 30);
        TennisPlayer tennisPlayer = new TennisPlayer("Serena Williams", 1, 45300000, 1);

        System.out.println(basketballPlayer.getName() + " has a vertical jump height of " + basketballPlayer.getVerticalJumpHeight());
        System.out.println(soccerPlayer.getName() + " has scored " + soccerPlayer.getGoalsScored() + " goals.");
        System.out.println(tennisPlayer.getName() + " is currently ranked number " + tennisPlayer.getRanking() + " in tennis.");
    }
}