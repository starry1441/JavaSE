package 数据类型与循环;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:给定一个数字，判定一个数字是否是素数
 * User: starry
 * Date: 2020 -12 -06
 * Time: 9:39
 */
public class work4 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int a=cin.nextInt();
        int j=0;
        for(j=2;j<=Math.sqrt(a);j++) {
            if (a % j == 0) {
                break;
            }
        }
        if(j>Math.sqrt(a)){
            System.out.println("是素数");
        }
        else{
            System.out.println("不是素数");
        }
    }
}