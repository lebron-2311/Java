package Stringexercise1211;
//Java中字符是不可变的
public class Example{
    String str = new String("good");
    char[ ] ch = { 'a' , 'b' , 'c' };
    public static void main(String args[]){
        Example ex = new Example();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);
    }
    public void change(String str,char ch[ ]){
        str = "test ok";
        ch[0] = 'g';//数组可以修改，常量不行
    }
}//good and gbc