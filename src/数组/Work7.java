package 数组;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:给定一个整型数组, 判定数组是否有序（递增）
 * User: starry
 * Date: 2020 -12 -27
 * Time: 10:40
 */
public class Work7 {
    public static boolean judgeSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1=new int[]{53,12,48,86,74,55,32,57,49,99};
        System.out.println("数组1为："+ Arrays.toString(arr1));
        System.out.println("数组1是否有序："+judgeSort(arr1));

        int[] arr2=new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println("数组2为："+ Arrays.toString(arr2));
        System.out.println("数组2是否有序："+judgeSort(arr2));
    }
}
