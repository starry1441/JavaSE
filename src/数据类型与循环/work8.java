package 数据类型与循环;

import java.lang.Math;
/**
 * Created with IntelliJ IDEA.
 * Description:求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本 身，如；153＝1＋5＋3?，则153是一个“水仙花数“。）
 * User: starry
 * Date: 2020 -12 -06
 * Time: 10:22
 */
public class work8 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            if(i==Math.pow(i,3)){
                System.out.println(i);
            }
        }
        for(int i=10;i<100;i++){
            int j=i/10;//十位
            int n=i%10;
            if(Math.pow(n,3)+Math.pow(j,3)==i){
                System.out.println(i);
            }
        }
        for(int i=100;i<1000;i++){
            int a=i%10;//个位
            int j=i/10;
            int b=j%10;//十位
            int c=j/10;//百位
            if(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)==i){
                System.out.println(i);
            }
        }
    }
}
