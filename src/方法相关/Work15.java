package 方法相关;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:递归求 N 的阶乘
 * User: starry
 * Date: 2020 -12 -12
 * Time: 21:01
 */
public class Work15 {
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        System.out.println(factorial(n));
    }
}
