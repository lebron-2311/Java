package Exercise20231224;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        scanner.close();
        list.add(num1);
        list.add(num2);
        list.add(num3);
        list.add(num4);
        list.add(num5);
        System.out.print("普通for循环:");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //write your code here......


        System.out.println();
        System.out.print("增强for循环:");

        //write your code here......
        for (int i:list){
            System.out.print(i+" ");
        }
        System.out.println();


        System.out.println();
        System.out.print("迭代器遍历:");

        //write your code here......
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        System.out.println();
    }
}
