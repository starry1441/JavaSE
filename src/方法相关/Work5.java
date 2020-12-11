package 方法相关;

/**
 * Created with IntelliJ IDEA.
 * Description:调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
 * User: starry
 * Date: 2020 -12 -11
 * Time: 18:09
 */
public class Work5 {
    public static void change(int[] arr){
        int len=arr.length;
        for(int i=0;i<len;i++){
            if(arr[i]%2==0){
                for(int j=i+1;j<len;j++){
                    if(arr[j]%2==1){
                        int tmp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=tmp;
                        break;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={5,2,7,8,9,4,1,6,3,0};
        change(arr);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
