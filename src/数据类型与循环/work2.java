package 数据类型与循环;

/**
 * Created with IntelliJ IDEA.
 * Description:输出 1000 - 2000 之间所有的闰年
 * User: starry
 * Date: 2020 -12 -05
 * Time: 20:54
 */
public class work2 {
    public static void main(String[] args) {
        for(int i=1000;i<=2000;i++){
            if(i%4==0&&i%100!=0||i%400==0){
                System.out.println(i);
            }
        }
    }
}
