package String1213;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextLine()){
            String str=scanner.nextLine();
            String[] ret=str.split(" ");
            //这行代码的作用是将字符串 str 按照空格进行分割，并将分割后的子字符串存储在一个字符串数组 ret 中。
            System.out.println(ret[ret.length-1].length());
        }
    }
}
