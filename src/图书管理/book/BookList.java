package 图书管理.book;

/**
 * Created with IntelliJ IDEA.
 * Description:书架（相当于顺序表）
 * User: starry
 * Date: 2021 -01 -20
 * Time: 18:08
 */
public class BookList {

    private Book[] books;   //图书对象，存放在顺序表中
    private int usedSize;

    public BookList(){
        this.books = new Book[10];
        books[0] = new Book("三国演义","罗贯中",55,"小说");
        books[0] = new Book("西游记","吴承恩",74,"小说");
        books[0] = new Book("水浒传","施耐庵",49,"小说");

    }

}
