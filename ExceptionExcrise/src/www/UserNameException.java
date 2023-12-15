package www;

public class UserNameException extends Exception {
    public UserNameException(String s) {
        super(s);
    }
    //此时，这个异常是受查异常/编译时异常
}
/*public class UserNameException extends RuntimeException {
    //此时，这个异常是非受查异常/运行时异常
}*/

//自定义异常一定是继承了这两种继承
