package 数据类型与循环;

/**
 * Created with IntelliJ IDEA.
 * Description:打印 1 - 100 之间所有的素数
 * User: starry
 * Date: 2020 -12 -05
 * Time: 21:01
 */
public class work3 {
    public static void main(String[] args) {
        int j=0;
        for(int i=1;i<=100;i++){
            for(j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    break;
                }
            }
            if(j>Math.sqrt(i)){
                System.out.println(i);
            }
        }
    }
}
