import java.util.Arrays;

public class Game {
    int playedGames;
    String[] rightOptions;

    public Game(String[] rightOptions) {
        this.rightOptions = rightOptions;
    }

    public int getPlayedGames() {
        return playedGames;
    }

    public void setPlayedGames(int playedGames) {
        this.playedGames = playedGames;
    }

    int whoWins(String playerOneOption, String playerTwoOption) {

        if (Arrays.stream(this.rightOptions).anyMatch(i -> i == playerOneOption) && Arrays.stream(this.rightOptions).anyMatch(i -> i == playerTwoOption)){
            if (playerOneOption == playerTwoOption){
                return 0;
            }
            if (playerOneOption == "1") {
                switch (playerTwoOption) {
                    case "2":
                        return 2;
                    case "3":
                        return 1;
                }
            }
            else if(playerOneOption == "2") {
                switch (playerTwoOption) {
                    case "1":
                        return 1;
                    case "3":
                        return 2;
                }
            }
            else {
                switch (playerTwoOption) {
                    case "1":
                        return 2;
                    case "2":
                        return 1;
                }
            }
        }
        if (playerOneOption == "*") {
            return 4;
        }
        return 3;
    }