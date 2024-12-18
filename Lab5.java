
package lab5;


public class Lab5 {
    
    
    public static void main(String[] args) {
        int page = 10;
        Book book = new Book(page);
        book.firstPage();
        book.nextPage();
        book.lastPage();
        book.selectPage(5);
        book.nextPage();
        book.reversePage();
        book.bookMark(6);
        book.openMarkPage();
        book.nextPage();
       
        
    }
    
}
