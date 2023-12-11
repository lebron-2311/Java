package Stringexercise1211;

public class FindString {
    public static void main(String[] args) {
        String s1=new String("hello");
        char ch=s1.charAt(1);//得到下标的值，不能越界不能负数
        System.out.println(ch);//e

        //返回对应字符串出现的下标出现的位置
        int index=s1.indexOf('e');
        System.out.println(index);//1
        int index1=s1.indexOf('l');
        System.out.println(index1);//2 从头开始一个一个查
        //从指定位置开始查找字符出现的位置
        int index2=s1.indexOf('l',3);
        System.out.println(index2);
        System.out.println("==========");
        String s3=new String("hello");
        int index3=s3.lastIndexOf('l');//从后往前找，返回找到的第一个l所在的位置
        System.out.println(index3);
        System.out.println("==========");


    }
}
