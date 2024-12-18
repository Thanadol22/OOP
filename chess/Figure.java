
package chess;

public abstract class Figure {
    protected String name;
    protected String color;
    protected int id;

    
    public Figure(String identifier) {
        if (identifier.length() < 3) {
            throw new IllegalArgumentException("Identifier must be in the format [Color][Piece][ID], e.g., 'WPa1'");
        }
        this.color = identifier.substring(0, 1); 
        this.name = identifier.substring(1, 2); 
        this.id = Integer.parseInt(identifier.substring(2)); 
    }

    
    public abstract boolean canMove(int startX, int startY, int endX, int endY);

   
    public String getName() {
        return color + name + id; 
    }
}






