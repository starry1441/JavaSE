package 方法相关;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:写一个递归方法，输入一个非负整数，返回组成它的数字之和
 * User: starry
 * Date: 2020 -12 -12
 * Time: 20:32
 */
public class Work12 {
    public static int sum(int n){
        if(n/10==0){
            return n;
        }
        return n%10+sum(n/10);
    }

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        System.out.println(sum(n));
    }
}
