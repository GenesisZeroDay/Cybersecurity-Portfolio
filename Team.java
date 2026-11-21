
public class Team {

    private String teamName;
    private int score;

    public Team(String name) {
        teamName = name;
        score = 0;
    }

    public void addPoints(int points) {
        score = score + points;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return teamName;
    }

    public void displayInfo() {
        System.out.println(teamName + ": " + score);
    }
}
