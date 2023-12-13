package String1213;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextLine()){
            String str=scanner.nextLine();
            int index=str.lastIndexOf(" ");
            String ret= str.substring(index+1);
            System.out.println(ret.length());
        }
    }
}
