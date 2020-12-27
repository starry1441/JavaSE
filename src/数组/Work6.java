package 数组;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:给定一个整型数组, 实现冒泡排序(升序排序)
 * User: starry
 * Date: 2020 -12 -27
 * Time: 10:10
 */
public class Work6 {
    public static void bubbleSort(int[] arr){
        int i,j;
        for(i=0;i<arr.length-1;i++){
            int time=0;
            for(j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    time=1;
                }
            }
            if(time==0){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{53,12,48,86,74,55,32,57,49,99};
        System.out.println("初始为："+Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("排序后为："+Arrays.toString(arr));
    }
}
