package shuzu;

import java.util.Scanner;

class b{
    public static int  Sum(int []array){//静态代码后面可以不实例化直接调用其中的方法
        int sum1=0;
        for (int j=0;j<array.length;j++)
        {
            sum1+=array[j];

        }
        return sum1;
    }

}
public class sum {
    public static void main(String[] args) {
        int []array=new int[10];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            array[i]=scanner.nextInt();

        }
        int a=b.Sum(array);//静态代码直接调用方法，如果前面是非静态代码那必须要实例化对象
        System.out.println("Sum: "+a);
    }
}
