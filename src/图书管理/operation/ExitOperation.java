package 图书管理.operation;

import 图书管理.book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:退出系统
 * User: starry
 * Date: 2021 -02 -21
 * Time: 22:21
 */
public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(1);
    }
}
