package basicgrammer;

public class TestMethod1 {
    public static void main(String[] args) {
        int[] arr = {10, 20};
        swap(arr);
        System.out.println("arr[0] = " + arr[0] + " arr[1] = " + arr[1]);
        //arr[0] = 20 arr[1] = 10 传引用类型参数
    }
    public static void swap(int[] arr) { int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }
}