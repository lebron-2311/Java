package digui;

import java.util.Scanner;


public class fibo {
    public static int fibonaqie(int n)
    {
        if(n<=1)
        {
            return n;
        }
        else {
            return fibonaqie(n-1)+fibonaqie(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = fibonaqie(n);
        System.out.println(result);
    }
}
/*public class fibo {
    public static int fibonaqie(int n)
    {
      if(n<=1)
      {
          return n;
      }
      else {
          return fibonaqie(n-1)+fibonaqie(n-2);
      }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result=fibonaqie(n);
        System.out.println(result);
    }
}
*/