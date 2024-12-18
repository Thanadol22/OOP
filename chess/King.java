
package chess;


public class King extends Figure {

    public King(String identifier) {
        super(identifier);
    }

    @Override
    public boolean canMove(int startX, int startY, int endX, int endY) {
        
        return Math.abs(endX - startX) <= 1 && Math.abs(endY - startY) <= 1;
    }
}




