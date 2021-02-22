package 图书管理.user;

import 图书管理.book.BookList;
import 图书管理.operation.IOperation;

/**
 * Created with IntelliJ IDEA.
 * Description:用来被继承
 * User: starry
 * Date: 2021 -01 -20
 * Time: 18:09
 */
public abstract class User {

    public String name; //用户名
    public IOperation[] operations; //对应用户的操作数组

    //定义构造方法
    public User(String name) {
        this.name = name;
    }
    //用户菜单
    public abstract int menu();
    //调用对用操作的work方法
    public void doOperation(int choice, BookList bookList) {
        this.operations[choice].work(bookList);
    }

}
