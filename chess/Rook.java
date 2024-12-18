
package chess;


public class Rook extends Figure {

    public Rook(String identifier) {
        super(identifier);
    }

    @Override
    public boolean canMove(int startX, int startY, int endX, int endY) {
       
        return startX == endX || startY == endY;
    }
}



