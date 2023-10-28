/*
public class prime2 {
    public static void main(String[] args) {
        int i=1;
        for(i=1;i<101;i++)
        {
           int j=2;
           for(j=2;j<=Math.sqrt(i);j++){
               if(i%j==0)
               {
                   System.out.println(i+"is not prime");
               }
               else
               {
                   System.out.println(i+"is prime");
               }
           }
        }
    }
}
*/
public class prime2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i + " is prime");
            } else {
                System.out.println(i + " is not prime");
            }
        }
    }
}