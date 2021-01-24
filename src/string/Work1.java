package string;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 * 示例:
 * 输入: "Hello, my name is John"
 * 输出: 5
 * 解释: 这里的单词是指连续的不是空格的字符，所以 "Hello," 算作 1 个单词。
 * User: starry
 * Date: 2021 -01 -20
 * Time: 17:38
 */
public class Work1 {
    public static int countSegments(String s) {
        s = s.trim();
        if(s == null || s.isEmpty()){
            return 0;
        }
        String[] str = s.split(" ");
        int count = 0;
        for(int i = 0; i < str.length; i++) {
            if(str[i].isEmpty()) {
                continue;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "you are  a     beautiful  gril";
        System.out.println(countSegments(s));
    }
}
