package www.bit.com;

public class Test2312143 {
    public static void func() throws RuntimeException{

    }
    public static void func1() throws Exception{
      int []array=null;
      System.out.println(array.length);
    }
    public static void main(String[] args) {
        func();//这里会把它当作编译时异常来处理
        try {//try里放着可能发现异常的代码
            func1();//throws Exception会处理好
        } catch (Exception e) {//抛出的异常由catch捕捉到
            e.printStackTrace();
            System.out.println("处理异常");
        }
        //异常：对于比较严重的问题，应该直接让程序崩溃，防止造成更严重的后果
        //如果不太严重，可以记录错误日志，并通过监控报警程序及时通知程序猿
        System.out.println("after");
    }
}
