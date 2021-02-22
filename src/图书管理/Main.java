package 图书管理;

import 图书管理.book.BookList;
import 图书管理.user.AdminUser;
import 图书管理.user.NormalUser;
import 图书管理.user.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -02 -22
 * Time: 10:55
 */
public class Main {

    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名");
        String name = scanner.nextLine();
        System.out.println("请输入你的身份：1-》管理员 0-》普通用户");
        int choice = scanner.nextInt();
        if(choice == 1) {
            return new AdminUser(name);
        }else {
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        BookList bookList = new BookList();
        //1.登录
        User user = login();    //向上转型
        while (true) {
            //拿choice去调用对应类中的work方法
            int choice = user.menu();   //动态绑定
            user.doOperation(choice,bookList);
        }
    }

}
