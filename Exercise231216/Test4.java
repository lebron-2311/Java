package Exercise231216;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        String string = "H e l l o ! n o w c o d e r";
        Scanner scanner= new Scanner(System.in);
        String word = scanner.next();
        scanner.close();
        System.out.println(check(string, word));
    }

    public static int check(String str, String word) {

        //write your code here......
        char a[]=str.toCharArray();
        int count=0;
        for (int i=0;i<a.length;i++)
        {
            if(word.charAt(0)==a[i])
            {
                count++;

            }

        }

        return count;
    }
}