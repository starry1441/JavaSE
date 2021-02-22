package 图书管理.operation;

import 图书管理.book.Book;
import 图书管理.book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:展示书籍
 * User: starry
 * Date: 2021 -02 -21
 * Time: 22:21
 */
public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("展示书籍");
        for(int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            System.out.println(book);
        }
    }
}
