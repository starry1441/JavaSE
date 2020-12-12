package 方法相关;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:求斐波那契数列的第n项。(迭代实现)
 * User: starry
 * Date: 2020 -12 -11
 * Time: 17:03
 */
public class Work2 {
    public static int fei(int n){
        int left=1;
        int right=1;
        int tmp=0;
        for(int i=0;i<n-2;i++){
            tmp=right;
            right=left+right;
            left=tmp;
        }
        return right;
    }
    public static void main(String[] args) {
        int n=0;
        Scanner cin=new Scanner(System.in);
        n=cin.nextInt();
        int num=fei(n);
        System.out.println(num);
    }
}
