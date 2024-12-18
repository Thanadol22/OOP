
package chess;


public class Bishop extends Figure {

    public Bishop(String identifier) {
        super(identifier);
    }

    @Override
    public boolean canMove(int startX, int startY, int endX, int endY) {
       
        return Math.abs(endX - startX) == Math.abs(endY - startY);
    }
}



