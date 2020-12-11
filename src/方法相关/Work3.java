package 方法相关;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:求1！+2！+3！+4！+........+n!的和
 * User: starry
 * Date: 2020 -12 -11
 * Time: 17:31
 */
public class Work3 {
    public static int sum(int n){
        int a=1;
        int sum=0;
        for(int i=1;i<=n;i++){
            a=1;
            for(int j=1;j<=i;j++){
                a=a*j;
            }
            sum=sum+a;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        System.out.println(sum(n));
    }
}
