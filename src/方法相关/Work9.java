package 方法相关;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:青蛙跳台阶问题
 * User: starry
 * Date: 2020 -12 -12
 * Time: 19:18
 */
public class Work9 {
    /**
     * 若一次能跳1或2级台阶，共n级台阶能有多少种方法
     * f(n)=f(n-1)+f(n-2)
     */
    public static int jump1(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return jump1(n-1)+jump1(n-2);
    }
    /**
     * 若一次能跳n级台阶，共n级台阶能有多少种方法
     * f(n)=f(n-1)+f(n-2)+f(n-3)+...+f(1)+1
     * f(n-1)=f(n-2)+f(n-3)+f(n-4)+...+f(1)+1
     * 两式相减得
     * f(n)=2*f(n-1)
     */
    public static int jump2(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return 2*jump2(n-1);
    }

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int num1=jump1(n);
        System.out.println(num1);
        int num2=jump2(n);
        System.out.println(num2);
    }
}
