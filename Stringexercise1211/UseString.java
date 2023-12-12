package Stringexercise1211;

public class UseString {
    public static void main(String[] args) {
        String s1=new String("刘宇轩");
        String s2=new String("刘宇轩");
        String s3=new String("姚长坤");
        System.out.println(s1==s2);//代表的是地址因此不一样
        System.out.println(s2==s3);
        System.out.println(s1.equals(s2));//比较的字符串 string 重写了object的equals
        System.out.println(s1.equals(s3));//以后比较字符串都用equals
        String s5="hello";//直接赋值直接放在常量值当中
        String s4="hello";
        System.out.println(s4==s5);//true
        System.out.println(s4.equals(s5));//true
        //Java中有一块很特殊的内存，存储在堆上
        //字符串常量值
        String s6="hallo";
        String s7="hzllo";
        System.out.println(s6.compareTo(s7));//返回的是，e和z ASII码的差值,从第一个不一样的开始比较
        //简单类型可以用直接比较，引用类型是不起作用的。
        String s8="hello";//直接赋值直接放在常量值当中//h104
        String s9="Hello";//H72
        System.out.println("********************************************");
        System.out.println(s8.equals(s9));
        System.out.println(s8.equalsIgnoreCase(s9));//忽略大小写比较
        System.out.println("********************************************");
        System.out.println(s8.compareTo(s9));//h ASII -  H ASII
        System.out.println(s8.compareToIgnoreCase(s9));


    }
}
