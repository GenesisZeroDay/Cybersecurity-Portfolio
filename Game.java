
public class Game {

    public static int gamesPlayed = 0;
    public static String sportName = "Basketball";

    private Team team1;
    private Team team2;

    public Game(Team t1, Team t2) {
        team1 = t1;
        team2 = t2;
        gamesPlayed++;
    }

    public static void displaySport() {
        System.out.println("Sport: " + sportName);
    }

    public void addQuarterScore(int points1, int points2) {
        team1.addPoints(points1);
        team2.addPoints(points2);
    }

    public void displayResults() {

        System.out.println("\n===== FINAL SCOREBOARD =====");

        team1.displayInfo();
        team2.displayInfo();

        if (team1.getScore() > team2.getScore()) {
            System.out.println("Winner: " + team1.getName());
        }
        else if (team2.getScore() > team1.getScore()) {
            System.out.println("Winner: " + team2.getName());
        }
        else {
            System.out.println("The game is a tie!");
        }

        System.out.println("Games played: " + gamesPlayed);
    }
}
