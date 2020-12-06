package 数据类型与循环;

import java.lang.Math;
/**
 * Created with IntelliJ IDEA.
 * Description:计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
 * User: starry
 * Date: 2020 -12 -06
 * Time: 10:50
 */
public class work9 {
    public static void main(String[] args) {
        double sum=0;
        for(int i=1;i<101;i++){
            sum=sum+Math.pow(-1,i+1)*(1.0/i);
        }
        System.out.println(sum);
    }
}
