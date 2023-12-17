package exercise231217;

import java.util.Scanner;
public class exercise1217 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            System.out.println("用户输入的整数是: " + num);
        }
        scanner.close();
    }
}