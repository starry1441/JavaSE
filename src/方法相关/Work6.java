package 方法相关;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
 * ​ 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
 * User: starry
 * Date: 2020 -12 -11
 * Time: 18:37
 */
public class Work6 {
    public static int max2(int a,int b){
        return a>b?a:b;
    }
    public static int max3(int a,int b,int c){
        int max=max2(a,b);
        max=max2(max,c);
        return max;
    }
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int a=cin.nextInt();
        int b=cin.nextInt();
        int c=cin.nextInt();
        System.out.println(max3(a,b,c));
    }
}
