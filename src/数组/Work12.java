package 数组;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:给定两个整型数组, 交换两个数组的内容.
 * User: starry
 * Date: 2020 -12 -27
 * Time: 15:19
 */
public class Work12 {
    public static void changeInt(int[] arr,int[] brr){
        for(int i=0;i<arr.length;i++){
            int tmp=arr[i];
            arr[i]=brr[i];
            brr[i]=tmp;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] brr={6,7,8,9,10};
        System.out.println("原两数组为：");
        System.out.println("arr:"+Arrays.toString(arr));
        System.out.println("brr"+Arrays.toString(brr));
        changeInt(arr,brr);
        System.out.println("经过交换后两数组为：");
        System.out.println("arr:"+Arrays.toString(arr));
        System.out.println("brr"+Arrays.toString(brr));
    }
}
