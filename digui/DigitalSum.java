package digui;

import java.util.Scanner;

public class DigitalSum {
    public static void NumSum(int number)
    {
        int sum=0;
       while (number>0)
       {
           sum+=number%10;
           number/=10;
       }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        NumSum(number);
    }
}
