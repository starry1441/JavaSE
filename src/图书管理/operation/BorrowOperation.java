package 图书管理.operation;

import 图书管理.book.Book;
import 图书管理.book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:借阅书籍
 * User: starry
 * Date: 2021 -02 -21
 * Time: 22:19
 */
public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要借阅的书名");
        String name = scanner.nextLine();

        for(int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                //说明有这本书
                //逻辑：把这本书的借阅状态修改为true
                book.setStatus(true);
                System.out.println("借阅成功！");
                System.out.println(book);
                return;
            }
        }
        System.out.println("借阅失败，没有你要借阅的图书");
    }
}
