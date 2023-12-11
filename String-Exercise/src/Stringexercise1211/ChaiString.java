package Stringexercise1211;
//Java中字符是不可变的
public class ChaiString {
    public static void main(String[] args) {
        String str="name=zhangsan&age=10";
        String[] ret=str.split("&");
        for (int i=0;i<ret.length;i++)
        {
            System.out.println(ret[i]+" ");
        }
        String str1="192.168.1.1";
        String[] ret1=str1.split("\\.");//  \是转义，分完一个不识别，两个才识别。
        System.out.println(ret1);
        for (int i=0;i<ret1.length;i++)
        {
            System.out.println(ret1[i]+" ");
        }                                    //都是\的话每一个就要对应两个
        System.out.println("====================");
        String str3="name=zhangsan&age=10";
        String[] ret3=str3.split("=|&");
        for (int i=0;i<ret3.length;i++)
        {
            System.out.println(ret3[i]+" ");
        }
        String str4="abcdef";
        String ret4=str4.substring(1,3);
        System.out.println(ret4);//bc左闭右开
        String str5="      abc de f     ";//去掉两边的空格
        String ret5=str5.trim();
        System.out.println(ret5);


    }
}
