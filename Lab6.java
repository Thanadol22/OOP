package lab6;

public class Lab6 {
    public static void main(String[] args) {
        
        Board board = new Board(10);

       
        Figure[] figures = new Figure[2];
        figures[0] = new Figure("figure_1", 1, board);
        figures[1] = new Figure("figure_2", 2, board);

       
        System.out.println("Initial Board:");
        board.displayBoard();

        
        figures[0].move(3); 
        board.displayBoard(); 

        figures[1].move(10); 
        board.displayBoard(); 

       
        
       
    }
}
