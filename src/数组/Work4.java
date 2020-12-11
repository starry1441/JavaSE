package 数组;

/**
 * Created with IntelliJ IDEA.
 * Description:实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
 * User: starry
 * Date: 2020 -12 -11
 * Time: 16:35
 */
public class Work4 {
    public static void printArray(int[] arr){
        for(int a:arr){
            System.out.println(a);
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        printArray(arr);
    }
}
