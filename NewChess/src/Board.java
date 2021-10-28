import java.util.HashMap;
import java.util.Map;

public class Board {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";

    Piece piece;

    public Map<Character, Integer> dictionaryKey = new HashMap<Character, Integer>(){{
        put('A', 0);
        put('B', 1);
        put('C', 2);
        put('D', 3);
        put('E', 4);
        put('F', 5);
        put('G', 6);
        put('H', 7);
    }
    };

    public Map<Character, Piece> dictionaryPiece = new HashMap<Character, Piece>(){{
        put('♚', Piece.ROI_BLANC);
        put('♛', Piece.DAME_BLANC);
        put('♝', Piece.FOUS_BLANC);
        put('♞', Piece.CAVALIERS_BLANC);
        put('♜', Piece.TOURS_BLANC);
        put('♟', Piece.PIONS_BLANC);
        put('♔', Piece.ROI_NOIR);
        put('♕', Piece.DAME_NOIR);
        put('♗', Piece.FOUS_NOIR);
        put('♘', Piece.CAVALIERS_NOIR);
        put('♖', Piece.TOURS_NOIR);
        put('♙', Piece.PIONS_NOIR);
    }
    };

    public String board[][] = {
            {"♜","♞","♝","♛","♚","♝","♞","♜"},
            {"♟","♟","♟","♟","♟","♟","♟","♟"},
            {"","","","","","","",""},
            {"","","","","","","",""},
            {"","","","","","","",""},
            {"","","","","","","",""},
            {"♙","♙","♙","♙","♙","♙","♙","♙"},
            {"♖","♘","♗","♕","♔","♗","♘","♖"}
    };

    public Board() {
    }

    public void PrintBoard(){
        for (int i = 0; i < board.length; i++){
            System.out.print(ANSI_CYAN + (i + 1) + "\t" + ANSI_RESET);
            for (int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println(ANSI_YELLOW + "\t" + "A\tB\tC\tD\tE\tF\tG\tH" + ANSI_RESET);
    }

    private boolean MovementPossibleOrNot(Piece piece){
        switch (piece){
            case PIONS_BLANC:
                break;
            case PIONS_NOIR:
                break;
        }
        return false;
    }

    public void AddPiece(Character colone, Integer ligne){
        board[ligne][dictionaryKey.get(colone)] = "♡";
        PrintBoard();
    }

    public void MovePieceCollisionFree(Character oldColone, Integer oldLigne, Character newColone, Integer newLigne){
        board[newLigne][dictionaryKey.get(newColone)] = board[oldLigne][dictionaryKey.get(oldColone)];
        board[oldLigne][dictionaryKey.get(oldColone)] = "";
        PrintBoard();
    }

    public boolean MovePieceCollision(Character oldColone, Integer oldLigne, Character newColone, Integer newLigne){
        if (board[newLigne][dictionaryKey.get(newColone)].isEmpty()){

            if (MovementPossibleOrNot(dictionaryPiece.get(board[oldLigne][dictionaryKey.get(oldColone)])));

            board[newLigne][dictionaryKey.get(newColone)] = board[oldLigne][dictionaryKey.get(oldColone)];
            board[oldLigne][dictionaryKey.get(oldColone)] = "";
        }else {
            PrintBoard();
            System.out.println(ANSI_RED + "Ce déplacement n'est pas possible." + ANSI_RESET);
            return false;
        }
        PrintBoard();
        return true;
    }
}
