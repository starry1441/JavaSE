package 图书管理.operation;

import 图书管理.book.Book;
import 图书管理.book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:删除书籍
 * User: starry
 * Date: 2021 -02 -21
 * Time: 22:19
 */
public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的书名");
        String name = scanner.nextLine();

        int i;
        for(i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                break;
            }
        }

        if(i >= bookList.getUsedSize()) {
            System.out.println("没有你要删除的这本书！");
            return;
        }
        int pos = i;
        for(int j = pos; j < bookList.getUsedSize()-1; j++) {
            Book book = bookList.getBook(j+1);
            bookList.setBooks(j,book);
        }
        int currentSize = bookList.getUsedSize();
        bookList.setUsedSize(currentSize-1);
        System.out.println("删除书籍完毕！");
    }
}
