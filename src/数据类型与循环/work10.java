package 数据类型与循环;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:求两个正整数的最大公约数
 * User: starry
 * Date: 2020 -12 -06
 * Time: 10:59
 */
public class work10 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int a=cin.nextInt();
        int b=cin.nextInt();
        int min=(a>b?a:b);
        for(int i=min;i>0;i--){
            if(a%i==0&&b%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}
