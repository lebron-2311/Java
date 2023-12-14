package basicgrammer;

public class TestMethod {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println("main: a = " + a + " b = " + b);//main: a = 10 b = 20
        System.out.println("a和b还是原来的值，没有发生改变");
        System.out.println("实参a和b是main方法中的两个变量，其空间在main方法的栈(一块特殊的内存空间)中，" +
                "而形参x和y是swap方法中 的两个变量，x和y的空间在swap方法运行时的栈中，");
    }
    public static void swap(int x, int y) {
        int tmp = x;
        x = y;
        y = tmp;
        System.out.println("swap: x = " + x + " y = " + y);
        System.out.println("可以看到，在swap函数交换之后，形参x和y的值发生了改变");//swap: x = 20 y = 10
    }
}