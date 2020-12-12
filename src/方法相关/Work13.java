package 方法相关;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
 * User: starry
 * Date: 2020 -12 -12
 * Time: 20:43
 */
public class Work13 {
    public static void printNum(int n){
        if(n>9){
            printNum(n/10);
        }
        System.out.println(n%10+" ");
    }

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        printNum(n);
    }
}
