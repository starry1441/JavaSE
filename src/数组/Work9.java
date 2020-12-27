package 数组;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
 * User: starry
 * Date: 2020 -12 -27
 * Time: 11:32
 */
public class Work9 {
    public static int[] copyOf(int[] arr){
        int[] brr=new int[arr.length];
        for(int i=0;i<brr.length;i++){
            brr[i]=arr[i];
        }
        return brr;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{11,22,33,44,55,66,77,88,99,100};
        System.out.println("数组1为："+ Arrays.toString(arr));
        System.out.println("经拷贝后，数组2为："+Arrays.toString(copyOf(arr)));
    }
}
