import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();
        int i=0;
        for(i=2;i <= Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                System.out.println(num+" is not prime");

            }
            else
            {
                System.out.println(num+" is prime");
            }
        }

    }
}
