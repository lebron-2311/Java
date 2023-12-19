package basicpredatastructure;

public class Test1 {
    public static void main(String[] args) {
        int a=10;
        //Integer ii=a;//自动装箱
        Integer ii=Integer.valueOf(a);//显示装箱 手动

        Integer ii2=new Integer(10);
        //int b=ii2;//自动拆箱
        int b=ii2.intValue();//显示拆箱
        double d=ii2.doubleValue();
        System.out.println(ii);
        System.out.println(b);
        System.out.println(d);
    }
}
