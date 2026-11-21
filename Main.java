import java.util.Scanner;

public class Main {

    public static void BasketballScoreboar(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("===== BASKETBALL SCOREBOARD =====");

        Game.displaySport();

        System.out.print("Enter first team name: ");
        String name1 = scan.nextLine();

        System.out.print("Enter second team name: ");
        String name2 = scan.nextLine();

        Team team1 = new Team(name1);
        Team team2 = new Team(name2);

        Game game = new Game(team1, team2);

        for (int quarter = 1; quarter <= 4; quarter++) {

            System.out.println("\nQuarter " + quarter);

            System.out.print("Points for " + name1 + ": ");
            int score1 = scan.nextInt();

            System.out.print("Points for " + name2 + ": ");
            int score2 = scan.nextInt();

            game.addQuarterScore(score1, score2);
        }

        game.displayResults();

        scan.close();
    }
}
