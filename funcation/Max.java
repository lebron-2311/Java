package funcation;
class A {
    public static int max2(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int max3(int max2, int c) {
        if (max2 > c) {
            return max2;
        } else {
            return c;
        }
    }
}

public class Max {
    public static void main(String[] args) {
        int result1 = A.max2(5, 10);
        int result2 = A.max3(result1, 3);
        System.out.println("最大值是: " + result2);
    }
}