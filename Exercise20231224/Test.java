package Exercise20231224;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double num = scanner.nextDouble();

        //write your code here......
        double juedui=Math.abs(num);
        System.out.println(juedui);
        double pingfanggen=Math.sqrt(num);
        System.out.println(pingfanggen);
        double log=Math.log(num);
        System.out.println(log);
        double cos=Math.cos(num);
        System.out.println(cos);

    }
}
