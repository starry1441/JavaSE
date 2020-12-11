package 数组;
/**
 * Created with IntelliJ IDEA.
 * Description:创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
 * User: starry
 * Date: 2020 -12 -11
 * Time: 16:44
 */
public class Work5 {
    public static void main(String[] args) {
        int[] arr=new int[100];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
