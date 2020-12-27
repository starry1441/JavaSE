package 数组;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} ,
 * 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
 * User: starry
 * Date: 2020 -12 -27
 * Time: 11:44
 */
public class Work10 {
    public static String ToString(int[] array) {
        if(array == null) {
            return null;
        }
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            ret = ret + array[i];
            if(i != array.length-1) {
                ret += ", ";
            }
        }
        ret += "]";
        return ret;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(Arrays.toString(array));
    }
}
