package 方法相关;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:求 N 的阶乘
 * User: starry
 * Date: 2020 -12 -11
 * Time: 18:05
 */
public class Work4 {
    public static int factorial(int n){
        int fac=1;
        for(int i=1;i<=n;i++){
            fac*=i;
        }
        return fac;
    }
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        System.out.println(factorial(n));
    }
}
