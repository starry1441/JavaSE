package abnormal;

/**
 * Created with IntelliJ IDEA.
 * Description:实现一个简单的控制台版用户登陆程序, 程序启动提示用户输入用户名密码.
 * 如果用户名密码出错, 使用自定义异常的方式来处理
 * User: starry
 * Date: 2021 -01 -20
 * Time: 16:44
 */
public class Test1 {

    private static String userName = "xingxing";
    private static String password = "123456";

    public static void login(String userName, String password) throws UserError,PasswordError{
        if(!Test1.userName.equals(userName)){
            throw new UserError("用户名错误");
        }
        if(!Test1.password.equals(password)){
            throw new PasswordError("密码错误");
        }
        System.out.println("登录成功");
    }

    public static void main(String[] args) {
        try{
            login("xingxing","123456");
        }catch (UserError userError){
            userError.printStackTrace();
        }catch (PasswordError passwordError){
            passwordError.printStackTrace();
        }
    }
}

class UserError extends Exception{
    public UserError(String message){
        super(message);
    }
}

class PasswordError extends Exception{
    public PasswordError(String message){
        super(message);
    }
}