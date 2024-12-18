
package chess;


public class Knight extends Figure {

    public Knight(String identifier) {
        super(identifier);
    }

    @Override
    public boolean canMove(int startX, int startY, int endX, int endY) {
       
        int dx = Math.abs(endX - startX);
        int dy = Math.abs(endY - startY);
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }
}



