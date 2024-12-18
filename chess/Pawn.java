
package chess;


public class Pawn extends Figure {

    public Pawn(String identifier) {
        super(identifier);
    }

    @Override
    public boolean canMove(int startX, int startY, int endX, int endY) {
        
        int dx = endX - startX;
        int dy = Math.abs(endY - startY);

       
        if (dy == 0 && (dx == 1 || (startX == 1 && dx == 2))) {
            return true;
        }

       
        return dy == 1 && dx == 1;
    }
}


