import java.util.Scanner;

public class prime1 {
    public static void main(String[] arPgs) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean isPrime = true;

        if (num < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }
    }
}