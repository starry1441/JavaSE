package 方法相关;

/**
 * Created with IntelliJ IDEA.
 * Description:在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
 * User: starry
 * Date: 2020 -12 -12
 * Time: 19:00
 */
public class Work8 {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b,float c){
        return a+b+c;
    }
    public static void main(String[] args) {
        int a=3;
        int b=4;
        float c=6.2f;
        float d=5.1f;
        float e=1.9f;
        int sum1=sum(a,b);
        System.out.println(sum1);
        float sum2=sum(c,d,e);
        System.out.println(sum2);
    }
}
