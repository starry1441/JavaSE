package 数组;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
 * User: starry
 * Date: 2020 -12 -27
 * Time: 14:46
 */
public class Work11 {
    public static void changeSort(int[] arr){
        int len=arr.length;
        for(int i=0;i<len;i++){
            if(arr[i]%2==1){
                int j;
                for(j=i+1;j<len;j++){
                    if(arr[j]%2==0){
                        int tmp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=tmp;
                        break;
                    }
                }
                if(j==len){
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{53,12,48,86,74,55,32,57,49,99};
        System.out.println("初始为："+Arrays.toString(arr));
        changeSort(arr);
        System.out.println("变换后为"+Arrays.toString(arr));
    }
}
