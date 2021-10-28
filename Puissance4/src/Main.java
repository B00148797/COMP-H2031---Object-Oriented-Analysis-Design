public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        Player player1 = new Player(ANSI_RED + "Thomas" + ANSI_RESET);
        Player player2 = new Player(ANSI_YELLOW + "Gabriel" + ANSI_RESET);
        System.out.println("Bonjour " + player1.getName() + " et " + player2.getName() + ", commençons une nouvelle partie.");

        Integer nombreDeTour = 0;

        Board myBoard = new Board();
        myBoard.PrintBoard();
    }
}
