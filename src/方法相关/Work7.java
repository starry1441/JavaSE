package 方法相关;

/**
 * Created with IntelliJ IDEA.
 * Description:在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
 * User: starry
 * Date: 2020 -12 -12
 * Time: 17:23
 */
public class Work7 {
    public static int max(int a,int b){
        return a>b?a:b;
    }
    public static float max(float c,float d){
        return c>d?c:d;
    }
    public static void max(int a,float c,float d){
        if((float)a>c){
            System.out.println(a+">"+c);
        }else{
            System.out.println(a+"<"+c);
        }
        if((float)a>d){
            System.out.println(a+">"+d);
        }else{
            System.out.println(a+"<"+d);
        }
    }
    public static void main(String[] args) {
        int a=5;
        int b=8;
        float c=6.5f;
        float d=8.9f;
        int maxInt=max(a,b);
        System.out.println(maxInt);
        float maxFloat=max(c,d);
        System.out.println(maxFloat);
        max(a,c,d);
    }
}
