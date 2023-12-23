package Exercise20231223;


import java.util.Random;
import java.util.Scanner;

public class suijishu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int seed = scanner.nextInt();
            Random random = new Random(seed);

            //write your code here......
            System.out.println(random.nextInt(6)+1);


        }
    }

}
