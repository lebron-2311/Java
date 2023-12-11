public class Main {
    public static void main(String[] args) {
        String s1=new String("hello");
        String s2=new String("world");
        String s3=s1;
        System.out.println(s3);
        System.out.println(s2);
        String s4=new String("刘宇轩");
        System.out.println(s4);
        char []arr={'a','b','c'};
        String str5=new String(arr);
        System.out.println(str5);
        System.out.println(s4.length());//字符串的长度
        System.out.println(s4.isEmpty());//判断字符串是否为空，空true，不空false
        String str6=null;
        //System.out.println(str6.isEmpty());//不对因为没有指向任何一个对象,空指针异常。
        String str7=" ";//指向了对象，对象是空的
        System.out.println(str7.isEmpty());

    }
}