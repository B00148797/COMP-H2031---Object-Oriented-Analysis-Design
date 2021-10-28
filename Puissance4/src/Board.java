public class Board {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public String board[][] = {
            {"","","","","","",""},
            {"","","","","","",""},
            {"","","","","","",""},
            {"","","","","","",""},
            {"","","","","","",""},
            {"","","","","","",""}
    };

    public Board() {
    }

    public void PrintBoard(){
        for (int i = 0; i < board.length; i++){
            System.out.print(ANSI_CYAN + (6 - i) + "\t" + ANSI_RESET);
            for (int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println(ANSI_BLUE + "\t" + "A\tB\tC\tD\tE\tF\tG\tH" + ANSI_RESET);
    }
}
