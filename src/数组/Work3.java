package 数组;
/**
 * Created with IntelliJ IDEA.
 * Description:实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上.
 * 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
 * User: starry
 * Date: 2020 -12 -11
 * Time: 16:21
 */
public class Work3 {
    public static void transform(int[] arr){
        for(int i=0;i< arr.length;i++){
            arr[i]*=2;
        }
    }
    public static void main(String[] args){
        int[] arr=new int[]{1,2,3,4,5};
        transform(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }
}
