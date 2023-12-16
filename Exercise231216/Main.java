package Exercise231216;

import java.util.Scanner;
/*描述

已知接口Comparator，内部定义了max函数，用于返回两个整数中的最大值。请定义该接口的实现类，
使得main方法中的比较逻辑可以正确执行，要求实现类的名称为ComparatorImpl。
输入描述：

两个整数
输出描述：

两个整数中的最大值*/
public class Main {

    public static void main(String[] args) {
        Comparator comparator = new ComparatorImpl();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(comparator.max(x, y));
        }
    }

}

interface Comparator {
    /* 返回两个整数中的最大值*/
    int max(int x, int y);
}

//write your code here......
class ComparatorImpl implements Comparator{
    @Override
    public int max(int x, int y) {
        return x>y?x:y;
    }
}