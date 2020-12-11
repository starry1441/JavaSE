package 数组;
/**
 * Created with IntelliJ IDEA.
 * Description:实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
 * User: starry
 * Date: 2020 -12 -11
 * Time: 16:14
 */
public class Work2 {
    public static int sum(int[] arr){
        int sum=0;
        for(int a:arr){
            sum+=a;
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        System.out.println(sum(arr));
    }
}
