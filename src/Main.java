import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a priedra, papel y tijera.");
        System.out.println("Este juego es para dos personas.");

        //Creo el número de jugadas posibles antes de crear la partida.
        String[] optionsToPlay = new String[3]; //Creo el arreglo que define cuántas jugadas son posibles.
        optionsToPlay[0] = "1";
        optionsToPlay[1] = "2";
        optionsToPlay[2] = "3";

        //Ingreso y guardo nombres de jugadores antes de crear los objetos de jugadores, para poder pasar el nombre.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre del primer participante");
        String firstPlayer = scanner.nextLine();
        System.out.println("Ingresa el nombre del segundo participante");
        String secondPlayer = scanner.nextLine();

        // Creo a los dos objetos de jugadores
        Gamer playerOne = new Gamer(firstPlayer);
        Gamer playerTwo = new Gamer(secondPlayer);

        // Una vez tenog lso jugadores y las jugadas posibles creo la primera partida.
        //Creo un ciclo para saber cuándo parar de jugar. Para parar de jugar el jugador 1 debe ingresar un *.

        while (playerOne.getPlayedOption()!="*"){
            Game partida1 = new Game(optionsToPlay);
            partida1.setPlayedGames(1);
            System.out.println("Existen tres posibles jugadas.");
            System.out.println("Cuando sea tu turno, ingresa 1 para Piedra, 2 para Papel y 3 para Tijera. " +
                    "Si desean parar de jugar, el jugador 1 debe ingresar un * en su turno");


            while(playerOne.getPlayedOption()!="*"){
                //Guardo la jugada de cada jugador.
                System.out.println("Es el turno de " + playerOne.getName());
                playerOne.setPlayedOption(scanner.nextLine());
                System.out.println("Es el turno de " + playerTwo.getName());
                playerTwo.setPlayedOption(scanner.nextLine());
                int winner = partida1.whoWins(playerOne.getPlayedOption(), playerTwo.getPlayedOption());
                switch (winner) {
                    case 0:
                        System.out.println("Ambos están empatados, no hay puntos");
                        break;
                    case 1:
                        System.out.println("El ganador es: " + playerOne.getName());
                        playerOne.setPoints(1);
                        System.out.println(playerOne.getName() + "tienes " + playerOne.getPoints());
                        break;
                    case 2:
                        System.out.println("El ganador es: " + playerTwo.getName());
                        playerTwo.setPoints(1);
                        System.out.println(playerTwo.getName() + "tienes " + playerTwo.getPoints());
                        break;
                    case 3:
                        System.out.println("Alguno de los jugadores entró un valor inválido. "
                                + "Ingresa 1 para Piedra, 2 para Papel y 3 para Tijera y espera un momento.");
                        break;
                    case 4:
                        break;
                }
            }
            System.out.println("Acabas de terminar el juego.");
            System.out.println("Los puntos de " + playerOne.getName() + "son: " + playerOne.getPoints());
            System.out.println("Los puntos de " + playerTwo.getName() + "son: " + playerTwo.getPoints());
            System.out.println("Hasta la próxima.");
        }
    }
}