import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a priedra, papel y tijera.");
        System.out.println("Este juego es para dos personas.");

        //Ingreso nombres de jugadores y los creo como objetos.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre del primer participante");
        Gamer playerOne = new Gamer(scanner.nextLine());
        System.out.println("Ingresa el nombre del segundo participante");
        Gamer playerTwo= new Gamer(scanner.nextLine());

       //Creo la partida como una instancia de Game.
        Game partida1 = new Game();
        System.out.println("Cuando sea tu turno, ingresa la palabra piedra, papel o tijera en minúscula. " +
                "Si desean parar de jugar, el jugador 1 debe ingresar un * en su turno");;

        System.out.println("Es el turno de " + playerOne.getName());
        String jugadaPlayerOne = scanner.nextLine();
        System.out.println("Es el turno de " + playerTwo.getName());
        String jugadaPlayerTwo = scanner.nextLine();
        int winner;
        winner = partida1.whoWins(jugadaPlayerOne, jugadaPlayerTwo);
        while(jugadaPlayerOne !="*"){
            partida1.addPlayedGames(1);
            //Guardo la jugada de cada jugador.
            System.out.println("Es el turno de " + playerOne.getName());
            jugadaPlayerOne = scanner.nextLine();
            System.out.println("Es el turno de " + playerTwo.getName());
            jugadaPlayerTwo = scanner.nextLine();
            winner = partida1.whoWins(jugadaPlayerOne, jugadaPlayerTwo);
            switch (winner) {
                case 0:
                    System.out.println("Ambos están empatados, no hay puntos");
                    break;
                case 1:
                    System.out.println("El ganador es: " + playerOne.getName());
                    playerOne.setPoints(1);
                    System.out.println(playerOne.getName() + " tienes " + playerOne.getPoints() + " punto.");
                    break;
                case 2:
                    System.out.println("El ganador es: " + playerTwo.getName());
                    playerTwo.setPoints(1);
                    System.out.println(playerTwo.getName() + " tienes " + playerTwo.getPoints() + " punto.");
                    break;
                case 3:
                    System.out.println("Alguno de los jugadores entró un valor inválido. "
                            + "Ingresa 1 para Piedra, 2 para Papel y 3 para Tijera y espera un momento.");
                    break;
                case 4:
                    System.out.println("Acabas de terminar el juego. Jugaron " + partida1.getPlayedGames() + " juegos.");
                    System.out.println("Los puntos de " + playerOne.getName() + " son: " + playerOne.getPoints());
                    System.out.println("Los puntos de " + playerTwo.getName() + " son: " + playerTwo.getPoints());
                    jugadaPlayerOne = "*";
                    break;
            }
        }
        System.out.println("Hasta la próxima.");
    }
}