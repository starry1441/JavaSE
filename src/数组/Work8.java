package 数组;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:给定一个有序整型数组, 实现二分查找
 * User: starry
 * Date: 2020 -12 -27
 * Time: 10:49
 */
public class Work8 {
    public static int binarySearch(int[] arr,int a){
        int len=arr.length;
        int left=0;
        int right=len-1;
        int mid;
        for(int i=0;i<len;i++){
            mid=(left+right)/2;
            if(arr[mid]>a){
                right=mid-1;
            }else if(arr[mid]<a){
                left=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{11,22,33,44,55,66,77,88,99,100};
        System.out.println("数组为"+ Arrays.toString(arr));
        System.out.println("请输入要查找的数字");
        Scanner cin=new Scanner(System.in);
        int a=cin.nextInt();
        int result=binarySearch(arr,a);
        if(result==-1){
            System.out.println("该数字在数组中未出现");
        }else{
            System.out.println("该数字所在数组下标为："+result);
        }
    }
}
