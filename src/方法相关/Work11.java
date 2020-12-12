package 方法相关;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:递归求斐波那契数列的第 N 项
 * User: starry
 * Date: 2020 -12 -12
 * Time: 20:26
 */
public class Work11 {
    public static int feiBo(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        return feiBo(n-1)+feiBo(n-2);
    }

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        System.out.println(feiBo(n));
    }
}
