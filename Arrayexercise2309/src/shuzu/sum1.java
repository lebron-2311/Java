package shuzu;

import java.util.Scanner;
//本段代码是帮助理解非静态代码要实例化对象
class c {
    public int Sum(int[] array) {
        int sum1 = 0;
        for (int j = 0; j < array.length; j++) {
            sum1 += array[j];
        }
        return sum1;
    }
}

public class sum1 {
    public static void main(String[] args) {
        int[] array = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            array[i] = scanner.nextInt();
        }

        c obj = new c();  // 实例化对象
        int sum = obj.Sum(array);  // 调用非静态方法
        System.out.println("Sum: " + sum);
    }
}