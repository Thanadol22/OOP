
package chess;


public class Queen extends Figure {

    public Queen(String identifier) {
        super(identifier);
    }

    @Override
    public boolean canMove(int startX, int startY, int endX, int endY) {
       
        return (startX == endX || startY == endY) || Math.abs(endX - startX) == Math.abs(endY - startY);
    }
}



