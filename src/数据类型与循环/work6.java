package 数据类型与循环;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:打印X图形
 * User: starry
 * Date: 2020 -12 -06
 * Time: 9:55
 */
public class work6 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int a=cin.nextInt();
        for(int i=1;i<a+1;i++) {
            for(int j=1;j<a+1;j++){
                System.out.print(" ");
                if(i==j){
                    System.out.print("*");
                }
                if(j==(a-i+1)){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
