public class Gamer {
    String name;
    String playedOption;
    int points;

    public Gamer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayedOption() {
        return playedOption;
    }

    public void setPlayedOption(String playedOption) {
        this.playedOption = playedOption;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void addWinGame(){
        this.points+=1;
    }
}
