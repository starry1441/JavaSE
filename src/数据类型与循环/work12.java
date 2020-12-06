package 数据类型与循环;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
 * User: starry
 * Date: 2020 -12 -06
 * Time: 11:28
 */
public class work12 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("请输入数字：");
        int value=cin.nextInt();
        System.out.println("偶数序列：");
        for(int i=31;i>0;i-=2){
            System.out.print((value>>i)&1);
        }
        System.out.println("");
        System.out.println("奇数序列：");
        for(int i=30;i>=0;i-=2){
            System.out.print((value>>i)&1);
        }
    }
}
