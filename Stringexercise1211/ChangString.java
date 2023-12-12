package Stringexercise1211;

import java.util.Locale;

class Student{
    public int age;
    public String name;

    @Override
    public String toString() {
        return "name: "+name+" age : "+age;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;

    }
}
public class ChangString {
    public static void main(String[] args) {
        //字符串和整数相互转换
        //把整数转换成字符串
        String str=String.valueOf(123);
        System.out.println(str);//打印的是字符串的123
        //这个过程可以理解为序列化和反序列化，序列化就是将数字变为字符串，反序列化将字符串转化为对象
        String str1=String.valueOf(new Student(11,"张三"));
        //valueof将任何变为字符串
        System.out.println(str1);
        int a=Integer.parseInt("123");//Integer.parseInt()方法用于将字符串转换为整数
        System.out.println(a+12);
        double b=Double.parseDouble("12.14");
        System.out.println(b+1); //13.14

        System.out.println("=================");
        System.out.println("大小写的转换");
        String str3="hello";
        String str2="HELLO";
        String ret=str3.toUpperCase();//不是在原来的基础上修改的，而是新new了一个对象
        System.out.println(ret);
        System.out.println(str3);
        //字符串的改变都是产生了一个新的对象

        System.out.println("=================");
        System.out.println("字符串转数组");
        String str4="hello";
        char[] chars=str4.toCharArray();
        for(char ch:chars){
            System.out.println(ch);
        }
         /*for (element_type element : container) {
    // 循环体
                }*/
        System.out.println("=================");
        System.out.println("格式化输出");
        String s=String.format("%d-%d-%d",1949,10,1);
        System.out.println(s);

        System.out.println("=================");
        System.out.println("字符串替换");
        String str5="abcdabcdabcef";
        String str6= str5.replace('a','p');
        System.out.println(str6);
        String str7= str5.replace("abcd","k");
        System.out.println(str7);


    }
}
