package agam_Day36.Book;

public class Ebook extends Book{

    public Ebook(int pages, String titles){
        
        super(pages,titles);
    }

    public void Paper(){
        System.out.println(super.title+" good book");;
    }
}
