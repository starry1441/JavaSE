package 数据类型与循环;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
 * User: starry
 * Date: 2020 -12 -06
 * Time: 9:49
 */
public class work5 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int a=cin.nextInt();
        if(a<0){
            System.out.println("输入无效");
        }
        if(a<=18){
            System.out.println("少年");
        }else if(a>18&&a<=28){
            System.out.println("青年");
        }else if(a>28&&a<=55){
            System.out.println("中年");
        }else{
            System.out.println("老年");
        }
    }
}
