package 图书管理.user;

import 图书管理.operation.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:管理员
 * User: starry
 * Date: 2021 -01 -20
 * Time: 18:09
 */
public class AdminUser extends User{
    public AdminUser(String name) {
        super(name);
        this.operations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation(),
        };  //调用不同功能
    }

    /**
     * 返回 你要执行的对应的操作
     * @return
     */
    @Override
    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("管理员的菜单");
        System.out.println("==============================");
        System.out.println("hello " + this.name + "欢迎来到图书系统");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("==============================");
        int choice = scanner.nextInt();
        return choice;
    }
}
