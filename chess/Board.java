
package chess;
public class Board {
    private Figure[][] board = new Figure[8][8];
    

    public Board() {
        initializeBoard();
    }

   private void initializeBoard() {
       
        board[0][0] = new Rook("WR1");
        board[0][1] = new Knight("WN2");
        board[0][2] = new Bishop("WB3");
        board[0][3] = new King("WK4");
        board[0][4] = new Queen("WQ5");
        board[0][5] = new Bishop("WB6");
        board[0][6] = new Knight("WN7");
        board[0][7] = new Rook("WR8");

        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn("WP" + (i + 1));
        }

        
        board[7][0] = new Rook("BR1");
        board[7][1] = new Knight("BN2");
        board[7][2] = new Bishop("BB3");
        board[7][3] = new Queen("BQ4");
        board[7][4] = new King("BK5");
        board[7][5] = new Bishop("BB6");
        board[7][6] = new Knight("BN7");
        board[7][7] = new Rook("BR8");

        for (int i = 0; i < 8; i++) {
            board[6][i] = new Pawn("BP" + (i + 1));
        }
    }

    public Figure[][] getBoard() {
        return board;
    }

    public void printBoard() {
        System.out.println("    a    b    c    d    e    f    g    h"); 
        for (int i = 0; i < 8; i++) {
            System.out.print((8 - i) + " "); 
            for (int j = 0; j < 8; j++) {
              
                if (board[i][j] != null) {
                    System.out.print("[" + board[i][j].getName() + "]"); 
                } else {
                    System.out.print("[---]");
                }
            }
            System.out.println(" " + (8 - i)); 
        }
        System.out.println("    a    b    c    d    e    f    g    h"); 
    }

    public void move(String pieceName, String to) {
    int[] fromPos = findPieceByName(pieceName); 
    int[] toPos = positionFromString(to); 

    if (fromPos == null || toPos == null) {
        System.out.println("Invalid move: Piece not found or invalid position.");
        return;
    }

    Figure piece = board[fromPos[0]][fromPos[1]];
    if (piece == null) {
        System.out.println("No piece at starting position.");
        return;
    }

    if (piece.canMove(fromPos[0], fromPos[1], toPos[0], toPos[1])) {
        board[toPos[0]][toPos[1]] = piece;
        board[fromPos[0]][fromPos[1]] = null;
        System.out.println("Moved " + piece.getName() + " to " + to);
    } else {
        System.out.println("Invalid move for " + piece.getName());
    }
}

private int[] findPieceByName(String pieceName) {
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            if (board[i][j] != null && board[i][j].getName().equals(pieceName)) {
                return new int[]{i, j}; 
            }
        }
    }
    return null; 
}


    private int[] positionFromString(String pos) {
    if (pos.length() != 2) return null; 
    char col = pos.charAt(0);
    if (col < 'a' || col > 'h') return null; 
    try {
        int row = Integer.parseInt(pos.substring(1)); 
        if (row < 1 || row > 8) return null;
        int x = 8 - row;
        int y = col - 'a';
        return new int[]{x, y};
    } catch (NumberFormatException e) {
        return null; 
    }
}
}
