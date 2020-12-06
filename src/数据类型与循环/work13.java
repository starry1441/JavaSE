package 数据类型与循环;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误，
 * 可以重新输 入，最多输入三次。三次均错，则提示退出程序
 * User: starry
 * Date: 2020 -12 -06
 * Time: 11:56
 */
public class work13 {
    public static void main(String[] args) {
        int i=3;
        Scanner cin=new Scanner(System.in);
        String a="123456";
        System.out.println("请输入密码");
        while(i>0){
            String b=cin.nextLine();
            if(a.equals(b)){
                System.out.println("登陆成功");
                break;
            }else{
                System.out.println("密码错误");
            }
            i--;
        }
    }
}
