import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        /*System.out.print(ANSI_PURPLE + "Joueur 1 donne moi ton prénom : " + ANSI_RESET);
        String namePlayer1 = myScanner.nextLine();
        System.out.print(ANSI_PURPLE + "Joueur 2 donne moi ton prénom : " + ANSI_RESET);
        String namePlayer2 = myScanner.nextLine();
        Player player1 = new Player(ANSI_BLUE + namePlayer1 + ANSI_RESET);
        Player player2 = new Player(ANSI_GREEN + namePlayer2 + ANSI_RESET);*/

        Player player1 = new Player(ANSI_BLUE + "Thomas" + ANSI_RESET);
        Player player2 = new Player(ANSI_GREEN + "Gabriel" + ANSI_RESET);
        System.out.println("Bonjour " + player1.getName() + " et " + player2.getName() + ", commençons une nouvelle partie.");

        Integer nombreDeTour = 0;

        Board myBoard = new Board();
        myBoard.PrintBoard();

        while (true){
            if ((nombreDeTour % 2) == 0){
                System.out.print(ANSI_PURPLE + "C'est à " + player1.getName() + ANSI_PURPLE + " de jouer : " + ANSI_RESET);
            }else{
                System.out.print(ANSI_PURPLE + "C'est à " + player2.getName() + ANSI_PURPLE + " de jouer : " + ANSI_RESET);
            }

            String command = myScanner.nextLine();

            //Quitte le programme avec la touche "Q"
            if (command == "Q") System.exit(1);

            //Permet d'ajouter le piece a l'échiquier (c'est de la triche)
            //myBoard.AddPiece(command.charAt(0), Integer.parseInt(String.valueOf(command.charAt(1))) - 1);

            //Permet de deplacer une piece a un emplacement (sans les régle Godmod)
            myBoard.MovePieceCollisionFree(
                    command.charAt(0),
                    Integer.parseInt(String.valueOf(command.charAt(1))) - 1,
                    command.charAt(2),
                    Integer.parseInt(String.valueOf(command.charAt(3))) - 1
            );
            nombreDeTour += 1;

            //Permet de deplacer une piece a un emplacement (avec la régle des collision)
            /*if (
                    myBoard.MovePieceCollision(
                    command.charAt(0),
                    Integer.parseInt(String.valueOf(command.charAt(1))) - 1,
                    command.charAt(2),
                    Integer.parseInt(String.valueOf(command.charAt(3))) - 1
            )){
                nombreDeTour += 1;
            }*/
        }
    }
}
