package 数据类型与循环;

/**
 * Created with IntelliJ IDEA.
 * Description:编写程序数一下 1到 100 的所有整数中出现多少个数字9
 * User: starry
 * Date: 2020 -12 -05
 * Time: 20:42
 */
public class work1 {
    public static void main(String[] args) {
        int count=0;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(i==9){
                    count++;
                }
                if(j==9){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
