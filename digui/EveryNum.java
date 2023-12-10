package digui;

import java.util.Scanner;

public class EveryNum {
    public  void printDigits(int number)
    {
        if(number<10){
            System.out.print(number+" ");
        }else {
            printDigits(number/10);
            System.out.print(number%10+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        EveryNum a=new EveryNum();
        a.printDigits(number);

    }
}
/*import java.util.Scanner;

public class EveryNum {
    public static void printDigits(int number) {
        if (number < 10) {
            System.out.println(number + " ");
        } else {
            printDigits(number / 10);
            System.out.println(number % 10 + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printDigits(number);
    }
}*/