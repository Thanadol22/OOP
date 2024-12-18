
package visualbook;

public class Page {
    int page = 20 , currentpage , currentbookmark;
    public void firstPage(){
        currentpage = 1;
        System.out.println("Move To Frist Page : "+currentpage);
    }
    public void lastPage(){
        currentpage = 20;
        System.out.println("Move To Last Page : "+currentpage);
    }
    public void openBook(int openbook){
        if (openbook <= page){
            currentpage = openbook;
            System.out.println("Move To Page : "+currentpage);
        }
        else
            System.out.println("Page Number "+page);
    }
    public void openBookMark(int bookmark){
        currentbookmark = bookmark;
        System.out.println("Move To Book Mark : "+bookmark);
    }
    public void nextPage(){
        if(currentpage < page){
            currentpage = currentpage + 1;
            System.out.println("Move To Next Page : "+currentpage);
        }
        else
            System.out.println("Book has only "+page);
    }
    public void previousPage(){
        if(currentpage < page){
            currentpage = currentpage - 1;
            System.out.println("Move To Last Page : "+currentpage);
        }
        else
            System.out.println("Book has only "+page);
    }
    public void page(){
        System.out.println("All Page : "+page);
    }
    public void currentPage(){
        System.out.println("CurrentPage : "+currentpage);
    }
    public void bookMark(){
        System.out.println("BookMark : "+currentbookmark);
    }
}
