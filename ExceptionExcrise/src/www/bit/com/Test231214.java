package www.bit.com;

public class Test231214 {
    public static void func2(int []array)
    {
        if(array==null){
            throw new NullPointerException("array==null了");
            //一般情况下，通过throw抛出的异常是自定义的异常---个性化异常
            //throw必须写在方法体的内部
            //抛出的对象必须是Exception或者Exception的子类对象
            //如果抛出RuntimeException或者其子类则可以不用处理，直接交给JVM处理
            //抛出异常，后面的代码不会执行
        }
    }

    public static void main(String[] args) {
        func2(null);
    }
}
//throw try catch finally throws