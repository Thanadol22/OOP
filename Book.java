
package lab5;


public class Book {
    private int page ;
    private int currentpage;
    int firstpage = 1 ,lastpage = 10;  
    int selectpage;
    int currentbookmark;
    
    public Book(int page){
        this.page = page;
        this.currentpage = 1;
    }
    
    
    public void firstPage(){
        currentpage = 1;
        System.out.println("First Page "+currentpage);
    }
    
    
    public void lastPage(){
        currentpage = page;
        System.out.println("Last Page "+currentpage);
    }
    
    
    public void nextPage(){
        if(currentpage < page){
        currentpage = currentpage+1;
        System.out.println("Next Page "+currentpage);
        }
        else
            System.out.print("Page To Number 1-10 Must Be Enterd");
    }
    
    
    public void reversePage(){
         if(currentpage <= page){
        currentpage = currentpage-1;
        System.out.println("Reverse Page "+currentpage);
        }
        else
            System.out.print("Page To Number 1-10 Must Be Enterd");
    
    }
    
    
    public void selectPage(int selectpage){
        if(selectpage <= page){
            currentpage = selectpage;
            System.out.println("Open Page "+currentpage);
        }
        else
            System.out.print("Page To Number 1-10 Must Be Enterd");
    }
    
    
    public void bookMark(int bookmark){
        System.out.println("Book Mark Page "+bookmark);
        currentbookmark = bookmark;
        currentpage = currentbookmark;
    }
    
    
    public void openMarkPage(){
        System.out.println("Open Book Mark Page "+currentbookmark);
        
    }
    
    
}
