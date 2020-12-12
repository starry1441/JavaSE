package 方法相关;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:递归求 1 + 2 + 3 + ... + 10
 * User: starry
 * Date: 2020 -12 -12
 * Time: 20:55
 */
public class Work14 {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        System.out.println(sum(n));
    }
}
