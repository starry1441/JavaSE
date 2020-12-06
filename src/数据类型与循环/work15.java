package 数据类型与循环;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:输出n*n的乘法口诀表，n由用户输入。
 * User: starry
 * Date: 2020 -12 -06
 * Time: 13:04
 */
public class work15 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
