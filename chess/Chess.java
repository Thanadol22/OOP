
package chess;

public class Chess {
    public static void main(String[] args) {
        Board board = new Board();

      
        board.printBoard();
//        board.move("WP2", "a3");
//        board.move("WP1", "a5");
//        board.printBoard();
//        board.move("WP1", "a3");
//        board.printBoard();
//        board.move("WP5", "e5");
//        board.printBoard();
//        board.move("WK5", "e7");
//        board.printBoard();
//        board.move("WP4", "d5");
//        board.printBoard();
        board.move("WP2", "b5");
        board.printBoard();
        board.move("BP1", "a4");
        board.printBoard();
        

    }
}





