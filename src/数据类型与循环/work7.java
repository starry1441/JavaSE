package 数据类型与循环;

import java.util.Random;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:完成猜数字游戏 ，用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字，等于的时候退出程序。
 * User: starry
 * Date: 2020 -12 -06
 * Time: 10:15
 */
public class work7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randNum = random.nextInt(100)+1;//[1-101)
        while (true) {
            int inputNum = scanner.nextInt();
            if(inputNum < randNum  ) {
                System.out.println("小");
            }else if(inputNum > randNum) {
                System.out.println("大");
            }else {
                System.out.println("==");
                break;
            }
        }
    }
}
