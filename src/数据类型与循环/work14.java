package 数据类型与循环;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
 * User: starry
 * Date: 2020 -12 -06
 * Time: 12:04
 */
public class work14 {
    public static void main(String[] args) {
        int i;
        Scanner cin=new Scanner(System.in);
        int a=cin.nextInt();
        int b=a;
        for(i=1;true;i++){
            if(b/10==0){
                break;
            }
            b=b/10;
        }
        int[] arr=new int[i];
        for(int j=0;j<i;j++){
            arr[j]=a%10;
            a=a/10;
        }
        for(int j=i-1;j>=0;j--){
            System.out.println(arr[j]);
        }
    }
}
