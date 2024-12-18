
package visualbook;

public class VisualBook {

    public static void main(String[] args) {
        Page page = new Page();
        page.firstPage();
        page.lastPage();
        page.openBook(6);
        page.nextPage();
        page.previousPage();
        page.openBookMark(10);
        page.page();
        page.currentPage();
        page.bookMark();
    }
    
}
