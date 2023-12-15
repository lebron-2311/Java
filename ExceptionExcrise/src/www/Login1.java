package www;


class Login{
    public String userName="admin";
    public String passWord="123456";
    public  void login(String userName,String passWord) throws UserNameException{
        if(!this.userName.equals(userName)){
            //System.out.println("用户名错误");
            throw new UserNameException("用户名错误!");
        }
        if(!this.passWord.equals(passWord)){
            //System.out.println("密码错误");
            throw new PassWordException("密码错误!");
        }
    }

}
public class Login1 {
    public static void main(String[] args) throws UserNameException {
        try {
            Login a=new Login();
            a.login("admin1","123456");
        }catch (UserNameException e){
            e.printStackTrace();
            System.out.println("捕捉到了用户名错误");
        }catch (PassWordException e){
            e.printStackTrace();
            System.out.println("捕捉到了密码错误");
        }
        System.out.println("程序继续执行...");
    }
}
