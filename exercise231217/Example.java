package exercise231217;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入多行文本（输入'q'结束）：");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("q")) {
                break;
            }
            System.out.println("用户输入的文本是: " + line);
        }

        scanner.close();
    }
}