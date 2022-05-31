public class Gamer {
    String name;
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

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {

        this.points = points + this.points;
    }
}
