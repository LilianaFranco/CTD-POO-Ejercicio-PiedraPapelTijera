public class Game {
    int playedGames;

    public void Game() {
        this.playedGames = 0;
    }

    public int getPlayedGames() {
        return playedGames;
    }

    public void setPlayedGames(int playedGames) {
        this.playedGames = playedGames;
    }

    public void addPlayedGames(int newGame){
        this.playedGames = playedGames + newGame;
    }

    int whoWins(String playerOne, String playerTwo) {

        if (playerOne.equals(playerTwo)){
            return 0;
        }
        if (playerOne.equals("1") && playerTwo.equals("2")) {
            return 2;
        }
        if (playerOne.equals("1") && playerTwo.equals("3")) {
            return 1;
        }
        if (playerOne.equals("2") && playerTwo.equals("1")) {
            return 1;
        }
        if (playerOne.equals("2") && playerTwo.equals("3")) {
            return 2;
        }
        if (playerOne.equals("3") && playerTwo.equals("1")) {
            return 2;
        }
        if (playerOne.equals("3") && playerTwo.equals("2")) {
            return 1;
        }
        if (playerOne.equals("*")){
            return 4;
        }
        return 3;
    }
}