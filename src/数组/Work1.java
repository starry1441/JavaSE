package 数组;

/**
 * Created with IntelliJ IDEA.
 * Description:实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
 * User: starry
 * Date: 2020 -12 -11
 * Time: 15:53
 */
public class Work1 {
    public static int avg(int[] arr){
        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            sum=sum+arr[i];
//        }
        for(int a:arr){
            sum+=a;
        }
        return sum/arr.length;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
        int avg=avg(arr);
        System.out.println(avg);
    }
}
