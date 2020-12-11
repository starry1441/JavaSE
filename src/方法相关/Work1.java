package 方法相关;

/**
 * Created with IntelliJ IDEA.
 * Description:有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
 * User: starry
 * Date: 2020 -12 -11
 * Time: 16:50
 */
public class Work1 {
    public static int searchNum(int[] arr){
        int len=arr.length;
        for(int i=0;i<len;i++){
            int appear=1;
            for(int j=0;j<len;j++){
                if(arr[i]==arr[j]&&(i!=j)){
                    appear=2;
                    break;
                }
            }
            if(appear==1){
                return arr[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,1,3,5,2};
        System.out.println(searchNum(arr));
    }
}
