package 数据类型与循环;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:求一个整数，在内存当中存储时，二进制1的个数。
 * User: starry
 * Date: 2020 -12 -06
 * Time: 11:09
 */
public class work11 {
    public static void main(String[] args) {
        int count=0;
        Scanner cin=new Scanner(System.in);
        int a=cin.nextInt();
        if(a<0){
            a=-a;
            count++;
        }
        for(int i=0;true;i++){
            if(a%2==0){
                a=a/2;
                continue;
            }else{
                a=a/2;
                count++;
            }
            if(a==0){
                break;
            }
        }
        System.out.println(count);
    }
}
