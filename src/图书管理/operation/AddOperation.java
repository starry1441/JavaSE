package 图书管理.operation;

import 图书管理.book.Book;
import 图书管理.book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:添加书籍
 * User: starry
 * Date: 2021 -02 -21
 * Time: 22:18
 */
public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("添加书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字");
        String name = scanner.nextLine();
        System.out.println("请输入图书的作者");
        String author = scanner.nextLine();
        System.out.println("请输入图书的价格");
        int price = scanner.nextInt();
        System.out.println("请输入图书的类型");
        String type = scanner.next();

        Book book = new Book(name,author,price,type);
        int currentSize = bookList.getUsedSize();
        //放在书架有的书后面
        bookList.setBooks(currentSize,book);

        bookList.setUsedSize(currentSize+1);
    }
}
