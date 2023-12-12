package funcation;

import java.util.Scanner;

public class fibonaqie {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int prev = 0;
        int curr = 1;

        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入要计算的斐波那契数列的项数：");
        int n=scanner.nextInt();
        int result = fibonacci(n);
        System.out.println("斐波那契数列的第 " + n + " 项是: " + result);

    }
}
