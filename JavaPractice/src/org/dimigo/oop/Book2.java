package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Book2
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 28.
 * <pre>
 *
 * @author : Seung
 * @version : 1.0
 */
public class Book2 {
    private String title;
    private String author;
    private int page;

    public Book2(){}

    public Book2(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}

class BookTest2 extends Book2{
    private void compare(){
        Book2 book = new Book2("A","B",1);

        Book2 book2 = null;

        System.out.println((book==book2)?true:false);
        //book2 = new Book2();

        System.out.println(book2.getTitle().length());

    }
    public static void main(String[] args){
        BookTest2 bt = new BookTest2();
        bt.compare();
    }

}
